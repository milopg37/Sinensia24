package ejercicioOrquesta;

public class Guitarra extends Instrumento{
	
	private int numCuerdas;

	public Guitarra() {
		super();
	}

	public Guitarra(int numCuerdas) {
		super();
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
	
	

}
