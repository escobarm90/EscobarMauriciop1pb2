package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Fotocopiable;

public class LibroGeografia extends Libro implements Fotocopiable{

	public LibroGeografia(Integer codigo, String autor, String nombre) {
		super(codigo, autor, nombre);
		
	}
	

	public String fotocopiar(Libro libro) {
		return "Este libro esta siendo fotocopiado";
	}

}
