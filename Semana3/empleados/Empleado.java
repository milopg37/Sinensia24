package semana3.empleados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


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
	 * Primera parte:
	 * Al pasarle un apellido consulta y muestra todos los datos
	 * de el/los empleados que tengan ese apellido en cuestion
	 * Segunda parte:
	 * Una vez mostrado te da opcion a modificar ese empleado en cuestión
	 */
	public void mostrarDatosEmpleadoPorApellido(String apellidoABuscar) {
		
		Scanner sc = new Scanner(System.in);
		
		String querySelectPorApellido = "SELECT * FROM empleados WHERE apellido = '" + apellidoABuscar + "';";
		
		String queryUpdateEmpleado = "UPDATE empleados"
									+ " SET nombre = '?',"
									+ " apellido = '?',"
									+ " salario = '?',"
									+ " casado = '?'"
									+ " WHERE apellido = '?' AND salario = '?';";
		
		try {
			
			PreparedStatement pstmt = Conexion.getConnection().prepareStatement(querySelectPorApellido);
			PreparedStatement pstmt2 = Conexion.getConnection().prepareStatement(queryUpdateEmpleado);
			
			//Conexion.getConnection().setAutoCommit(false);//begin transaction
			
			ResultSet resultSet = pstmt.executeQuery(); //Ejecuto consulta
			
			
			System.out.println("Empleados que tengan el apellido: " + apellidoABuscar);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("nombre"));
			}
			
			System.out.println("Introduzca nuevos valores para el empleado: ");
			System.out.println("Orden: Nombre-Apellido-Salario-EstadoCivil");
			
			
			for (int i = 0; i < 3; i++) {
			
				pstmt2.setString(1, sc.nextLine());
				pstmt2.setString(2, sc.nextLine());
				sc.nextLine();//Lectura falsa
				pstmt2.setInt(3, sc.nextInt());
				pstmt2.setInt(4, sc.nextInt());
			}
			
			pstmt2.setString(5, apellidoABuscar);//Where
			pstmt2.setInt(6, 22000);//Where
			
			pstmt2.executeQuery(); //Ejecuto update
			
			
			//Conexion.getConnection().commit();//commit transaction
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Consulta y muestra salario anual
	 * junto con salario mensual
	 */
	public void consultarSalarioMensual(){
		
		String queryConsultaSalario = "SELECT salario"
									+ " FROM empleados";
		List<Integer> listaSalarios = new ArrayList<>();
		
		try {
			  Statement stmt = Conexion.getConnection().createStatement();
	          ResultSet resultSet = stmt.executeQuery(queryConsultaSalario);
	          
	          while (resultSet.next()) {
	        	
	        	listaSalarios.add(resultSet.getInt("salario"));
			}
	          
	        //Ordeno de mayor a menor y muestreo
	          Collections.sort(listaSalarios, Collections.reverseOrder());
	          System.out.println("-- Salarios ordenador de mayor a menor --");
	        	for (Integer salario : listaSalarios) {
	        		System.out.print(salario + "€ ");	
	        		System.out.println("Salario mensual: " + salario / 12 + " €");
				}
			
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
