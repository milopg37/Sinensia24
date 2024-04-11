package pensandoEnObjetos;

public class Partido {
	//Attr
	private String resultado;
	
	//Cons
	public Partido() {
		
	}
	
	public Partido(String res) {
		this.resultado = res;
	}

	//Getters & Setters
	public String getResultados() {
		return resultado;
	}

	public void setResultados(String resultados) {
		this.resultado = resultados;
	}


	//Methods
	@Override
	public String toString() {
		return "Partido [resultados=" + resultado + "]";
	}
	
	
}
