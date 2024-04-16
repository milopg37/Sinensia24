package ejercicioOrquesta;

public class Flauta extends Instrumento{
	
	private String modelo;

	
	public Flauta() {
		super();
	}

	public Flauta(String nombre, String modelo) {
		super(nombre, "VIENTO");
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

	/**
	 * Sobreescribe el método del padre
	 * Añade el origen individual de la flauta
	 */
	@Override
	public void verOrigen() {
		super.verOrigen();
		System.out.println("La primera flauta fue encontrada en Alemania con 43 000 años de antigüedad.");
	}
	
	
}
