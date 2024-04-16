package semana2.electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	private final int carga;
	
	//Constructor por defecto,para el primer caso
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	//Constructor para el segundo caso, setea PRECIO Y PESO del padre
	public Lavadora(double PRECIO_BASE, int PESO) {
		super(PRECIO_BASE, PESO);
		this.carga = 5;
	}
	
	//Constructor para el tercer caso, setea todos los attr del padre
	public Lavadora(double PRECIO_BASE, String CONSUMO,  int PESO, ColoresDisponiblesEnum COLOR, int carga) {
		super(PRECIO_BASE, CONSUMO, PESO, COLOR);
		this.carga = 5;
	}

	public int getCarga() {
		return carga;
	}

	/**
	 * Si la carga > 30 precio + 50
	 * Si no, precio se mantiene igual
	 */
	@Override
	public double precioFinal(String letraAComprobar, int pesoAComprobar) {
		double totalPrecio = 0;
		
		if (this.carga > 30) {
			totalPrecio = (super.precioFinal(letraAComprobar, pesoAComprobar)) + 50;
		}
		return totalPrecio;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
}
