package org.vazquezj.aluracursos.gestorvideojuegos.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosGenre(@JsonAlias("id") Long id, @JsonAlias("name") String name) {
}
