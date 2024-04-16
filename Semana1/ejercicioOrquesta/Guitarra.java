package ejercicioOrquesta;

public class Guitarra extends Instrumento{
	
	private int numCuerdas;

	public Guitarra() {
		super();
	}

	public Guitarra(String nombre,int numCuerdas) {
		super(nombre, "CUERDAS");
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + "]";
	}

	/**
	 * Sobreescribe el método del padre
	 * Añade el origen individual de la guitarra
	 */
	@Override
	public void verOrigen() {
		super.verOrigen();
		System.out.println("La guitarra procede del instrumento clásico llamado lira"
				+ "que era utilizada en la antigüedad clásica,"
				+ "y es probable que fuese inventada por los hititas alrededor de 1500 a.C");
	}
}
