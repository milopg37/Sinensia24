package herencia;

public class Batidora extends Electrodomestico{
	
	//Cons
	public Batidora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batidora(int p, double v) {
		super(p, v);
		// TODO Auto-generated constructor stub
	}

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
	
	//Methods
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
		
	public void batir() {
		
	}
	
	public void stopBatir() {
		
	}
	
}
