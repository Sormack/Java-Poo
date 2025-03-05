package planta;

public class Flor extends Planta{
	protected String coloPetalo;
	protected int promedioPetalos;
	protected String variedad;
	protected String estacionFlorecimiento;
	
	public Flor() {
		// TODO Auto-generated constructor stub
	}
	
	public Flor(String coloPetalo, int promedioPetalos, String variedad, String estacionFlorecimiento) {
		super();
		this.coloPetalo = coloPetalo;
		this.promedioPetalos = promedioPetalos;
		this.variedad = variedad;
		this.estacionFlorecimiento = estacionFlorecimiento;
	}
	

	public String getColoPetalo() {
		return coloPetalo;
	}

	public void setColoPetalo(String coloPetalo) {
		this.coloPetalo = coloPetalo;
	}

	public int getPromedioPetalos() {
		return promedioPetalos;
	}

	public void setPromedioPetalos(int promedioPetalos) {
		this.promedioPetalos = promedioPetalos;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getEstacionFlorecimiento() {
		return estacionFlorecimiento;
	}

	public void setEstacionFlorecimiento(String estacionFlorecimiento) {
		this.estacionFlorecimiento = estacionFlorecimiento;
	}

	@Override
	public void tipoPlanta() {
		System.out.println("Soy una flor");
		
	}

}
