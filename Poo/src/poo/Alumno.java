package poo;

/*Todos los nombres de las clases inician con mayusculas 
 * y en singular que que sirven como moldes para crear onjetos*/
public class Alumno {
	//Los atributos son caractericas que sirven para crear un molde
	//Esta son variables globales 
	int dni;
	String nombre;
	String apellido;
	
	//Los metodos son acciones que puede realizar la clase alumno y estos metodos 
	//pueden o no debolver un valor 
	
	//Este es un procedimiento el cual no debuelve ningun valor y solo realizar las accun que se programa
	public void mostrarNombre() {
		System.out.println("Soy un alumno y este es mi Nombre:");
	}
	
	//Este es un procedimiento el cual indica si un alumno aprobp o no
	//Los metodos puden o no recibir una o varias variables 
	public void saberCalificacion(double calificacion) {
		if (calificacion >= 6) {
			System.out.println("El alumno aprobo");
		}else {
			System.out.println("El alumono reprobo");
		}
	}
	//Este es un metodo constructor por defecto el cual no recibe ni debuelve ningun valor
	public Alumno() {
	}
	//Los metodos set sirve para poder acceder a los valores de los atributos de la clase
	public int getDni() {
		return dni;
	}
	//Los metodos get sirven para modificar o sobreescribir valores ya establecidos
	public void setDni(int dni) {
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

	//Este metodo constructor los que hace es inicializar los atributos de la clase 
	//Los variables que se generan aqui solo son de usu local 
	public Alumno(int dni, String nombre, String apellido) {
		//con this hace referencia a que en la variables globales se les asigne el valor 
		// que recibe el contructor
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
