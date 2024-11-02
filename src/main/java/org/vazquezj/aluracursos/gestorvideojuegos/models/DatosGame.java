package org.vazquezj.aluracursos.gestorvideojuegos.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosGame(@JsonAlias("id") Long id, @JsonAlias("name") String name,
                        @JsonAlias("description_raw") String description_raw, @JsonAlias("rating") Double rating,
                        @JsonAlias("released") String released,
                        @JsonAlias("playtime") Integer playtime,
                        @JsonAlias("genres") List<DatosGenre> genres) {
}
