package ejercicioOrquesta;

public class Flauta extends Instrumento{
	
	private String modelo;

	
	public Flauta() {
		super();
	}

	public Flauta(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Flauta [modelo=" + modelo + "]";
	}

	/**
	 * Sobreescribe el método de la clase padre
	 * Realiza la misma acción solo que cambia el mensaje
	 */
	@Override
	public void tocar() {
		
		System.out.println("Soplando la flauta: " + this.getNombre());
		System.out.println("Modelo de la flauta: " + this.getModelo());
	}
}
