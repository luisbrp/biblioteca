package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	
	public void run () throws SQLException {
		int opcion;
		GestorLibros gl = new GestorLibros();
		GestorSocios gs = new GestorSocios();
		do {
			System.out.println("------MENU-------");
			Menu.mostrarMenuPrincipal();
			Scanner scan =  new Scanner(System.in);
			opcion=Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				gl.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				
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
