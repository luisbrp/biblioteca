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
	
	public static void mostrarSocios(ArrayList<Socio> socios) {
		
		System.out.println("Lista de socios:");
		for (int i = 0; i < socios.size(); i++) {
		Socio socio = socios.get(i);
			System.out.println(socio.toString());
			
		}
	}
	
	public static void mostrarSocio(Socio socio) {
		
	}
	
}
