package herencia;

public class Casette extends Electrodomestico{
	//Attr
	private String velocidad;

	//Cons
	public Casette() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Casette(int p, double v) {
		super(p, v);
		// TODO Auto-generated constructor stub
	}
	
	public Casette(String velo) {
		this.velocidad=velo;
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

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
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

	public void rewind() {
		
	}
	
	public void play() {
		
	}
	
	public void stop() {
		
	}
	
}
