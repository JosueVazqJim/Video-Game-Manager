package org.vazquezj.aluracursos.gestorvideojuegos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vazquezj.aluracursos.gestorvideojuegos.main.MainMenu;
import org.vazquezj.aluracursos.gestorvideojuegos.repository.DeveloperRepository;

@SpringBootApplication
public class GestorvideojuegosApplication implements CommandLineRunner {

	@Autowired
	private DeveloperRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(GestorvideojuegosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainMenu menu = new MainMenu(repository);
		menu.muestraElMenu();
	}
}
