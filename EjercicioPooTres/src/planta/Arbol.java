package planta;
//Esta clase jija hereda atributos y metodos de la clase Planta
public class Arbol extends Planta{
	protected String variedad;
	protected String tipoTronco;
	protected int radioTronco;
	protected String color;
	protected String tipoHoja;
	
	public Arbol() {
		// TODO Auto-generated constructor stub
	}
	public Arbol(String variedad, String tipoTronco, int radioTronco, String color, String tipoHoja) {
		super();
		this.variedad = variedad;
		this.tipoTronco = tipoTronco;
		this.radioTronco = radioTronco;
		this.color = color;
		this.tipoHoja = tipoHoja;
	}
	
	
	public String getVariedad() {
		return variedad;
	}
	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}
	public String getTipoTronco() {
		return tipoTronco;
	}
	public void setTipoTronco(String tipoTronco) {
		this.tipoTronco = tipoTronco;
	}
	public int getRadioTronco() {
		return radioTronco;
	}
	public void setRadioTronco(int radioTronco) {
		this.radioTronco = radioTronco;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoHoja() {
		return tipoHoja;
	}
	public void setTipoHoja(String tipoHoja) {
		this.tipoHoja = tipoHoja;
	}
	
	@Override
	//Sobre escritura del metodo heredado de clase padre Planta
	public void tipoPlanta() {
		System.out.println("Soy un arbol");
		
	}
}
