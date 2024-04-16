package tiendaInformatica;

public class Ordenador extends Producto{
	private String carcteristicas;
	private int memoria;
	private int capacidadGB;
	
	
	public Ordenador() {
		super();
	}

	public Ordenador(String carcteristicas, int memoria, int capacidadGB) {
		super();
		this.carcteristicas = carcteristicas;
		this.memoria = memoria;
		this.capacidadGB = capacidadGB;
	}

	public String getCarcteristicas() {
		return carcteristicas;
	}

	public void setCarcteristicas(String carcteristicas) {
		this.carcteristicas = carcteristicas;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getCapacidadGB() {
		return capacidadGB;
	}

	public void setCapacidadGB(int capacidadGB) {
		this.capacidadGB = capacidadGB;
	}
	
	
	
}
