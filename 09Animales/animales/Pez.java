package animales;

public class Pez extends Animal{
	private String nombre;
	
	public Pez() {
		super();
	}

	public Pez(int patas, Comidas comida, String nombre) {
		super(0,comida);
		this.nombre = nombre;
		this.setNumeroPatas(getNumeroPatas());
	}
	
	/**
	 * Sobreescribe método del padre para cambiar el mensaje
	 */
	@Override
	public void comer() {
		System.out.println("Los peces comen plancton");
		
	}
	
	/**
	 * Muestra mensaje
	 */
	public void jugar() {
		System.out.println("Estoy nadando!!");
	}

	/**
	 * Sobreescribe metodo del padre para modificar mensaje
	 */
	@Override
	public void andar() {
		System.out.println("En realidad no ando, nado");
	}

	@Override
	public String toString() {
		return "Pez [nombre=" + nombre + "]";
	}
	
	
}
