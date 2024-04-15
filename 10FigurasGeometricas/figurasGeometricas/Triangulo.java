package figurasGeometricas;

import java.text.DecimalFormat;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	private double lado;
	DecimalFormat df = new DecimalFormat("#.00");
	
	
	public Triangulo() {
		super();
	}


	public Triangulo(double base, double altura, double lado) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado = lado;
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
	

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	/**
	 * Suma de los 3 lados
	 */
	@Override
	public void perimetro() {
		//double perimetro = this.base + this.altura + this.lado;
		this.setPerimetro(this.base + this.altura + this.lado);
		System.out.println("Perimetro de triangulo = " + df.format(this.getPerimetro()) + " cm");
	}

	/**
	 * Area = la mitad de la base por la altura
	 */
	@Override
	public void area() {
		//double area = (this.base * this.altura) / 2;
		this.setArea((this.base * this.altura) / 2);
		System.out.println("Area del triangulo = " + df.format(this.getArea()) + " cm\u00B2");
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}	
}
