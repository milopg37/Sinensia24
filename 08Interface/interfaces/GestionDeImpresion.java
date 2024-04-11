package interfaces;

public class GestionDeImpresion {

	public static void main(String[] args) {
		/**
		 * Creo los objetos
		 */
		Pagina pagina = new Pagina(200,1800);
		Factura factura = new Factura(2,103);
		
		/**
		 * Calleo metodos
		 */
		pagina.informeCorto();
		pagina.informeLargo();
		
		factura.informeCorto();
		factura.informeLargo();
	}

}
