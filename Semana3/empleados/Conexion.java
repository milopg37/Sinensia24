package semana3.empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que gestiona la conexion a la DB
 */
public class Conexion {

	private static Conexion instance;
    private Connection connection;
    private String schema = "/bdpersonas";
    private String url = "jdbc:mysql://localhost:3306" + schema;
    private String username = "root";
    private String password = "root";

    /**
     * Constructor privado para evitar instancias directas.
     * @throws SQLException
     */
    private Conexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Creacion de conexion a la BD fallida: " + ex.getMessage());
        }
    }

    /**
     * Obtiene la conexion a la DB
     * @return
     */
    public Connection getConnection() {
        return connection;
    }
    
    /**
     * Obtiene la instancia unica de la conexion (Singleton)
     * Si no existe instancia previa o la conexion está cerrada, se crea una nueva
     * @return
     * @throws SQLException
     */
    public static Conexion getInstance() throws SQLException{
    	
    	if (instance == null) {
			instance = new Conexion();
			
		}else if (instance.getConnection().isClosed()) {
			instance = new Conexion();
		}
    	return instance;
    }
}
