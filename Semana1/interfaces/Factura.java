package interfaces;

public class Factura implements Imprimible{
	
	private int numFactura;
	private int codigoCliente;
	

	public Factura() {
		super();
	}
	

	public Factura(int numFactura, int codigoCliente) {
		super();
		this.numFactura = numFactura;
		this.codigoCliente = codigoCliente;
	}


	public int getNumFactura() {
		return numFactura;
	}


	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}


	public int getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * Metodo de interfaz
	 * Devuelve un mensaje con la suma de las propiedades
	 */
	@Override
	public void generarInformeLargo() {
		int sumaPropiedades = this.numFactura + this.codigoCliente;
		
		System.out.println("Valor de la propiedad numero de factura + codigo de cliente: " + 
							sumaPropiedades);	
	}
	
	/**
	 * Metodo de interfaz
	 * Devuelve un mensaje con info de una propiedad
	 */
	@Override
	public void generarInformeCorto() {
		System.out.println("Propiedad del valor numero de factura: " + this.getNumFactura());
		
	}


	@Override
	public String toString() {
		return "Factura [numFactura=" + numFactura + ", codigoCliente=" + codigoCliente + "]";
	}
}
