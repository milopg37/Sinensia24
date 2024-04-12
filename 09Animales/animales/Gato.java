package animales;

public class Gato extends Animal implements Domesticable{
	private String nombre;
	
	public Gato() {
		super();
	}

	public Gato(int patas, Comidas comida, String nombre) {
		super(4,comida);
		this.nombre = nombre;
	}
	
	/**
	 * Sobreescribe método del padre para cambiar el mensaje
	 */
	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer peces y arañas");
		
	}
	
	/**
	 * Muestra mensaje con el nombre del gato que juega
	 */
	public void jugar() {
		System.out.println("Al gato " + this.nombre + " le gusta jugar con pelotas");
	}

	/**
	 * Implementa metodo de la interfaz para corroborar que puede ser Mascota
	 */
	@Override
	public void esMascota() {
		System.out.println("Este animal puede ser mascota y domesticado!");
	}
	
	
}
