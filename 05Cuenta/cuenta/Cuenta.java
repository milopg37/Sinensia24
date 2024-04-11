package cuenta;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	/**
	 * Este método recibe una cantidad a ingresar en la cuenta
	 * y luego printea el nuevo saldo
	 * @param cantidadIngresar
	 */
	public void ingresar(double cantidadIngresar) {
		
		//Comprobamos que el ingreso no sea negativo
		if (cantidadIngresar < 0) {
			throw new RuntimeException("Cantidad introducida negativa..");
			
		}else {
			this.cantidad += cantidadIngresar;
			System.out.println("Se han ingresado " + cantidadIngresar + " € a su cuenta");
			System.out.println("Nuevo saldo en la cuenta: " + Math.round(this.cantidad));
		}
	}
	
	/**
	 * Este método recibe una cantidad a retirar de la cuenta
	 * y luego printea el nuevo saldo
	 * @param cantidaRetirar
	 */
	public void retirar(double cantidaRetirar) {
		
		//Comprobamos que al retirar tenemos fondos suficientes
		if (this.cantidad - cantidaRetirar < 0) {
			throw new RuntimeException("Saldo insuficiente..");
			
		}else {
			this.cantidad -= cantidaRetirar;
			System.out.println("Se han retirado " + cantidaRetirar + " € a su cuenta");
			System.out.println("Saldo restante: " + Math.round(this.cantidad));
		}
	}
}
