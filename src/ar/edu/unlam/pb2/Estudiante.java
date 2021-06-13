package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {

	private Integer dni;
	private String nombre;
	private String apellido;
	private Set<Prestamo> prestamos;
	
	
	public Estudiante(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.prestamos= new HashSet<Prestamo>();
		
	}

	public Integer getCantidadDeLibrosPrestados() {
		return prestamos.size();
	}
	
	public void getPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
	
	public Libro devolverPrestamo(Prestamo prestamo) {
		prestamos.remove(prestamo);
		return prestamo.getLibro();
	}
	
	
	
	
}
