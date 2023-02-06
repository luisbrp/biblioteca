package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
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
		
		System.out.println("El socio se ha introducido con exito!");
	}
	
	public void eliminarSocio (int id) throws SQLException {
	
		preparedSt = con.prepareStatement("DELETE FROM socios WHERE id=? ;");

		preparedSt.setInt(1, id);
		
		preparedSt.execute();
		
		System.out.println("El socio se ha sido eliminado con exito!");
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
		
		System.out.println("El socio se ha sido modificado con exito!");
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
	
	public ArrayList<Socio> getSocios() throws SQLException{
		
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		preparedSt = con.prepareStatement("SELECT * FROM socios");

		ResultSet resultado = preparedSt.executeQuery();
		
		while(resultado.next()) {
			
			Socio socio = new Socio();
			
			socio.setId(resultado.getInt(1));
			socio.setNombre(resultado.getString(2));
			socio.setApellido(resultado.getString(3));
			socio.setDireccion(resultado.getString(4));
			socio.setPoblacion(resultado.getString(5));
			socio.setProvincia(resultado.getString(6));
			socio.setDni(resultado.getInt(7));
			
			socios.add(socio);
			
		}

		return socios;
		
	}
	
	public void insertPrestamo(Prestamo prestamo) throws SQLException {


			preparedSt = con.prepareStatement("INSERT INTO prestamos(id_libro, id_socio, fecha, devuelto) VALUES (?, ?,?,?)");
			preparedSt.setInt(1, prestamo.getId_libro());
			preparedSt.setInt(2, prestamo.getId_socio());
			
		
			preparedSt.setDate(3, new java.sql.Date(prestamo.getFecha().getTime()));
			preparedSt.setBoolean(4, prestamo.getDevuelto());
			
			preparedSt.execute();

		System.out.println("El prestamo se ha realizado con exito!");
	}

	
	
	public void devolverLibro(int idLibro) throws SQLException {
		
			Prestamo prestamo = prestamoNoDevuelto(idLibro);
	
			preparedSt= con.prepareStatement("UPDATE prestamos SET devuelto=true WHERE id_libro =? and id_socio=? and fecha=?");
			preparedSt.setInt(1, prestamo.getId_libro());
			preparedSt.setInt(2, prestamo.getId_socio());
			preparedSt.setDate(3,(java.sql.Date) new Date(prestamo.getFecha().getTime()));
			preparedSt.execute();
		
		System.out.println("El libro se ha sido devuelto con exito!");
	}

	
	private Prestamo prestamoNoDevuelto(int idLibro) throws SQLException {
		
			Prestamo prestamo = new Prestamo();
	
			preparedSt = con.prepareStatement("select * from prestamos where id_libro = ? and devuelto = false;");
			preparedSt.setInt(1, idLibro);
			ResultSet resultado = preparedSt.executeQuery();
			if(resultado.next()) {
				prestamo.setId_libro(idLibro);
				prestamo.setId_socio(resultado.getInt("id_socio"));
				prestamo.setFecha(resultado.getDate("fecha"));
				prestamo.setDevuelto(resultado.getBoolean("devuelto"));
				
			}
			
			return prestamo;

	}

	
}
