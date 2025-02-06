package herencia;

public class Jefe extends Persona{
	String zonaTrabajo;
	String salario;
	
	public Jefe() {
		// TODO Auto-generated constructor stub
	}
	
	// Metodo constructor donde se inicializan los atributos de la clase persona y la clase jefe
	public Jefe(String dni, String nombre, String apellido, String telefono, String domicilio, String zonaTrabajo,
			String salario) {
		super(dni, nombre, apellido, telefono, domicilio);
		this.zonaTrabajo = zonaTrabajo;
		this.salario = salario;
	}

	public String getZonaTrabajo() {
		return zonaTrabajo;
	}

	public void setZonaTrabajo(String zonaTrabajo) {
		this.zonaTrabajo = zonaTrabajo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
