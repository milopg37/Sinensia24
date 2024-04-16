package Cafetera;

public class Main {

	public static void main(String[] args) {
		
		Cafetera cafetin = new Cafetera();
		System.out.println(cafetin.toString());
		
		Cafetera cafeton = new Cafetera(1200);
		System.out.println(cafeton.toString());
		
		Cafetera cafet = new Cafetera(1400,1500);
		System.out.println(cafet.toString());
		
		//Llamo a los métodos
		cafetin.agregarCafe(500);
		cafeton.servirTaza(500);
		cafet.vaciarCafetera();
		cafet.llenarCafetera();
	}
}
