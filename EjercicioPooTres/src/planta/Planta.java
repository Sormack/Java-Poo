package planta;
//Al ser una clase abstracta solo va a heredar sus atributos y metodos a sus clases hijas 
public abstract class Planta {
	//Se encapsula los atributos mediante protected para que solo se usado para sus clases hijas 
	protected String nombre;
	protected String medidaTallo;
	protected boolean tieneHojas;
	protected String climaIdeal;
	//Constructor vacio
	public Planta() {
		// TODO Auto-generated constructor stub
	}
	//Constructor sobrecargado ya que este recibe parametros
	public Planta(String nombre, String medidaTallo, boolean tieneHojas, String climaIdeal) {
		this.nombre = nombre;
		this.medidaTallo = medidaTallo;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
	}
	//Metodos geter y seter 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedidaTallo() {
		return medidaTallo;
	}
	public void setMedidaTallo(String medidaTallo) {
		this.medidaTallo = medidaTallo;
	}
	public boolean isTieneHojas() {
		return tieneHojas;
	}
	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}
	public String getClimaIdeal() {
		return climaIdeal;
	}
	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}
	
	//
	public abstract void tipoPlanta();
}
