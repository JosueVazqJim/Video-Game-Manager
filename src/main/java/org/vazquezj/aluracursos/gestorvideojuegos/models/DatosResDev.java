package org.vazquezj.aluracursos.gestorvideojuegos.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosResDev(@JsonAlias("results") List<DatosDeveloper> developers) {
}
