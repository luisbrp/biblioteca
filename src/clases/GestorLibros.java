package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public void run(Scanner scan) throws SQLException {
		int opcion;
		Libro libro = new Libro();
		GestorBBDD gbd = new GestorBBDD();
		
		do {
			Menu.mostrarMenuLibros();
			opcion=Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				System.out.println("Insertar libro");
				libro = FormulariosDeDatos.pedirDatosLibro(scan);
				gbd = new GestorBBDD();
				gbd.conectar();
				gbd.insertarLibro(libro);
				gbd.cerrar();
				break;
			case Menu.ELIMINAR_LIBRO:
				System.out.println("Eliminar libro");
				int id = FormulariosDeDatos.pedirIdLibro(scan);
				gbd.conectar();
				gbd.eliminarLibro(id);
				gbd.cerrar();
				break;
			case Menu.VER_LIBROS:
				
				break;
			case Menu.SALIR:
				System.out.println("Bye!!!");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion != Menu.SALIR);
	}
}
