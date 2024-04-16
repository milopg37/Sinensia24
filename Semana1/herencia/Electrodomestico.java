package herencia;

public class Electrodomestico {
	//Attr
	private int precio;
	private double voltaje;
	
	
	//Cons
	public Electrodomestico() {
		
	}
	
	//Cons
	public Electrodomestico(int p, double v) {
		this.precio = p;
		this.voltaje = v;
	}

	//Getters & Setters
	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public double getVoltaje() {
		return voltaje;
	}


	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}
	
	//Methods
	public void Encender() {
		
	}
	
	public void Apagar() {
		
	}
	
	
	
}
