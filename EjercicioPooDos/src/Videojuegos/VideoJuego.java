package Videojuegos;

public class VideoJuego {
	//Los fundamentos de la programacion orientada a objetos es 
	//Abstraccion,polimorfismo,encapsulamiento,herencia 
	//Atributos de la clase video juego
	protected int codigo;
	protected String titulo;
	protected String cosola;
	protected int cantidadJugadores;
	protected String categoria;
	
	public VideoJuego() {
		// TODO Auto-generated constructor stub
	}

	public VideoJuego(int codigo, String titulo, String cosola, int cantidadJugadores, String categoria) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.cosola = cosola;
		this.cantidadJugadores = cantidadJugadores;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCosola() {
		return cosola;
	}

	public void setCosola(String cosola) {
		this.cosola = cosola;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
