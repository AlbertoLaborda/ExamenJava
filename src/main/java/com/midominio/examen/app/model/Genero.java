package com.midominio.examen.app.model;

public enum Genero {
	NOVELA("novela"), POESIA("poesía"), DRAMA("drama"), ENSAYO("ensayo"), CUENTO("cuento");
	
	private String descripcion;

	private Genero(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}