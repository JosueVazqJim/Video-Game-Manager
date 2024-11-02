package org.vazquezj.aluracursos.gestorvideojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.vazquezj.aluracursos.gestorvideojuegos.models.Developer;
import org.vazquezj.aluracursos.gestorvideojuegos.models.Game;

import java.util.List;
import java.util.Optional;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

	Optional<Developer> findByNameContainsIgnoreCase(String name);

	@Query("SELECT g FROM Developer d join d.topGames g where g.name ILIKE %:name%")
	List<Game> gamePorName(String name);

	@Query("SELECT g FROM Developer d join d.topGames g where d = :developer")
	List<Game> buscarGamesPorDeveloper(Developer developer);

}
