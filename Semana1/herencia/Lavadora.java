package herencia;

public class Lavadora extends Electrodomestico{
	
	//Cons
	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int p, double v) {
		super(p, v);
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}

	@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		super.setPrecio(precio);
	}

	@Override
	public double getVoltaje() {
		// TODO Auto-generated method stub
		return super.getVoltaje();
	}

	@Override
	public void setVoltaje(double voltaje) {
		// TODO Auto-generated method stub
		super.setVoltaje(voltaje);
	}

	//MEthods
	@Override
	public void Encender() {
		// TODO Auto-generated method stub
		super.Encender();
	}

	@Override
	public void Apagar() {
		// TODO Auto-generated method stub
		super.Apagar();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void lavar() {
		
	}
	

	public void stopLavar() {
		
	}


}
