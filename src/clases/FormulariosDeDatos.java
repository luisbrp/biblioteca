package clases;

import java.util.Scanner;
import java.util.Date;

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
		
		System.out.println("Introduce el titulo a cambiar del libro:");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor del libro:");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el numero de la pagina del libro:");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		Libro libro = new Libro();
		
		System.out.println("Introduce el id del libro");
		libro.setId(Integer.parseInt(scan.nextLine()));
		
		int id = libro.getId();
		
		return id;
	}
	
	public static Socio pedirDatosSocio(Scanner scan) {
		
		Socio socio = new Socio();
		
		System.out.println("Introduce el id del socio:");
		socio.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el nombre del socio:");
		socio.setNombre(scan.nextLine());
		
		System.out.println("Introduce el apellido del socio:");
		socio.setApellido(scan.nextLine());
		
		System.out.println("Introduce la direccion del socio:");
		socio.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la poblacion del socio:");
		socio.setPoblacion(scan.nextLine());
		
		System.out.println("Introduce la provincia del socio:");
		socio.setProvincia(scan.nextLine());
		
		System.out.println("Introduce el dni del socio:");
		socio.setId(Integer.parseInt(scan.nextLine()));
		
		return socio;
	}
	
		public static Socio modificarDatosSocio(Socio socio, Scanner scan) {
		
			System.out.println("Introduce el nombre a cambiar del socio:");
			socio.setNombre(scan.nextLine());
			
			System.out.println("Introduce el  apellido a cambiar del socio:");
			socio.setApellido(scan.nextLine());
			
			System.out.println("Introduce la  direccion del socio:");
			socio.setDireccion(scan.nextLine());
			
			System.out.println("Introduce la poblacion a cambiar del socio:");
			socio.setPoblacion(scan.nextLine());
			
			System.out.println("Introduce la provincia a cambiar del socio:");
			socio.setProvincia(scan.nextLine());
		
		return socio;
	}
		
		public static int pedirIdSocio(Scanner scan) {
			Socio socio = new Socio();
			
			System.out.println("Introduce el id del socio");
			socio.setId(Integer.parseInt(scan.nextLine()));
			
			int id = socio.getId();
			
			return id;
		}
		
		public static Prestamo getDatosDePrestamo(Scanner scan) {
			Prestamo prestamo = new Prestamo();
			System.out.println("Intdoduce un id de Libro");
			prestamo.setId_libro(Integer.parseInt(scan.nextLine()));

			System.out.println("Intdoduce un id de socio");
			prestamo.setId_socio(Integer.parseInt(scan.nextLine()));
			
			prestamo.setFecha(new Date()); 
			prestamo.setDevuelto(false); 
			return prestamo;
		}

}
