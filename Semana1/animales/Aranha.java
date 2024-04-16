package animales;

public class Aranha extends Animal{
	private String nombre;
	private static final int NUM_PATAS = 8;

	public Aranha() {
		super();
	}

	public Aranha(Comidas comida, String nombre) {
		super(NUM_PATAS,comida);
		this.nombre = nombre;
	}

	/**
	 * Sobreescribe método del padre para cambiar el mensaje
	 */
	@Override
	public void comer() {
		System.out.println("Las arañas comen mosquitos");
		
	}

	@Override
	public String toString() {
		return "Aranha [nombre=" + nombre + "]";
	}
	
}
