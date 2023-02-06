package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorPrestamos {
	
	public static void run(Scanner scan) throws SQLException {

		int opcion;
		GestorBBDD gbd = new GestorBBDD();
		Prestamo prestamo = new Prestamo();
		do {
			System.out.println("------MENU GESTOR PRESTAMOS------");
			Menu.mostrarMenuPrestamos();
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				prestamo = FormulariosDeDatos.getDatosDePrestamo(scan);
				gbd.conectar();
				gbd.insertPrestamo(prestamo);
				gbd.cerrar();

				break;
			case Menu.DEVOLVER_LIBRO:
				int idLibro = FormulariosDeDatos.pedirIdLibro(scan);
				gbd.conectar();
				gbd.devolverLibro(idLibro);
				gbd.cerrar();
				
				break;

			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcion != Menu.SALIR);
	}

}


