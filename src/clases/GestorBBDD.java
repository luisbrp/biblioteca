package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector {
	
	
	public void insertarLibro (Libro libro) throws SQLException  {

		PreparedStatement preparedSt = con.prepareStatement("INSERT INTO  libros ( id, titulo, autor, num_pag) VALUES (?,?,?,?);");

		preparedSt.setInt(1, libro.getId());
		preparedSt.setString(2, libro.getTitulo());
		preparedSt.setString(3, libro.getAutor());
		preparedSt.setInt(4, libro.getNum_pag());
		
		preparedSt.execute();
	}
	
	public void eliminarLibro (int id) throws SQLException {
		
		Libro libro = new Libro();
	
		PreparedStatement preparedStel = con.prepareStatement("DELETE FROM libros WHERE id = ? ;");

		preparedStel.setInt(1, libro.getId());
		preparedStel.execute();
	}
	
	public Libro getLibro (int id) throws SQLException  {
		
		String sentenciaSelect = "SELECT * FROM libros WHERE id = ? ";
		PreparedStatement preparedSt = con.prepareStatement(sentenciaSelect);
		
		Libro libro = new Libro();
		
		preparedSt.setInt(1, libro.getId());
		ResultSet resultado = preparedSt.executeQuery();
		
		if (resultado.next()) {
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getNString("titulo"));
			libro.setAutor(resultado.getNString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
		}
		
		return libro;
		
	}
	
	public void modificarLibro(Libro libro) throws SQLException {
		
		PreparedStatement preparedStModify = con.prepareStatement("UPDATE libros SET id= (?),titulo= (?),autor= (?),num_pag= WHERE id = (?);");
		
		preparedStModify.setInt(1, libro.getId());
		preparedStModify.setString(2, libro.getTitulo());
		preparedStModify.setString(3, libro.getAutor());
		preparedStModify.setInt(4, libro.getNum_pag());
		
		preparedStModify.execute();
	}
}
