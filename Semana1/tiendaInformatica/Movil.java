package tiendaInformatica;

public class Movil extends Producto{
	private String operador;

	
	public Movil() {
		super();
	}


	public Movil(String operador) {
		super();
		this.operador = operador;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}
}
