package tiendaInformatica;

public class Producto {
	// Attr
	private int codigoProducto;
	private String modelo;
	private int stock;

	public Producto() {

	}

	public Producto(int code, String model, int stck) {
		this.codigoProducto = code;
		this.modelo = model;
		this.stock = stck;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
