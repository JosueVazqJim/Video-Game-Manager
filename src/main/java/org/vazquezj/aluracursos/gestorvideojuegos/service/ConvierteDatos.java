package org.vazquezj.aluracursos.gestorvideojuegos.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
	private ObjectMapper objectMapper = new ObjectMapper();
	//el ObjectMapper es una clase de la libreria jackson que permite convertir un json a un objeto de cualquier tipo

	@Override
	public <T> T parseoDatos(String json, Class<T> clase) {
		try {
			return objectMapper.readValue(json,clase);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
