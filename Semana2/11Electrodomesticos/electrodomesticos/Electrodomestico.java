package semana2.electrodomesticos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Electrodomestico implements Comparator<Electrodomestico>{
	
	private final double PRECIO_BASE;
	private final String CONSUMO_ENERGETICO;
	private final int PESO;
	private final ColoresDisponiblesEnum COLOR_DISPONIBLE;
	
	
	//Constructor para el primer caso, por defecto al ser constantes
	public Electrodomestico() {
		this.PRECIO_BASE = 100;
		this.CONSUMO_ENERGETICO = "F";
		this.PESO = 5;
		this.COLOR_DISPONIBLE = ColoresDisponiblesEnum.BLANCO;
	}
	
	//Constructor para el segundo caso, Setea precio y peso, el resto por defecto
	public Electrodomestico(double PRECIO_BASE, int PESO) {
		this.PRECIO_BASE = PRECIO_BASE;
		this.PESO = PESO;
		this.CONSUMO_ENERGETICO = "F";
		this.COLOR_DISPONIBLE = ColoresDisponiblesEnum.BLANCO;
	}

	//Constructor para el tercer caso, setea todo
	public Electrodomestico(double pRECIO_BASE, String cONSUMO_ENERGETICO, int pESO,
		ColoresDisponiblesEnum cOLOR_DISPONIBLE) {
		super();
		PRECIO_BASE = pRECIO_BASE;
		CONSUMO_ENERGETICO = comprobarConsumoEnergetico(cONSUMO_ENERGETICO);
		PESO = pESO;
		COLOR_DISPONIBLE = comprobarColor(cOLOR_DISPONIBLE);
	}

	public double getPRECIO_BASE() {
		return PRECIO_BASE;
	}
	
	public String getCONSUMO_ENERGETICO() {
		return CONSUMO_ENERGETICO;
	}

	public int getPESO() {
		return PESO;
	}

	public ColoresDisponiblesEnum getCOLOR_DISPONIBLE() {
		return COLOR_DISPONIBLE;
	}
	
	/**
	 * Comprueba que la letra es correcta
	 * Si no, usará la letra por defecto.
	 * Se invoca al crear le objeto y no será visible
	 * @param letra
	 */
	public String comprobarConsumoEnergetico(String letra) {
		
		boolean existeLetra = false;
		String[] letras = {"A", "B", "C", "D", "E", "F"};

		
		for (int i = 0; i < letras.length; i++) {
			if (letra.equals(letras[i])) {
				existeLetra = true;
			}
		}
		
		if (existeLetra) {
			return letra;
		} else {
			return "F";
		}
	}
	
	/**
	 * Comprueba que el color es correcto
	 * Si no, usará el color por defecto.
	 * Se invoca al crear el objeto y no será visible
	 * @param colorAComprobar
	 */
	public ColoresDisponiblesEnum comprobarColor(ColoresDisponiblesEnum colorAComprobar) {
		boolean existeColor = false;
		
		for (ColoresDisponiblesEnum color : ColoresDisponiblesEnum.values()) {
			if (color == colorAComprobar) {
				existeColor = true;
			}
		}
		
		if (existeColor) {
			return colorAComprobar;
		} else {
			return ColoresDisponiblesEnum.BLANCO;
		}
	}
	
	/**
	 * Segun el consumo y el tamaño aumentará su precio
	 * @return
	 */
	public double precioFinal(String letraAComprobar, int pesoAComprobar) {
		double precioPorLetra = 0;
		double precioPorPeso = 0;
		double precioTotal = 0;
		
		Map<String, Integer> tablaPrecioPorLetra = new HashMap<>();
		tablaPrecioPorLetra.put("A", 100);
		tablaPrecioPorLetra.put("B", 80);
		tablaPrecioPorLetra.put("C", 60);
		tablaPrecioPorLetra.put("D", 50);
		tablaPrecioPorLetra.put("E", 30);
		tablaPrecioPorLetra.put("F", 10);
		
		try {
			//Si matchea la letra con la key -> asigna su value al precio
			for (Map.Entry<String, Integer> entry : tablaPrecioPorLetra.entrySet()) {
				String clave = entry.getKey();
				Integer valor = entry.getValue();
				
				if (clave.equalsIgnoreCase(letraAComprobar)) {
					precioPorLetra = valor;
					
				}else {
					System.out.println("La letra no se encuentra en la tabla..");
				}
			}
		} catch (ClassCastException cce) {
			cce.getMessage();
		}
		
		
		//Comprobacion de precio por peso
		if (pesoAComprobar < 20) {
			precioPorPeso = 10;
			
		}else if (pesoAComprobar < 50) {
			precioPorPeso = 50;
			
		}else if (pesoAComprobar < 80) {
			precioPorPeso = 80;
			
		}else {
			precioPorPeso = 100;
		}
		
		precioTotal = (precioPorLetra + precioPorPeso);
		return precioTotal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [PRECIO_BASE=" + PRECIO_BASE + ", CONSUMO_ENERGETICO=" + CONSUMO_ENERGETICO + ", PESO="
				+ PESO + ", COLOR_DISPONIBLE=" + COLOR_DISPONIBLE + "]";
	}

	/**
	 * Implementa interfaz comparator
	 * Este metodo compara si 2 objetos son iguales
	 */
	@Override
	public int compare(Electrodomestico o1, Electrodomestico o2) {
		
		//Si la propiedad a comparar (String) son diferentes, las compara
		if (o1.CONSUMO_ENERGETICO.compareTo(o2.CONSUMO_ENERGETICO) != 0) {
			return o1.CONSUMO_ENERGETICO.compareTo(o2.CONSUMO_ENERGETICO);
			
			//Si son iguales, compara por otra propiedad
		}else {
			return o1.COLOR_DISPONIBLE.compareTo(o2.COLOR_DISPONIBLE);
		}
	}
}
