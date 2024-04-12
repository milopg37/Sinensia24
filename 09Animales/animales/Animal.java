package animales;

public class Animal {
	private int numeroPatas;
	private Comidas comidaFavorita;

	public Animal() {
		super();
	}

	public Animal(int numeroPatas, Comidas comida) {
		super();
		this.numeroPatas = numeroPatas;
		this.comidaFavorita = comida;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	
	public Comidas getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(Comidas comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}


	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", comidaFavorita=" + comidaFavorita + "]";
	}

	/**
	 * Este método mostrará un mensaje confirmando que el Animal
	 * está comiendo y qué está comiendo, junto con su comidaFavorita
	 */
	public void comer() {
		System.out.println("La comida favorita de este animal es: " + this.comidaFavorita);
	}
	
	/**
	 * Método que muestra un mensaje confirmando que el Animal
	 * está andando y sobre cuantas patas
	 */
	public void andar() {
		System.out.println("El animal camina sobre sus " + this.getNumeroPatas() + " patas");
	}
	
}
