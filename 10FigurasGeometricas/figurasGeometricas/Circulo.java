package figurasGeometricas;

import java.text.DecimalFormat;

public class Circulo extends Figura{

	private double radio;
	DecimalFormat df = new DecimalFormat("#.00");

	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 *  es igual a PI por el diámetro
	 */
	@Override
	public void perimetro() {
		this.setPerimetro((2 * Math.PI * this.radio));
		System.out.println("Perimetro del circulo = " + df.format(this.getPerimetro()) + " cm");
	}

	/**
	 * pi multiplicado por el radio al cuadrado
	 */
	@Override
	public void area() {
		this.setArea((Math.PI * Math.pow(radio, 2)));
		System.out.println("Area del circulo = " + df.format(this.getArea()) + " cm\u00B2");
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}
