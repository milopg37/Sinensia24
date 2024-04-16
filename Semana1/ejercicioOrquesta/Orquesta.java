package ejercicioOrquesta;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {

	public static void main(String[] args) {

		/**
		 * Creo una instancia de cada instrumento
		 */
		
		List<Instrumento> listaInstrumentos = crearLista();
		
		for (Instrumento instrumento : listaInstrumentos) {
			instrumento.afinar();
		}

		for (Instrumento instrumento : listaInstrumentos) {
			instrumento.verOrigen();
		}
		
		for (Instrumento instrumento : listaInstrumentos) {
			if (instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			}else {
				instrumento.tocar();
			}
		}
		
	}

	private static List<Instrumento> crearLista() {
		List<Instrumento> listaInstrumentos = new ArrayList<>();
		Instrumento flautaTravesera = new Flauta("flautin", "modeloNordica");

		Instrumento lesPaulGuitarra = new Guitarra("paul", 6);

		Instrumento fender = new GuitarraElectrica("fender", 6, 13);

		Instrumento bongosTambor = new Tambor("bongos", 40.2);
		listaInstrumentos.add(flautaTravesera);
		listaInstrumentos.add(lesPaulGuitarra);
		listaInstrumentos.add(fender);
		listaInstrumentos.add(bongosTambor);

		return listaInstrumentos;
	}
	
}
