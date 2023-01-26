package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection cn;
	
	public void Conectar() {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost/biblioteca";
				cn = (Connection) DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void cerrar() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
