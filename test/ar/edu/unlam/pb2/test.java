package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
	
	@Test
	public void queSoloUnLibroFotocopiableSePuedaFotocopiar() {
		Libro libro1 = new LibroGeografia(1,"xxx","yyyy");
		Libro libro2 = new LibroHistoria(2,"zzz","rrrr");
		Libro libro3 = new LibroMatematicas(3,"wwww","mmmm");
		
		assertEquals("Este libro esta siendo fotocopiado",libro1.fotocopiar());
		assertEquals("Este libro esta siendo fotocopiado",libro2.fotocopiar());
		assertEquals("",libro3.fotocopiar());
	}
	
	@Test
	public void queUnaBibliotecaPuedaFotocopiarUnLibro() {
		Libro libro1 = new LibroGeografia(1,"xxx","yyyy");
		Biblioteca biblioteca = new Biblioteca("Biblioteca de la nacion");
		biblioteca.agregarLibro(libro1);
		
		assertEquals("Este libro esta siendo fotocopiado",biblioteca.fotocopiarLibroPorCodigo(1));
		
	}
	
	@Test
	public void queSePuedaBuscarUnLibroPorId() {
		Libro libro1 = new LibroGeografia(1,"xxx","yyyy");
		Libro libro2 = new LibroHistoria(2,"zzz","rrrr");
		Libro libro3 = new LibroMatematicas(3,"wwww","mmmm");
		Biblioteca biblioteca = new Biblioteca("Biblioteca de la nacion");
		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		
		assertEquals(libro1,biblioteca.buscarLibroPorId(1));
	}
	
	
	
}
