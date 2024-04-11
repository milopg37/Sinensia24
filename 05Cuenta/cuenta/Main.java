package cuenta;

public class Main {
	public static void main(String[] args) {
		
		Cuenta cuentaCorriente = new Cuenta("milo", 750.20);
		
		//Llamo métodos para ingresar y retirar de la cuenta
		cuentaCorriente.ingresar(110.10);
		cuentaCorriente.retirar(220.20);
		
		cuentaCorriente.toString();
	}
}
