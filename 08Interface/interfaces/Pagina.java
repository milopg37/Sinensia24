package interfaces;

public class Pagina implements Imprimible{
	private int numPaginas;
	private int numLineas;
	
	
	public Pagina() {
		super();
	}
	
	
	public Pagina(int numPaginas, int numLineas) {
		super();
		this.numPaginas = numPaginas;
		this.numLineas = numLineas;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public int getNumLineas() {
		return numLineas;
	}


	public void setNumLineas(int numLineas) {
		this.numLineas = numLineas;
	}

	/**
	 * Metodo de interfaz
	 * Devuelve un mensaje con la suma de las propiedades
	 */
	@Override
	public void informeLargo() {
		int sumaPropiedades = this.numLineas + this.numPaginas;
		
		System.out.println("Valor de la propiedad numero de paginas + numero de lineas: "
							+ sumaPropiedades);
	}

	/**
	 * Metodo de interfaz
	 * Devuelve un mensaje con info de una propiedad
	 */
	@Override
	public void informeCorto() {
		System.out.println("Propiedad del valor numero de paginas: " + this.numPaginas);
	}


	@Override
	public String toString() {
		return "Pagina [numPaginas=" + numPaginas + ", numLineas=" + numLineas + "]";
	}
}
