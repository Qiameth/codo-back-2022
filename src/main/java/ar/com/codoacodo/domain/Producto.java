package ar.com.codoacodo.domain;

import java.util.Date;

public class Producto {

	// en id se suele usar long y no int cuando se hacen los mapeos
	// varchar10 se convierte en String
	// fechaAlta es de tipo Date
	private Long id;
	private String codigo;
	private String titulo;
	private Double precio;
	// se pasa el _ a un lodash, es decir, minus y mayus
	private Date fechaAlta;
	private String autor;
	private String img;

	// generamos constructor SIN y CON id
	public Producto(String codigo, String titulo, Double precio, Date fechaAlta, String autor, String img) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		this.autor = autor;
		this.img = img;
	}

	public Producto(Long id, String codigo, String titulo, Double precio, Date fechaAlta, String autor, String img) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		this.autor = autor;
		this.img = img;
	}

	// --- setters / getters ---
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + ", fechaAlta="
				+ fechaAlta + ", autor=" + autor + ", img=" + img + "]";
	}

}
