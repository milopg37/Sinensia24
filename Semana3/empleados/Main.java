package semana3.empleados;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		boolean salir = false;
		int opcion;
		Empleado empleado = new Empleado();
		
		while (salir == false) {
			opcion = obtenerOpcionUsuario() + 1; //El array de opciones empieza en 0 y necesito entrar por el case correcto...
			
			switch (opcion) {
			case 1:
				System.out.println("Has elegido modificar un empleado buscando por apellido ..");
				empleado.mostrarDatosEmpleadoPorApellido("Martínez");
				break;
				
			case 2:
				System.out.println("Has elegido consultar el salario ..");
				empleado.consultarSalarioMensual();
				break;
				
			case 3:
				System.out.println("Has elegido consultar el estado civil ..");
				empleado.getEstadoCivil();
				break;
				
			case 4:
				salir = true;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
			}
		}
		
	}

	/**
	 * Recoge la opcion elegida por el usuario en el prompt
	 * y la devuelve para utilizarla en el switch y elegir los casos
	 * @return
	 */
	private static int obtenerOpcionUsuario() {
		String[] opciones = {"Consultar Por Apellido","Ver Salario","Estado Civil", "Salir"};
		
		//Orden: padre-mensaje-titulo-dialogo-tipomsg-icono-opciones-opcionElegida
		int seleccion = JOptionPane.showOptionDialog(
	            null, "Seleccione una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, opciones, opciones[0]);
		
		return seleccion;
	}
}
