package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEstudiante {
	//Las array list solo permiten agregar elements al final de la lista 
	public static void main(String[] args) {
		//Las array list sirven para hacer conjuntos de objetos iguales  
		
		List<Estudiante>lista = new ArrayList<Estudiante>();
		//Para agregar los objetos se puede hacen intanciando primero el onjeto y luego agrendolo a la lista
		Estudiante estudianteUno = new Estudiante("Jorge", "Herndandez", 1235869, "Primer Semestre");
		Estudiante estudianteDos = new Estudiante("Paul", "Godinez", 1546666369, "Segundo Semestre");
		lista.add(estudianteUno);
		lista.add(estudianteDos);
		
		//Tambien se puede intanciar un objeto y agregarlo directamente a la lista 
		
		lista.add(new Estudiante("Ana", "Torres", 31658974, "Octavo semestre"));
		lista.add(new Estudiante("Gabriela", "Angeles", 317858974, "Noveno semestre"));
		
		//Para hacer el recorrido de la lista se pude hacer mediante indices de un for 
		//Se inicia el indice 0 de la lista 
		System.out.println("Busqueda mediante indices ");
		for(int i=0; i<lista.size();i++ ) {
			//Se toma el indice en el que se encuentra mas un elemto del bjeto
			System.out.println("Los alumonos inscritos son: "+lista.get(i).getNombre() + " Numero de cuenta: " + lista.get(i).getNumeroCuenta());
		}
		
		System.out.println("Busqueda mediante For each");
		//Se pude hacer otro tipo de recorrdo con foreach donde busta por elemento y no por inidice 
		//Se especifica los tipos de objetos donde va a buscar junto a una variable auxiliar donde ira guardado cada elemento y ala d donde los va 
		//a buscar
		for(Estudiante alumno:lista) {
			System.out.println("Los alumonos inscritos son: "+alumno.getNombre()+" Numero de cuenta: "+ alumno.getNumeroCuenta());
		}
	}

}
