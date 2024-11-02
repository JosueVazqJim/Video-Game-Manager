package org.vazquezj.aluracursos.gestorvideojuegos.service;

//interface con metodos para convertir datos dado que a partir de un json se puede obtener un objeto de cualquier tipo
public interface IConvierteDatos {
	<T> T parseoDatos(String json, Class<T> clase);
}
