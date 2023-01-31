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
	
	public void insertarSocio(Socio socio) throws SQLException {
		PreparedStatement preparedSt = con.prepareStatement("INSERT INTO  socios ( id, nombre, apellido, direccion, poblacion, provincia, dni) VALUES (?,?,?,?,?,?,?);");

		preparedSt.setInt(1, socio.getId());
		preparedSt.setString(2, socio.getNombre());
		preparedSt.setString(3, socio.getApellido());
		preparedSt.setString(4, socio.getDireccion());
		preparedSt.setString(5, socio.getPoblacion());
		preparedSt.setString(6, socio.getProvincia());
		preparedSt.setInt(7, socio.getDni());
		
		preparedSt.execute();
	}
	
	public void eliminarSocio (int id) throws SQLException {
		
		Socio socio = new Socio();
	
		PreparedStatement preparedStel = con.prepareStatement("DELETE FROM socios WHERE id = ? ;");

		preparedStel.setInt(1, socio.getId());
		preparedStel.execute();
	}
	
	public void modificarSocio(Socio socio) throws SQLException {
		
		PreparedStatement preparedStModify = con.prepareStatement("UPDATE socios SET id= (?),nombre= (?),apellido= (?),direccion= (?),"
		+ "poblacion = (?),provincia = (?),dni =  WHERE id = (?);");
		
		preparedStModify.setInt(1, socio.getId());
		preparedStModify.setString(2, socio.getNombre());
		preparedStModify.setString(3, socio.getApellido());
		preparedStModify.setString(4, socio.getDireccion());
		preparedStModify.setString(5, socio.getPoblacion());
		preparedStModify.setString(6, socio.getProvincia());
		preparedStModify.setInt(7, socio.getDni());
		
		preparedStModify.execute();
	}
	
	public Socio getSocio (int id) throws SQLException  {
		
		String sentenciaSelect = "SELECT * FROM socios WHERE id = ? ";
		PreparedStatement preparedSt = con.prepareStatement(sentenciaSelect);
		
		Socio socio = new Socio();
		
		preparedSt.setInt(1, socio.getId());
		ResultSet resultado = preparedSt.executeQuery();
		
		if (resultado.next()) {
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getNString("nombre"));
			socio.setApellido(resultado.getNString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getNString("poblacion"));
			socio.setProvincia(resultado.getNString("provincia"));
			socio.setDni(resultado.getInt("dni"));
		}
		
		return socio;
		
	}
	
}
