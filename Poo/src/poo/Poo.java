package poo;

public class Poo {

	public static void main(String[] args) {
		//Para crear un nuevo objeto o instanciar un objeto es necesario poner 
		//el nombre la clase el cual sirve de molde
		//Esta instanica es generado con el constructor vacio el el cual no recibe ningun parameto
		Alumno alumnoUno = new Alumno();
		//Esta intancia se genera a travez del constructor que recibe parametros
		Alumno alumnoDos = new Alumno(2465, "Jose", "Suarez");
		
		
		//Para poder mostara los datos del objeto alumno es necesesario usar los metodo de get
		//Se toma el objeto de alumno dos y mediante el metodo get se obtine el valor de uno de
		//sus atributos
		System.out.println("El id del alumno es: "+alumnoDos.getDni());
		System.out.println("EL nombre del alumno es: "+alumnoDos.getNombre());
		System.out.println("El apellido del alumno es: "+alumnoDos.getApellido());
		System.out.println("***********************************************");
		
		//Se pude tomar el objeto bacio de alumno uno y mediante los metodos set asignar o modifica 
		//nuevos valores 
		alumnoUno.setDni(5);
		alumnoUno.setNombre("Juan");
		alumnoUno.setApellido("Perez");
		System.out.println("El id del alumno es: "+alumnoUno.getDni());
		System.out.println("EL nombre del alumno es: "+alumnoUno.getNombre());
		System.out.println("El apellido del alumno es: "+alumnoUno.getApellido());
		System.out.println("***********************************************");
		
		//Se sobre escribe el valor contenido en nombre 
		alumnoDos.setNombre("Ana");
		System.out.println("El id del alumno es: "+alumnoDos.getDni());
		System.out.println("EL nombre del alumno es: "+alumnoDos.getNombre());
		System.out.println("El apellido del alumno es: "+alumnoDos.getApellido());
		System.out.println("***********************************************");
	}

}
