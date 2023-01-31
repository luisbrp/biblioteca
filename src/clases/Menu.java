package clases;

import java.util.Scanner;

public class Menu {
	public static final int GESTIONAR_LIBRO = 1;
	public static final int GESTIONAR_SOCIO = 2;
	public static final int GESTIONAR_PRESTAMO = 3;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	public static final int VER_LIBROS = 4;
	
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int MODIFICAR_SOCIO = 3;
	public static final int VER_SOCIOS = 4;
	
	public static final int REALIZAR_PRESTAMO = 1;
	
	public static final int SALIR = 0;
	
	public static void menuPrincipal() {
		System.out.println(GESTIONAR_LIBRO +"Gestionar Libros");
		System.out.println(GESTIONAR_SOCIO +"Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMO +"Gestionar Prestamos");
	}
	
	public static void menuLibros() {
		System.out.println(INSERTAR_LIBRO + "Insertar Libro");
		System.out.println(ELIMINAR_LIBRO + "Eliminar Libro");
		System.out.println(VER_LIBROS +"Ver libros");
	}
	
	public static void menuSocios() {
		System.out.println(INSERTAR_SOCIO + "Insertar Socio");
		System.out.println(ELIMINAR_SOCIO + "Eliminar Socio");
		System.out.println(VER_SOCIOS + "Ver socios");
	}
	
	public static void menuPrestamos() {
		System.out.println(REALIZAR_PRESTAMO +"Realizar prestamo");
	}
}