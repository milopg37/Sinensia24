package ejercicioOrquesta;

public class Orquesta {

	public static void main(String[] args) {
		
		/**
		 * Creo una instancia de cada instrumento
		 */
		Flauta flautaTravesera = new Flauta("modeloNordica");
		flautaTravesera.setNombre("flautin");
		flautaTravesera.setTipoInstrumento("flauta");
		
		Guitarra lesPaulGuitarra = new Guitarra(6);
		lesPaulGuitarra.setNombre("paul");
		lesPaulGuitarra.setTipoInstrumento("guitarra");
		
		GuitarraElectrica fender = new GuitarraElectrica(13);
		fender.setNombre("fender");
		fender.setTipoInstrumento("guitarraElectrica");
		fender.setNumCuerdas(6);
		
		Tambor bongosTambor = new Tambor(40.2);
		bongosTambor.setNombre("bongos");
		bongosTambor.setTipoInstrumento("tambor");
		
		//Pruebo que todo funciona
		flautaTravesera.tocar();
		lesPaulGuitarra.tocar();
		fender.tocar();
		bongosTambor.aporrear();
		flautaTravesera.afinar();
		lesPaulGuitarra.afinar();
		fender.afinar();
		bongosTambor.afinar();
	}

}
