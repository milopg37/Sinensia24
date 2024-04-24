package semana3.empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que gestiona la conexion a la DB
 */
public class Conexion {

	private static Connection conn = null;

	public static Connection getConnection() {

		if (conn == null) {
			new Conexion();
		}

		return conn;
	}

	private Conexion() {
		String schema = "/bdpersonas";
		String url = "jdbc:mysql://localhost:3306" + schema;
		String usuario = "root";
		String password = "root";

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, usuario, password);
			
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}
	
}
