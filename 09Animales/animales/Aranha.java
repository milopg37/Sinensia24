package animales;

public class Aranha extends Animal{
	private String nombre;

	public Aranha() {
		super();
	}

	public Aranha(int patas, Comidas comida, String nombre) {
		super(8,comida);
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
