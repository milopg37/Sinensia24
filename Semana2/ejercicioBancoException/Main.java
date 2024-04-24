package semana2.ejercicioBancoException;

public class Main {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Pepito", 20000.00, EstadoCuentaEnum.OPERATIVA);
		Cuenta c2 = new Cuenta("Camilo", 20000.00, EstadoCuentaEnum.BLOQUEADA);
		
		try {
			System.out.println("Dinero en la cuenta de Pepito después de retirar: " + "-2345" + " €");
			c1.reintegro(c1, -2345);//Forzamos a que falle para que tire Exception
			c1.toString();
			
			System.out.println("Dinero en la cuenta de Camilo después de retirar: " + "2000" + " €");
			c2.reintegro(c2, 2000);
			c2.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
