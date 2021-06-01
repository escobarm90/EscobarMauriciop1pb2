package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
	
	private Set<Libro> libros;
	private String nombre;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros= new HashSet<Libro>();
	}
	
	public Boolean agregarLibro(Libro libro) {
		return libros.add(libro);
	}
	
	public Integer getLibrosEnLaBiblioteca() {
		return libros.size();
	}

}