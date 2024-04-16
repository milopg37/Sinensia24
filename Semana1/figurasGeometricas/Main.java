package figurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Figura> listaFiguras = crearListaFiguras();
		printearLista(listaFiguras);
	}

	private static List<Figura> crearListaFiguras() {
		
		List<Figura> listaFiguras = new ArrayList<>();
		
		Figura circulo = new Circulo(3.14);
		Figura cuadrado = new Cuadrado(12.4);
		Figura rectangulo = new Rectangulo(8.6, 10.2);
		Figura triangulo = new Triangulo(5.4, 7.8, 6.1);
		
		listaFiguras.add(rectangulo);
		listaFiguras.add(cuadrado);
		listaFiguras.add(circulo);
		listaFiguras.add(triangulo);
		
		return listaFiguras;
	}

	private static void printearLista(List<Figura> listaFiguras) {
		
		for (Figura figura : listaFiguras) {
			System.out.println("- Areas -");
			figura.area();
			System.out.println("--");
			
			System.out.println("- Perimetros -");
			figura.perimetro();
			System.out.println("--");
		}
	}
}
