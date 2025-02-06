package armasMele;

//El abstract sirve para cualquier clase herede sus metodos y atributos y caracteristicas
//Sirve para ser molde general de cual cuiquier clase 

public abstract class armaMele {
	//Con protected hace que  los atributos solo puedan ser usados por las clases heredadas
	protected String nombreArma;
	protected String tipoDanioArma;
	protected String danioElementalArma;
	protected int cantidadDanio;
	
	public String getNombreArma() {
		return nombreArma;
	}
	public void setNombreArma(String nombreArma) {
		this.nombreArma = nombreArma;
	}
	public String getTipoDanioArma() {
		return tipoDanioArma;
	}
	public void setTipoDanioArma(String tipoDanioArma) {
		this.tipoDanioArma = tipoDanioArma;
	}
	public String getDanioElementalArma() {
		return danioElementalArma;
	}
	public void setDanioElementalArma(String danioElementalArma) {
		this.danioElementalArma = danioElementalArma;
	}
	public int getCantidadDanio() {
		return cantidadDanio;
	}
	public void setCantidadDanio(int cantidadDanio) {
		this.cantidadDanio = cantidadDanio;
	}
	//Los metodos de las clase abstractas deben de especificarce como metodo abstracto 
	protected abstract double ataqueAcendente();
	protected abstract double ataqueDecendente();
	protected abstract double ataqueHorizontal();
	
}
