package org.vazquezj.aluracursos.gestorvideojuegos.main;

import org.vazquezj.aluracursos.gestorvideojuegos.models.*;
import org.vazquezj.aluracursos.gestorvideojuegos.repository.DeveloperRepository;
import org.vazquezj.aluracursos.gestorvideojuegos.service.ConsumoAPI;
import org.vazquezj.aluracursos.gestorvideojuegos.service.ConvierteDatos;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainMenu {
	private Scanner scanner = new Scanner(System.in);
	private ConsumoAPI consumoAPI = new ConsumoAPI();
	private final String URL = "https://api.rawg.io/api/";
	private final String API_KEY = "&key=YOUR_API_KEY";
	private ConvierteDatos conversor = new ConvierteDatos();
	private DeveloperRepository repository;

	public MainMenu(DeveloperRepository repository) {
		this.repository = repository;
	}

	public void muestraElMenu() {
		var opcion = -1;
		while (opcion != 0) {
			var menu = """
                    1 - Buscar desarrollador 
                    2 - Buscar videojuegos
                    3 - Mostrar desarrolladores buscados
                    4 - Mostrar videojuegos por desarrollador
                                  
                    0 - Salir
                    """;
			System.out.println(menu);
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
				case 1:
					buscarDeveloperWeb();
					break;
				case 2:
					buscarVideojuego();
					break;
				case 3:
					mostrarDevelopersBuscados();
					break;
				case 4:
					buscarGamesPorDev();
					break;
				case 0:
					System.out.println("Cerrando la aplicación...");
					break;
				default:
					System.out.println("Opción inválida");
			}
		}

	}

	public void buscarDeveloperWeb() {
		System.out.println("Ingrese el nombre del desarrollador: ");
		var nombreDev = scanner.nextLine();

		//primero buscamos en la bd
		Optional<Developer> devbuscado = repository.findByNameContainsIgnoreCase(nombreDev);

		if (devbuscado.isPresent()) {
			System.out.println("Desarrollador encontrado en la base de datos");
			System.out.println(devbuscado.get());
		} else {
			System.out.println("Desarrollador no encontrado en la base de datos, buscando en la API...");
			DatosDeveloper datosDev = getDatosDev(nombreDev);

			//ahora traemos los DatosGame de los juegos del desarrollador
			List<DatosGame> datosGames = datosDev.topGames().stream()
					.map(gameId -> getDatosGame(gameId))
					.collect(Collectors.toList());

			Developer developer = new Developer(datosDev);
			List<Game> topGames = datosGames.stream()
					.map(game -> new Game(game))
					.collect(Collectors.toList());

			developer.setTopGames(topGames);
			repository.save(developer);
			System.out.println("Desarrollador guardado en la base de datos");
			System.out.println(developer);
		}
	}

	public void buscarVideojuego() {
		System.out.println("Ingrese el nombre del videojuego: ");
		var nombreGame = scanner.nextLine();

		List<Game> games = repository.gamePorName(nombreGame);
		games.forEach(g -> System.out.println(g.getName()));
	}

	public void buscarGamesPorDev() {
		System.out.println("Ingrese el nombre del desarrollador: ");
		var nombreDev = scanner.nextLine();

		Optional<Developer> devbuscado = repository.findByNameContainsIgnoreCase(nombreDev);

		if (devbuscado.isPresent()) {
			List<Game> games = repository.buscarGamesPorDeveloper(devbuscado.get());
			games.forEach(g -> System.out.println(g.getName()));
		} else {
			System.out.println("Desarrollador no encontrado en la base de datos");
		}

	}

	private DatosDeveloper getDatosDev(String nombreDev) {
		String encodedNombreDev;
		try {
			encodedNombreDev = URLEncoder.encode(nombreDev, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Error al codificar el nombre del desarrollador", e);
		}

		var json = consumoAPI.obtenerDatos(URL + "developers?search=" + encodedNombreDev + API_KEY + "&page_size=1");
		DatosResDev datos = conversor.parseoDatos(json, DatosResDev.class);

		if (datos.developers().isEmpty()) {
			throw new RuntimeException("No se encontró el desarrollador"); // No se encontró el desarrollador por lo que se lanza una excepción y se termina la ejecución
		} else {
			return datos.developers().get(0);
		}
	}

	private DatosGame getDatosGame(int id) {
		var json = consumoAPI.obtenerDatos(URL + "games/" + id + "?" + API_KEY);
		DatosGame datos = conversor.parseoDatos(json, DatosGame.class);
		return datos;
	}

	private void mostrarDevelopersBuscados() {
		repository.findAll().forEach(System.out::println);
	}
}
