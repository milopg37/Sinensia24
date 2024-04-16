package semana2.electrodomesticos;

import java.security.PublicKey;

public class Television extends Electrodomestico{
	
	private final int resolucion; //Se mide en pulgadas. 1 pulgada 2,54cm
	private final boolean tdt;
	
	//Constructor para el primer caso
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}
	
	//Constructor para el segundo caso, sete PRECIO Y PESO de padre
	public Television(double PRECIO, int PESO) {
		super(PRECIO, PESO);
		this.resolucion = 20;
		this.tdt = false;
	}
	
	//Constructor para el tercer caso, setea
	public Television(double PRECIO, String CONSUMO, int PESO, ColoresDisponiblesEnum COLOR, int resolucion, boolean tdt) {
		super(PRECIO, CONSUMO, PESO, COLOR);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	/**
	 * Si resolucion > 40 precio aumenta 30%
	 * Si tdt es true precio + 50
	 */
	@Override
	public double precioFinal(String letraAComprobar, int pesoAComprobar) {
		double precioTotal = 0;
		
		if (this.resolucion > 40 && this.tdt) {
			precioTotal = (((super.precioFinal(letraAComprobar, pesoAComprobar)) * 30) / 100) + 50;
			
		}else if (this.resolucion > 40 ) {
			precioTotal = ((super.precioFinal(letraAComprobar, pesoAComprobar)) * 30) / 100;
		}
		return precioTotal;
	}
}
