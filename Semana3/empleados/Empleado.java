package semana3.empleados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


public class Empleado {

	private static int idEmpleado = 0;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private int salario;
	private boolean casado;
	
	public Empleado() {
		this.idEmpleado = idAutogenerado();
	}
	
	public Empleado (String nombre, String apellido, LocalDate fechaNacimiento, int salario, boolean casado) {
		this.idEmpleado = idAutogenerado();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
		this.casado = casado;
	}

	
	public static int getIdEmpleado() {
		return idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	/**
	 * PK de la tabla Empleados en la DB
	 * Es autoincremental y se autoinvoca al crear Empleado
	 * @return
	 */
	private int idAutogenerado() {
		
		return ++idEmpleado;
	}
	
	/**
	 * Al pasarle un apellido consulta y muestra todos los datos
	 * de el/los empleados que tengan ese apellido en cuestion 
	 */
	public void mostrarDatosEmpleadoPorApellido() {
		StringBuilder str = new StringBuilder();
		
		
		
		System.out.println(str.toString());
	}
	
	/**
	 * Consulta y muestra salario anual
	 * junto con salario mensual
	 */
	public void consultarSalarioMensual(){
		Conexion conexion = Conexion.getInstance();
		Connection connection = conexion.getConnection();
		
		String queryConsultaSalario = "SELECT salario"
									+ " FROM empleados";
		try {
			  Statement stmt = connection.createStatement();
	          ResultSet resultSet = stmt.executeQuery(queryConsultaSalario);
	          
	          
			
			
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}

	/**
	 * Consulta el estado civil del empleado en la DB
	 */
	public void getEstadoCivil() {
		
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", salario=" + salario + ", casado=" + casado + "]";
	}
}
