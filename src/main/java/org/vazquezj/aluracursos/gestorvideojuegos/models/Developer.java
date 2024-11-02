package org.vazquezj.aluracursos.gestorvideojuegos.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "developers")
public class Developer {
	@Id
	private Long id;
	private String name;
	private String image_background;
	private Double score;
	@OneToMany(mappedBy = "developer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Game> topGames;

	public Developer() {
	}

	public Developer(DatosDeveloper datosDeveloper) {
		this.id = datosDeveloper.id();
		this.name = datosDeveloper.name();
		this.image_background = datosDeveloper.image_background();
		this.score = Double.parseDouble(datosDeveloper.score());
	}

	public void setTopGames(List<Game> topGames) {
		topGames.forEach(game -> game.setDeveloper(this));
		this.topGames = topGames;
	}

	@Override
	public String toString() {
		return "Developer class{" +
				"id=" + id +
				", name='" + name + '\'' +
				", image_background='" + image_background + '\'' +
				", score=" + score +
				'}';
	}
}
