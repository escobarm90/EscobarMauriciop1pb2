package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;


public class Biblioteca {
	
	private Set<Prestamo> prestamos;
	private Set<Libro> libros;
	private String nombre;
	private Integer cantidadDePrestamos = 0;
	private Prestamo prestamo;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros= new HashSet<Libro>();
		this.prestamos= new HashSet<Prestamo>();
	}
	
	public Boolean agregarLibro(Libro libro) {
		return libros.add(libro);
	}
	
	public Integer getLibrosEnLaBiblioteca() {
		return libros.size();
	}
	
	public Libro buscarLibroPorId(Integer id) {
		Libro librobuscado = null;
		for(Libro libro :libros) {
			if(libro.getCodigo().equals(id)) {
				librobuscado=libro;
			}
		}
		return librobuscado;
	}
	
	public String fotocopiarLibroPorCodigo(Integer cod) {
		return buscarLibroPorId(cod).fotocopiar();
	}
	
	public Boolean prestarLibro(Libro libro, Estudiante estudiante) {		
		if(libros.contains(libro) && estudiante.getCantidadDeLibrosPrestados()<2) {
			cantidadDePrestamos++;			
			this.prestamo = new Prestamo(cantidadDePrestamos,estudiante,libro);
			libros.remove(libro);
			return true;
		}return false;
	}
	
	

}
