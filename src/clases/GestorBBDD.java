package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Conector {
	
	PreparedStatement preparedSt;
	
	public void insertarLibro (Libro libro) throws SQLException  {

		preparedSt = con.prepareStatement("INSERT INTO  libros ( id, titulo, autor, num_pag) VALUES (?,?,?,?);");

		preparedSt.setInt(1, libro.getId());
		preparedSt.setString(2, libro.getTitulo());
		preparedSt.setString(3, libro.getAutor());
		preparedSt.setInt(4, libro.getNum_pag());
		
		preparedSt.execute();
		
		System.out.println("El libro se ha introducido con  exito!");
	}
	
	public void eliminarLibro (int id) throws SQLException {
		
		preparedSt = con.prepareStatement("DELETE FROM libros WHERE id=?");
		
		preparedSt.setInt(1, id);
		
		preparedSt.execute();
		
		System.out.println("El libro se ha eliminado con  exito!");
		
	}
	
	public Libro getLibro (int id) throws SQLException  {
		
		preparedSt = con.prepareStatement("SELECT * FROM libros WHERE id = ? ");
		
		Libro libro = new Libro();
		
		preparedSt.setInt(1, id);
		
		ResultSet resultado = preparedSt.executeQuery();
		
		if (resultado.next()) {
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
		}
		
		return libro;
		
	}
	
	public ArrayList<Libro> getLibros() throws SQLException{
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		preparedSt = con.prepareStatement("SELECT * FROM libros");

		ResultSet resultado = preparedSt.executeQuery();
		
		while(resultado.next()) {
			
			Libro libro = new Libro();
			
			libro.setId(resultado.getInt(1));
			libro.setTitulo(resultado.getString(2));
			libro.setAutor(resultado.getString(3));
			libro.setNum_pag(resultado.getInt(4));
			
			libros.add(libro);
			
		}

		return libros;
		
	}
	
	public void modificarLibro(Libro libro) throws SQLException {
		
		preparedSt = con.prepareStatement("UPDATE libros SET titulo=?, autor=?, num_pag=? WHERE id=?");
		
		preparedSt.setString(1,libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNum_pag());
		preparedSt.setInt(4, libro.getId());
		preparedSt.executeUpdate();
		
		System.out.println("El libro se ha modificado con  exito!");
		
	}
	
	public void insertarSocio(Socio socio) throws SQLException {
		
		preparedSt = con.prepareStatement("INSERT INTO  socios ( id, nombre, apellido, direccion, poblacion, "
		+ "provincia, dni) VALUES (?,?,?,?,?,?,?);");

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
	
		preparedSt = con.prepareStatement("DELETE FROM socios WHERE id = ? ;");

		preparedSt.setInt(1, id);
		preparedSt.execute();
	}
	
	public void modificarSocio(Socio socio) throws SQLException {
		
		preparedSt = con.prepareStatement("UPDATE socios SET id= (?),nombre= (?),apellido= (?),direccion= (?),"
		+ "poblacion = (?),provincia = (?),dni =  WHERE id = (?);");
		
		preparedSt.setInt(1, socio.getId());
		preparedSt.setString(2, socio.getNombre());
		preparedSt.setString(3, socio.getApellido());
		preparedSt.setString(4, socio.getDireccion());
		preparedSt.setString(5, socio.getPoblacion());
		preparedSt.setString(6, socio.getProvincia());
		preparedSt.setInt(7, socio.getDni());
		
		preparedSt.execute();
	}
	
	public Socio getSocio (int id) throws SQLException  {
		
		
		preparedSt = con.prepareStatement("SELECT * FROM socios WHERE id = ? ");
		
		Socio socio = new Socio();
		
		preparedSt.setInt(1, id);
		ResultSet resultado = preparedSt.executeQuery();
		
		if (resultado.next()) {
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getInt("dni"));
		}
		
		return socio;
		
	}
	
}
