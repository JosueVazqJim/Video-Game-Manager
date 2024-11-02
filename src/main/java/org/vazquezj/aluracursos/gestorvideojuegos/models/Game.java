package org.vazquezj.aluracursos.gestorvideojuegos.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@Entity
@Table(name = "games")
public class Game {
	@Id
	private Long id;
	private String name;
	@Column(columnDefinition = "TEXT")
	private String description_raw;
	private Double rating;
	private LocalDate released;
	private Integer playtime;
	@Enumerated(EnumType.STRING)
	private Genero genre;
	@ManyToOne
	private Developer developer;

	public Game() {
	}

	public Game(DatosGame datosGame) {
		this.id = datosGame.id();
		this.name = datosGame.name();
		this.description_raw = datosGame.description_raw();
		this.rating = datosGame.rating();
		try{
			this.released = LocalDate.parse(datosGame.released()); //hacemos el parseo de la fecha de String a LocalDate
		} catch (DateTimeParseException e){
			this.released = null;
		}
		this.playtime = datosGame.playtime();
		this.genre = Genero.fromString(datosGame.genres().get(0).name());
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Game class{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description_raw='" + description_raw + '\'' +
				", rating=" + rating +
				", released=" + released +
				", playtime=" + playtime +
				", genre=" + genre +
				'}';
	}
}
