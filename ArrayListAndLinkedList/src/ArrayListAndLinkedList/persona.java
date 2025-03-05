package ArrayListAndLinkedList;

public class persona {
	String  nombre;
	String apellido;
	String direccion;
	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public persona() {
		// TODO Auto-generated constructor stub
	}

	public persona(String nombre, String apellido, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	//Este metodo funciona para pasar una direccion de la lista en memoria a un string 
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
}
