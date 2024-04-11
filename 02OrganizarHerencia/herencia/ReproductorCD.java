package herencia;

public class ReproductorCD extends Electrodomestico{
	//Cons
	public ReproductorCD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReproductorCD(int p, double v) {
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

	//methods
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
	
	public void reproducir() {
		
	}
	
	public void stopReproducir() {
	
	}
}
