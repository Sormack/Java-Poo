package herencia;

public class Herencia {

	public static void main(String[] args) {
		//Se instancia o se crea un nuevo objeto el cual contiene todos atributos y metodos de la clase persona y jefe
		Jefe jefeUno = new Jefe("645613", "Pepe", "Torres", "65451685", "cataras", "polanco", "6546546");
		//Si el constructor de inicializacion de atributos para persona y trabajador se generaron por separado se tendra que 
		//acceder a los metodos set de alguna de las dos clase
		//Se genero un nuevo empleado con metodo contructor de la clase super o de la clase persona 
		Trabajador trabajadorUno = new Trabajador("65423","Juan", "Estrada", "65364849", "Juarez");
		trabajadorUno.setIdEmpleado("89484");
		trabajadorUno.setOcupacion("jardinero");
		System.out.println("Dni: " + trabajadorUno.getDni());
		
		//El polimorfismo funciona para crear vectores o arreglos el cual solo puede contener objetos de la clase padre y las clases 
		//hijas 
		
		Persona vector[] = new Persona[3];
		vector[0] = new Persona();
		vector[1]= new Trabajador();
		vector[2] = new Jefe();
	}

}
