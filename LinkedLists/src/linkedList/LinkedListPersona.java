package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPersona {
	//Las linked list son listas enlazadas donde sus objetos se enlazan tanto hacia atras como hacia adelante
	public static void main(String[] args) {
		//Se declara que se crea una lista que contrendra el objeto persona y se gurdara en la variable lista
		List<Persona> lista = new LinkedList<Persona>();
		//Se puede agregar objetos al final de la lista 
		lista.add(new Persona("Ana", "Torres", "Atizapan"));
		lista.add(new Persona("Gabriela", "Gonzales", "Niclas Romero"));
		lista.add(new Persona("Juan", "Godinez", "Torres de satelite"));
		lista.add(new Persona("Pablo", "Estrada", "Puerto"));
		
		//Solamente se puede hacer el recorrido mediante el foreach ya que este tipo de listas no cuneta con indices 
		for(Persona persona:lista) {
				System.out.println("Nombre: "+persona.getNombre());	
		}
		System.out.println("Agregando un elemento al principio de la lista");
		//Se puden agregar elemetos al principio de la lista 
		
		lista.add(0,new Persona("Tifani", "Juatez", "Nezahualcoyotl"));
		for(Persona persona:lista) {
			System.out.println("Nombre: "+persona.getNombre());	
	}
		System.out.println("Agregando un elemento al final de la lista");
		lista.add(new Persona("Norman", "Luke", "Nezahualcoyotl"));
		for(Persona persona:lista) {
			System.out.println("Nombre: "+persona.getNombre());	
	}
	}

}
