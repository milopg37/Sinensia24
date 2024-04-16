package semana2.electrodomesticos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		List<Electrodomestico> electrodomesticos = crearListaElectrodomesticos();
		
		printearLista(electrodomesticos);
	}

	private static List<Electrodomestico> crearListaElectrodomesticos() {
		
		List<Electrodomestico> electrodomesticos = new ArrayList<>();
		
		electrodomesticos.add(new Lavadora(120.50, "C", 400, ColoresDisponiblesEnum.GRIS, 50));
		electrodomesticos.add(new Television(300.30, "B", 500, ColoresDisponiblesEnum.ROJO, 35, false));
		electrodomesticos.add(new Lavadora(70.20, "A", 200, ColoresDisponiblesEnum.NEGRO, 30));
		electrodomesticos.add(new Television(500.80, "C", 700, ColoresDisponiblesEnum.BLANCO, 45, true));
		electrodomesticos.add(new Lavadora(100.10, "B", 100, ColoresDisponiblesEnum.ROJO, 70));
		electrodomesticos.add(new Lavadora(215.30, "F", 300, ColoresDisponiblesEnum.NEGRO, 90));
		electrodomesticos.add(new Television(800.55, "A", 255, ColoresDisponiblesEnum.AZUL, 50, false));
		electrodomesticos.add(new Lavadora(85.25, "D", 90, ColoresDisponiblesEnum.AZUL, 20));
		electrodomesticos.add(new Television(700.15, "D", 600, ColoresDisponiblesEnum.GRIS, 20, true));
		electrodomesticos.add(new Lavadora(1000.70, "E", 300, ColoresDisponiblesEnum.BLANCO, 60));
		
		return electrodomesticos;
	}
	
	private static void printearLista(List<Electrodomestico> electrodomesticos) {
		
		for (Electrodomestico electrodomestico : electrodomesticos) {			
			System.out.println("Precio total Electrodomesticos: " + electrodomestico.precioFinal(electrodomestico.getCONSUMO_ENERGETICO(), electrodomestico.getPESO()) + " €");
			
			if (electrodomestico instanceof Television) {
				System.out.println("Precio total Televisiones: " + electrodomestico.precioFinal(electrodomestico.getCONSUMO_ENERGETICO(), electrodomestico.getPESO()) + " €");
				
			}else if (electrodomestico instanceof Lavadora) {
				System.out.println("Precio total Lavadoras: " + electrodomestico.precioFinal(electrodomestico.getCONSUMO_ENERGETICO(), electrodomestico.getPESO()) + " €");
			}
		}
	}
}
