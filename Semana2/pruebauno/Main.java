package semana2.pruebauno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		List<Vehiculo> listaVehiculos = crearLista();
		
		printListaVehiculos(listaVehiculos);
		
		System.out.println("\n");
		
		conducirVehiculos(listaVehiculos);
		
	}
	
	private static List<Vehiculo> crearLista() {
		
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(new Coche(120570, 2, CombustiblesEnum.GASOLINA, ColoresEnum.canyonRed));
		listaVehiculos.add(new Moto(8100, 0, CombustiblesEnum.ELECTRICO, "Honda" , "Hayabuzza" , 150, ColoresEnum.babyBlue));
		listaVehiculos.add(new Barco(894000, 0, CombustiblesEnum.DIESEL, true, 100, 20, ColoresEnum.canyonRed));
		listaVehiculos.add(new Camion(512700, 3, CombustiblesEnum.GLP, 34000, 6, ColoresEnum.emeraldGreen));
		
		return listaVehiculos;
	}

	private static void printListaVehiculos(List<Vehiculo> listaVehiculos) {
		
		for (Vehiculo vehiculo : listaVehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
	
	private static void conducirVehiculos(List<Vehiculo> listaVehiculos) {
		
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo instanceof Coche) {
				vehiculo.conducir();
				vehiculo.avanzar(400, 120);
				vehiculo.retroceder(100, 100);
				vehiculo.parar();
			}
			
			if (vehiculo instanceof Moto) {
				vehiculo.conducir();
				vehiculo.avanzar(200, 100);
				vehiculo.retroceder(100, 90);
				vehiculo.parar();
			}
			
			if (vehiculo instanceof Barco) {
				vehiculo.conducir();
				vehiculo.avanzar(700, 120);
				vehiculo.retroceder(150, 80);
				vehiculo.parar();
			}
			
			if (vehiculo instanceof Camion) {
				vehiculo.conducir();
				vehiculo.avanzar(900, 90);
				((Camion) vehiculo).addVelocidad(80);
				((Camion) vehiculo).addVelocidad(100);
				vehiculo.retroceder(50, 70);
				vehiculo.parar();
			} 
		}
	}


}
