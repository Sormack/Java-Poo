package herencia;
	//La herencia toma todos los atributos de la clase padre 
	//Tambien toma los metodos geter y seters 
public class Trabajador extends Persona{
		//La clase hija puede contener sus propios atributos, metodo constructor y los geters y seter propios 
	String ocupacion;
	String idEmpleado;

	//Constructor propio de la clase Trabajador vacio
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	//Constructor generado de la clase padre o super de la cual se heredo
	public Trabajador(String dni, String nombre, String apellido, String telefono, String domicilio) {
		super(dni, nombre, apellido, telefono, domicilio);
	}

	//Constructor propi de la clase donde se inicializan los atributos
	public Trabajador(String ocupacion, String idEmpleado) {
		this.ocupacion = ocupacion;
		this.idEmpleado = idEmpleado;
	}
	
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	
}	
