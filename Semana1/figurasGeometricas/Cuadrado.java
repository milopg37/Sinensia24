package figurasGeometricas;

import java.text.DecimalFormat;

public class Cuadrado extends Figura{

	private double longitudLado;
	DecimalFormat df = new DecimalFormat("#.00");
	

	public Cuadrado() {
		super();
	}

	public Cuadrado(double longitudLado) {
		super();
		this.longitudLado = longitudLado;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}
	
	/**
	 * Perimetro = num lados * 4
	 */
	@Override
	public void perimetro() {
		this.setPerimetro((this.longitudLado * 4));
		System.out.println("Perimetro del cuadrado = " + df.format(this.getPerimetro()) + " cm");
	}

	/**
	 * Area = lado x lado
	 */
	@Override
	public void area() {
		//double area = Math.pow(longitudLado, 2);
		this.setArea(Math.pow(longitudLado, 2));
		System.out.println("Area del cuadrado = " + df.format(this.getArea()) + " cm\u00B2");
	}

	@Override
	public String toString() {
		return "Cuadrado [longitudLado=" + longitudLado + "]";
	}
}
