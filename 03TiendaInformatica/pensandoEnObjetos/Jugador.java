package pensandoEnObjetos;

public class Jugador {
	//Attr
	private String nombre;
	private int edad;
	private int golesEstaTemporadas;
	
	//Cons
	public Jugador() {
		
	}
	
	public Jugador(String nom, int e, int goles) {
		this.nombre = nom;
		this.edad = e;
		this.golesEstaTemporadas = goles;
	}
	
	//Getters && Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGolesEstaTemporadas() {
		return golesEstaTemporadas;
	}

	public void setGolesEstaTemporadas(int golesEstaTemporadas) {
		this.golesEstaTemporadas = golesEstaTemporadas;
	}

	
	//Methods

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", golesEstaTemporadas=" + golesEstaTemporadas + "]";
	}
	
	
}
