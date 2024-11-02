package org.vazquezj.aluracursos.gestorvideojuegos.models;

public enum Genero {
	ACCION("Action", "Acción"),
	AVENTURA("Adventure", "Aventura"),
	CASUAL("Casual", "Casual"),
	INDIE("Indie", "Indie"),
	MULTIJUGADOR("Multiplayer", "Multijugador"),
	CARRERAS("Racing", "Carreras"),
	RPG("RPG", "role-playing-games-rpg"),
	DISPAROS("Shooter", "Disparos"),
	SIMULACION("Simulation", "Simulación"),
	DEPORTES("Sports", "Deportes"),
	ESTRATEGIA("Strategy", "Estrategia"),
	ARCADE("Arcade", "Arcade"),
	PLATAFORMAS("Platformer", "Plataformas"),
	ACERTIJOS("Puzzle", "Acertijos");

	private String genreRAWIO;
	private String genreEspaniol;

	Genero(String genreRAWIO, String genreEspaniol) {
		this.genreRAWIO = genreRAWIO;
		this.genreEspaniol = genreEspaniol;
	}

	public static Genero fromString(String genre) {
		for (Genero g : Genero.values()) {
			if (g.genreRAWIO.equalsIgnoreCase(genre)) {
				return g;
			}
		}
		throw new IllegalArgumentException("Genero no encontrado" + genre);
	}

	public static Genero fromEspaniol(String genre) {
		for (Genero g : Genero.values()) {
			if (g.genreEspaniol.equalsIgnoreCase(genre)) {
				return g;
			}
		}
		throw new IllegalArgumentException("Genero no encontrado" + genre);
	}
}
