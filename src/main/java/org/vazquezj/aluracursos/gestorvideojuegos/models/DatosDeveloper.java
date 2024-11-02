package org.vazquezj.aluracursos.gestorvideojuegos.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

//servira como DTO cuando se traiga la info json de la api hacia un intermedio antes de guardar en la base de datos
public record DatosDeveloper(@JsonAlias("id") Long id, @JsonAlias("name") String name,
                             @JsonAlias("image_background") String image_background, @JsonAlias("score") String score,
                             @JsonAlias("top_games") List<Integer> topGames) {
}
