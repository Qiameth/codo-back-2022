package ar.com.codoacodo.buscador;

public class Articulo {

	// attributes
	String img;
	String titulo;
	String autor;
	float precio;	
	
	public Articulo(String img, String titulo, String autor, float precio) {
		super();
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	// methods
	public void detalle() {		
		System.out.println("Detallando producto:...");
		//alt+shift+s  -> generate toString()
		System.out.println("Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]");
	}


	
	
}
