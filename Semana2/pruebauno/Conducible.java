package semana2.pruebauno;

public interface Conducible {
	
	abstract void conducir();
	abstract void avanzar(int distancia, int velocidad);
	abstract void retroceder(int distancia, int velocidad);
	abstract void parar();
}
