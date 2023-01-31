package clases;

import java.util.Scanner;

public class FormulariosDeDatos {
	
	public static Libro pedirDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		
		System.out.println("Introduce el id del libro:");
		libro.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el titulo del libro:");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor del libro:");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el numero de la pagina del libro:");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		
		System.out.println("Introduce el id del libro:");

		libro.setId(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		Libro libro = new Libro();
		
		System.out.println("Introduce el id del libro");
		libro.setId(Integer.parseInt(scan.nextLine()));
		
		int id = libro.getId();
		
		return id;
	}
}
