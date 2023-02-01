package main;

import java.sql.SQLException;

import clases.GestorBiblioteca;

public class PrincipalBiblioteca {

	public static void main(String[] args) throws SQLException {
		
		GestorBiblioteca gb = new GestorBiblioteca();
		gb.run();

	}

}
