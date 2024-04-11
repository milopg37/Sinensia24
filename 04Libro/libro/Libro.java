package libro;

public class Libro {

	private String isbn;
	private String tituloString;
	private String autorString;
	private int numPaginas;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(String isbn, String tituloString, String autorString, int numPaginas) {
		super();
		this.isbn = isbn;
		this.tituloString = tituloString;
		this.autorString = autorString;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTituloString() {
		return tituloString;
	}

	public void setTituloString(String tituloString) {
		this.tituloString = tituloString;
	}

	public String getAutorString() {
		return autorString;
	}

	public void setAutorString(String autorString) {
		this.autorString = autorString;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", tituloString=" + tituloString + ", autorString=" + autorString
				+ ", numPaginas=" + numPaginas + "]";
	}
	
	/**
	 * Este método compara cual de los 2 objetos libro tiene más páginas
	 * @param libro1
	 * @param libro2
	 */
	public static void compararLibro(Libro libro1, Libro libro2) {
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1 + " es el libro con más páginas");
			
		}else if(libro1.getNumPaginas() < libro2.getNumPaginas()){
			System.out.println(libro2 + " es el libro con más páginas");
			
		}else {
			System.out.println("Ambos libros tienen el mismo nº de páginas");
		}
	}
}
