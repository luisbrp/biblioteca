package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibros {

	public void run(Scanner scan) throws SQLException {
		int opcion;
		Libro libro = new Libro();
		Visor visor = new Visor();
		ArrayList<Libro> libros = new ArrayList<Libro>();
		GestorBBDD gbd = new GestorBBDD();
		
		do {
			System.out.println("------MENU GESTOR LIBRO-------");
			Menu.mostrarMenuLibros();
			opcion=Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				libro = FormulariosDeDatos.pedirDatosLibro(scan);
				gbd.conectar();
				gbd.insertarLibro(libro);
				gbd.cerrar();
				break;
			case Menu.ELIMINAR_LIBRO:
				int id = FormulariosDeDatos.pedirIdLibro(scan);
				gbd.conectar();
				gbd.eliminarLibro(id);
				gbd.cerrar();
				break;
			case Menu.MODIFICAR_LIBRO:
				libro = FormulariosDeDatos.modificarDatosLibro(libro, scan);
				gbd.conectar();
				gbd.modificarLibro(libro);
				gbd.cerrar();
				break;
			case Menu.VER_LIBROS:
				gbd.conectar();
				libros = gbd.getLibros();
				Visor.mostrarLibros(libros);
				gbd.cerrar();
				break;
			case Menu.SALIR:
				
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion != Menu.SALIR);
	}
}
