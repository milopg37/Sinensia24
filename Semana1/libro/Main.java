package libro;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("ab12","titulin","autorin", 100);
		Libro libro2 = new Libro("cd34","titulon","autoron", 200);
		
		//printeo info
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Llamo método para comparar nº paginas
		Libro.compararLibro(libro1, libro2);
		
		
	}
	
}
