package planta;

public class Arbusto extends Planta {
	protected String tamanio;
	protected boolean domestico;
	protected String variedad;
	protected String colorHojas;
	protected boolean podable;
	
	public Arbusto() {
		// TODO Auto-generated constructor stub
	}
	
	public Arbusto(String tamanio, boolean domestico, String variedad, String colorHojas, boolean podable) {
		super();
		this.tamanio = tamanio;
		this.domestico = domestico;
		this.variedad = variedad;
		this.colorHojas = colorHojas;
		this.podable = podable;
	}
	
	public String getTamanio() {
		return tamanio;
	}


	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}


	public boolean isDomestico() {
		return domestico;
	}


	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}


	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}


	public String getColorHojas() {
		return colorHojas;
	}


	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}


	public boolean isPodable() {
		return podable;
	}


	public void setPodable(boolean podable) {
		this.podable = podable;
	}


	@Override
	public void tipoPlanta() {
		System.out.println("Soy un arbusto");
	}

}
