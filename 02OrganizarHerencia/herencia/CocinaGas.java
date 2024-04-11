package herencia;

public class CocinaGas extends Electrodomestico{
	//Attr
	private String tipoGas;
	
	//Cons
	public CocinaGas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CocinaGas(int p, double v) {
		super(p, v);
		// TODO Auto-generated constructor stub
	}
	
	public CocinaGas(String tipo) {
		this.tipoGas = tipo;
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
	
	public String getTipoGas() {
		return tipoGas;
	}

	public void setTipoGas(String tipoGas) {
		this.tipoGas = tipoGas;
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

	public void cocinar() {
		
	}
	
}
