package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {

	@Test
	public void queSePuedanCargarLibrosALaBiblioteca() {
		Libro libro1 = new LibroGeografia(1,"xxx","yyyy");
		Libro libro2 = new LibroHistoria(2,"zzz","rrrr");
		Libro libro3 = new LibroMatematicas(3,"wwww","mmmm");
		Biblioteca biblioteca = new Biblioteca("Biblioteca de la nacion");
		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		
		assertEquals(3,biblioteca.getLibrosEnLaBiblioteca(),0.1);
	}
}
