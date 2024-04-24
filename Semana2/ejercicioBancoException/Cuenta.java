package semana2.ejercicioBancoException;

public class Cuenta {
	private String titular;
	private double saldo;
	private EstadoCuentaEnum estado; // EstadoCuenta.OPERATIVA

	public Cuenta(String titular, double saldo, EstadoCuentaEnum estado) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.estado = estado;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public EstadoCuentaEnum getEstado() {
		return estado;
	}
	public void setEstado(EstadoCuentaEnum estado) {
		this.estado = estado;
	}
	

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + ", estado=" + estado + "]";
	}

	/**
	 * “reintegro” es el retorno de los fondos de una tarjeta de crédito
	 *  despues de ser usada en una compra
	 *  Devuelve saldo restante e info sobre la cuenta
	 * @param cantidad
	 * @return
	 * @throws Exception
	 */
	public Cuenta reintegro(Cuenta cuenta, double cantidadRetirar) throws Exception {
		double saldoCuenta = cuenta.getSaldo();
		
		try {
			if (cantidadRetirar < 0 || cantidadRetirar > saldoCuenta) {
				
				throw new PersonalizadaException("La cantidad a retirar no puede ser negativa // Puede que no tengas fondos suficientes");
			}else {
				saldoCuenta -= cantidadRetirar;
				cuenta.setSaldo(saldoCuenta);
				System.out.println("Nuevo saldo en la cuenta de: " + cuenta.getTitular() + " " + cuenta.getSaldo() + " €");
			}
				
				
		} catch (PersonalizadaException e) {
			e.printStackTrace();
		}

		return cuenta;
	}
}
