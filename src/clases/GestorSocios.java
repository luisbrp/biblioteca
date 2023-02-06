package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorSocios {

	public void run(Scanner scan) throws SQLException {
		int opcion;
		Socio socio = new Socio();
		Visor visor = new Visor();
		ArrayList<Socio> socios = new ArrayList<Socio>();
		GestorBBDD gbd = new GestorBBDD();
		
		do {
			System.out.println("------MENU GESTOR SOCIO-------");
			Menu.mostrarMenuSocios();
			opcion=Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				socio = FormulariosDeDatos.pedirDatosSocio(scan);
				gbd.conectar();
				gbd.insertarSocio(socio);
				gbd.cerrar();
				break;
			case Menu.ELIMINAR_SOCIO:
				int id = FormulariosDeDatos.pedirIdSocio(scan);
				gbd.conectar();
				gbd.eliminarSocio(id);
				gbd.cerrar();
				break;
			case Menu.MODIFICAR_SOCIO:
				socio = FormulariosDeDatos.modificarDatosSocio(socio, scan);
				gbd.conectar();
				gbd.modificarSocio(socio);;
				gbd.cerrar();
				break;
			case Menu.VER_LIBROS:
				gbd.conectar();
				socios = gbd.getSocios();
				Visor.mostrarSocios(socios);
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
