package com.midominio.examen.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantidad;
	private static List<Libro> listaLibros = generaLibro();
	
    
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static void setListaLibros(List<Libro> listaLibros) {
		Libro.listaLibros = listaLibros;
	}

	public Libro(String titulo, String autor, Genero genero, int cantidad) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.cantidad = cantidad;
	}
	
	public static List<Libro> getListaLibros() {
		return listaLibros;
	}
	
	private static List<Libro> generaLibro(){
		List<Libro> listaLibros = new ArrayList<>();
		List<Libro> libros= new ArrayList<>();	
		Random random = new Random();
		
		// Agregar 25 libros de la literatura española a la lista
				listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Rayuela", "Julio Cortázar", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La familia de Pascual Duarte", "Camilo José Cela", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Platero y yo", "Juan Ramón Jiménez", Genero.POESIA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Veinte poemas de amor y una canción desesperada", "Pablo Neruda", Genero.POESIA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Soledades, galerías y otros poemas", "Antonio Machado", Genero.POESIA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Bodas de sangre", "Federico García Lorca", Genero.DRAMA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La casa de Bernarda Alba", "Federico García Lorca", Genero.DRAMA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Niebla", "Miguel de Unamuno", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La Regenta", "Leopoldo Alas Clarín", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("El túnel", "Ernesto Sabato", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La ciudad de los prodigios", "Eduardo Mendoza", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La colmena", "Camilo José Cela", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Luces de bohemia", "Ramón María del Valle-Inclán", Genero.DRAMA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Fortunata y Jacinta", "Benito Pérez Galdós", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("El ingenioso hidalgo don Quijote de la Mancha", "Miguel de Cervantes", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Los detectives salvajes", "Roberto Bolaño", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Pedro Páramo", "Juan Rulfo", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Poeta en Nueva York", "Federico García Lorca", Genero.POESIA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("El laberinto de las aceitunas", "Eduardo Mendoza", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("Los miserables", "Víctor Hugo", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", Genero.NOVELA, random.nextInt(10, 100)));
				listaLibros.add(new Libro("La vida es sueño", "Pedro Calderón de la Barca", Genero.DRAMA, random.nextInt(10, 100)));
				
				return listaLibros;
	}
	
}
