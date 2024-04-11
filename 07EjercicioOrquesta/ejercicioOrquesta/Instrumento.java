package ejercicioOrquesta;

public class Instrumento {
	
	protected String nombre;
	protected String tipoInstrumento;
	
	public Instrumento() {
		super();
	}

	public Instrumento(String nombre, String tipoInstrumento) {
		super();
		this.nombre = nombre;
		this.tipoInstrumento = tipoInstrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipoInstrumento=" + tipoInstrumento + "]";
	}
	
	/**
	 * Este método realiza la acción de tocar el instrumento
	 * Printea un mensaje diciendo que instrumento se ha tocado
	 */
	public void tocar() {
		System.out.println("Tocando el instrmento: " + this.nombre);
	}
	
	/**
	 * Este método realiza la acción de afinar el instrumento
	 * Printea un mensaje diciendo que instrumento se ha afindo
	 */
	public void afinar() {
		System.out.println("Se ha afinado el tono del instrumento: " + this.nombre);
	}
	
}
