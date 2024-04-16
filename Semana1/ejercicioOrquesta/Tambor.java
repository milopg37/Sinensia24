package ejercicioOrquesta;

public class Tambor extends Instrumento{
	
	private double tamanho;

	public Tambor() {
		super();
	}

	public Tambor(String nombre, double tamanho) {
		super(nombre, "PERCUSION");
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Tambor [tamanho=" + tamanho + "]";
	}
	
	/**
	 * Este método realiza la acción de aporrear
	 * y printea un mensaje diciendo que tambor se está aporreando
	 */
	public void aporrear() {
		System.out.println("Aporreando tambor " + this.getNombre());
	}

	/**
	 * Sobreescribe el método del padre
	 * Añade el origen individual del tambor
	 */
	@Override
	public void verOrigen() {
		super.verOrigen();
		System.out.println("Según diversos estudios de investigación,"
				+ "el origen del tambor es Africano, y se remonta a la prehistoria.");
	}
}
