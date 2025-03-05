package ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		//Arreglo mediante un array list
		List<persona> arrayList = new ArrayList<persona>();
		arrayList.add(new persona("Ana", "Torres", "Atizapan"));
		arrayList.add(new persona("Gabriela", "Gonzales", "Niclas Romero"));
		arrayList.add(new persona("Juan", "Godinez", "Torres de satelite"));
		arrayList.add(new persona("Pablo", "Estrada", "Puerto"));
		
		//Arreglo mediante una linked list
		List<persona> linkedList = new LinkedList<persona>();
		linkedList.add(new persona("Ana", "Torres", "Atizapan"));
		linkedList.add(new persona("Gabriela", "Gonzales", "Niclas Romero"));
		linkedList.add(new persona("Juan", "Godinez", "Torres de satelite"));
		linkedList.add(new persona("Pablo", "Estrada", "Puerto"));
		
		System.out.println("Lista con todos los objetos de la array list:");
		for (persona persona : arrayList) {
			System.out.println("Nombre: " + persona.getNombre()+" "+persona.getApellido()+" Direccion: "+persona.getDireccion());
		
		}
		
		System.out.println("\nEliminando un elemento especifico de la lisa mediante su indice");
		arrayList.remove(2);
		for (persona persona : arrayList) {
			System.out.println("Nombre: " + persona.getNombre()+" "+persona.getApellido()+" Direccion: "+persona.getDireccion());
		
		}
		System.out.println("\nLista con todos los objetos de la linked list:");
		for (persona persona : linkedList) {
			System.out.println("Nombre: " + persona.getNombre()+" "+persona.getApellido()+" Direccion: "+persona.getDireccion());
		
		}
		System.out.println("\nEliminando un elemento de una linked list");
		//En las linked list no se pude elimira elementos mediante indices se necesita de un valo especificp de la linked list
		String remover = "Godinez";
		//Se hace el recorrido de la lista mediante elemetos y se guradan en la variable auxiliar
		for(persona personaRemovida: linkedList) {
			//Se genere una condicional el cual se toma un atributo del objeto y se compara con la variable a remover 
			if(personaRemovida.getApellido().equals(remover)) {
			//Una vez encontrado se remueve de la lista haciendo referencia en el que se encuntra actual 
			linkedList.remove(personaRemovida);
			//Al eliminra un elementod de una linked list es necesario romper el for para que los punters se restablescan 
			break;
			}
		}
		//Una vez que el for se rompio y se reestablecio los punteros se pude volver a recorrer
		for (persona persona : linkedList) {
			System.out.println("Nombre: " + persona.getNombre()+" "+persona.getApellido()+" Direccion: "+persona.getDireccion());
		}
		
		//Se pude saber el tamaño de las lista
		System.out.println("\nTamaño de la lista para la array list: ");
		System.out.println("Cantidad de personas en la arra list: " + arrayList.size());
		System.out.println("\nTamaño de la lista para la linked list: ");
		System.out.println("Cantidad de personas en la linked list: " + arrayList.size());
		
		//Se pude obtener el primer y ultimo obejto de una linked list 
		System.out.println("Primer elemento de la linked list : " + linkedList.getFirst().toString());
		//Se pude obtener el ultim elemento de una linked list 
		System.out.println("Ultim elemento de la linked list : " + linkedList.getLast().toString());
		
		//Se pude borra toda el contenido de ambas lista 
		//Para una array list
		System.out.println("\nBorrando la array list: ");
		arrayList.clear();
		//Para una linked list
		System.out.println("\nBorrando la linked list: ");
		linkedList.clear();
		
		//Se pude comprobar si una lista esta esta vacia 
		System.out.println("\nNo hay elementos en la array list: "+ arrayList.isEmpty());
		System.out.println("\nNo hay elementos en la linked list: "+ linkedList.isEmpty());

		
		
	}	
}
