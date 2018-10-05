
public class Libro {
	
	//Propiedades
	private String titulo;
	private String autor;
	private String tema;
	private int numPaginas;
	private String isbn;
	private String[] formato=new String[3];
	private String estado;

	
	public Libro(String titulo, String autor, String tema, int numPaginas,
			String[] formato, String estado, String nib) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		this.numPaginas = numPaginas;
		this.formato = formato;
		this.estado = estado;
		this.isbn = nib;
	}

	//GETTERS
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTema() {
		return tema;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public String[] getFormato() {
		return formato;
	}
	public String getEstado() {
		return estado;
	}
	public String getISBN() {
		return isbn;
	}
}
