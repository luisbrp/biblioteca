package clases;

import java.util.Scanner;

public class Menu {
	final static int GESTIONAR_LIBROS=1;
	final static int GESTIONAR_SOCIOS=2;
	final static int GESTIONAR_PRESTAMOS=3;
	
	final static int INSERTAR_LIBRO=1;
	final static int ELIMINAR_LIBRO=2;
	final static int MODIFICAR_LIBRO=3;
	final static int VER_LIBROS=4;

	final static int INSERTAR_SOCIO=1;
	final static int ELIMINAR_SOCIO=2;
	final static int MODIFICAR_SOCIO=3;
	final static int VER_SOCIOS=4;
	
	
	final static int REALIZAR_PRESTAMO=1;
	
	final static int SALIR=0;
	
	public static void mostrarMenuPrincipal() {
		System.out.println(GESTIONAR_LIBROS +". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS +". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS +" .Gestionar Prestamos");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println(INSERTAR_LIBRO + ". Insertar Libro");
		System.out.println(ELIMINAR_LIBRO + ". Eliminar Libro");
		System.out.println(MODIFICAR_LIBRO + ". Modificar Libro");
		System.out.println(VER_LIBROS +". Ver libros");
	}
	
	public static void mostrarMenuSocios() {
		System.out.println(INSERTAR_SOCIO + ". Insertar Socio");
		System.out.println(ELIMINAR_SOCIO + ". Eliminar Socio");
		System.out.println(MODIFICAR_SOCIO + ". Modificar Socio");
		System.out.println(VER_SOCIOS + ". Ver socios");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println(REALIZAR_PRESTAMO +". Realizar prestamo");
	}
}