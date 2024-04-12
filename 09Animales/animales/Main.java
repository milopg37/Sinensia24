package animales;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			
		List<Animal> listaAnimales = crearLista();
		
		printDatos(listaAnimales);	
	}
	
	
	private static List<Animal> crearLista() {
		
		List<Animal> listaAnimales = new ArrayList<>();
		
		listaAnimales.add(new Aranha(8, Comidas.INSECTOS, "spidey"));
		listaAnimales.add(new Gato(4, Comidas.ATUN, "lopez"));
		listaAnimales.add(new Pez(0, Comidas.PLANCTON, "pezpaco"));
		
		return listaAnimales;
	}
	
	/**
	 * Recibe la lista de animales e implementa los metodos
	 * de cada tipo de animal 
	 * @param listaAnimales
	 */
	private static void printDatos(List<Animal> listaAnimales) {
		
		for (Animal animal : listaAnimales) {
			if (animal instanceof Gato) {
				animal.comer();
				((Gato) animal).jugar();
				((Gato) animal).esMascota();
				
			}else if (animal instanceof Aranha) {
				animal.comer();
				
			}else if (animal instanceof Pez) {
				animal.comer();
				((Pez) animal).jugar();
				animal.andar();
			}
		}
		
	}

}
