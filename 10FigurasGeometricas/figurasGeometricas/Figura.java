package figurasGeometricas;


public class Figura implements Formas{
	private double perimetro;
	private double area;
	
	
	public Figura() {
		super();
	}

	public Figura(double perimetro, double area) {
		super();
		this.perimetro = perimetro;
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
