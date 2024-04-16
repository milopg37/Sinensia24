package figurasGeometricas;

import java.text.DecimalFormat;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	DecimalFormat df = new DecimalFormat("#.00");

	
	public Rectangulo() {
		super();
	}

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * multiplicar por dos la suma de las longitudes de la base y la altura
	 */
	@Override
	public void perimetro() {
		//double perimetro = Math.pow(base, 2) + Math.pow(altura, 2);
		this.setPerimetro(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.println("Perimetro de rectangulo = " + df.format(this.getPerimetro()) + " cm");
	}

	/**
	 * area = base * altura
	 */
	@Override
	public void area() {
		//double area = base * altura;
		this.setArea(this.base * this.altura);
		System.out.println("Area del rectangulo = " + df.format(this.getArea()) + " cm\u00B2");
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
}
