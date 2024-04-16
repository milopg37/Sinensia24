package Cafetera;

public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;
	
	//Constructor para el primer caso
	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}

	//Constructor para el segundo caso
	public Cafetera(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = this.capacidadMaxima;
	}

	//Constructor para el tercer caso
	public Cafetera(int capacidadMaxima, int capacidadActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
		
		if (this.capacidadActual > this.capacidadMaxima) {
			this.capacidadActual = this.capacidadMaxima;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + "]";
	}
	
	/**
	 * Este método hace que la cantidad actual sea igual a la capacidad
	 */
	public void llenarCafetera() {
		this.capacidadActual = this.capacidadMaxima;
		System.out.println("Se ha rellenado la cafetera..");
	}
	
	/**
	 * Este método simula la acción de servir una taza con al capacidad indicada
	 * Si la cantidad actual no es insuficiente para llenar la taza, se sirve lo que quede
	 */
	public void servirTaza(int sizeTaza) {
		int cafeServido = 0;
		
		//Comprobacion de si podemos llenar la taza
		if (this.capacidadActual >= sizeTaza) {
			this.capacidadActual -= sizeTaza;
			System.out.println("Taza de café servida.." + sizeTaza + " ml de café servidos");
			
		}else {
			cafeServido = this.capacidadActual;
			this.capacidadActual = 0;
			System.out.println("No quedaba café suficiente para llenar la taza.. Café servido: " + cafeServido + " ml");			
		}
	}
	
	/**
	 * Este método setea la cantidad de café actual a 0
	 */
	public void vaciarCafetera() {
		this.capacidadActual = 0;
		System.out.println("Se ha vaciado la cafetera..");
	}
	
	/**
	 * Este método añade a la cafetera la cantidad de café indicada
	 */
	public void agregarCafe(int cantidadAgregar) {
		
		//Comprobacion de que la cantidad a agregar no es negativa
		if (cantidadAgregar < 0 || (cantidadAgregar += this.capacidadActual) > this.capacidadMaxima) {
			throw new RuntimeException("Error..Cantidad negativa o desborda..");
			
		}else {
			this.capacidadActual += cantidadAgregar;
			System.out.println("Se ha añadido " + cantidadAgregar + " ml de café a la cafetera..");
		}
		//
	}
}
