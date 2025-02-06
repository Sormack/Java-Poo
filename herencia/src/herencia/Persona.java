package herencia;

public class Persona {
	//Abstraccion de atributos para la clase persona
	String dni;
	String nombre;
	String apellido;
	String telefono;
	String domicilio;
	
	//coonstructor vacio
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	//Construcor para la inicializacion de los atributos
	public Persona(String dni, String nombre, String apellido, String telefono, String domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}
	//Implementacion de metodos get y set para la toma y modificacion de atributos
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
