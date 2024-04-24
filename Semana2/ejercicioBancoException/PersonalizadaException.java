package semana2.ejercicioBancoException;

public class PersonalizadaException extends Exception {

	String texto;

	public PersonalizadaException(String texto) {
		super();
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "ExceptionPersonalizada [texto=" + texto + "]";
	}

}
