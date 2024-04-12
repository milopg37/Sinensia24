package ejercicioOrquesta;

public class GuitarraElectrica extends Guitarra{

	private int potencia; // La salida de una guitarra eléctrica se mide en milivoltios (mV)

	public GuitarraElectrica() {
		super();
	}

	public GuitarraElectrica(int potencia) {
		super();
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + "]";
	}

	/**
	 * Sobreescribe el método de la Clase Instrumento, de la cual
	 * hereda la clase padre Guitarra
	 * Modifica el mensaje
	 */
	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra electrica !");
	}

	/**
	 * Sobreescribe el método del padre
	 * Añade el origen individual de la guitarra - electrica
	 */
	@Override
	public void verOrigen() {
		super.verOrigen();
		System.out.println("Es en 1920 cuando el ingeniero Lloyd Loard"
				+ "crea la primera guitarra eléctrica en Estados Unidos."
				+ "Trabajaba para la gran empresa de fabricación de instrumentos Gibson");
	}
}
