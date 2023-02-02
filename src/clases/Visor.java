package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Visor {
	
	
	public static void mostrarLibros(ArrayList<Libro> libros) {
		
			System.out.println("Lista de libros:");
			for (int i = 0; i < libros.size(); i++) {
				Libro libro = libros.get(i);
				System.out.println(libro.toString());
				
			}
		
	}
	
	public static void mostrarLibro(Libro libro) {
		
	}
	
	public static void mostrarMensaje(String mensaje) {
		
	}
	
}
