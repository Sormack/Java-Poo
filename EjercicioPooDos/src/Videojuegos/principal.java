package Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		// Crear una array list donde se guardaran los bjetos y guardarlos
		List<VideoJuego> listaVideoJuegos= new ArrayList<VideoJuego>();
		listaVideoJuegos.add(new VideoJuego(8513, "Smite", "PC", 651651, "Moba"));
		listaVideoJuegos.add(new VideoJuego(3513, "Genshin", "PC", 65367, "Gacha"));
		listaVideoJuegos.add(new VideoJuego(4513, "WuWa", "PC", 6530117, "Gacha"));
		listaVideoJuegos.add(new VideoJuego(6513, "Warzon", "Consola", 65963, "Shoter"));
		listaVideoJuegos.add(new VideoJuego(5613, "Battletfiel", "Consola", 571651, "Shoter"));
		
		//Recorrer la lista y mostra por pantalla el Nombre, categoria y plataforma 
		for(VideoJuego elementoLista:listaVideoJuegos) {
			System.out.println("Codigo:"+elementoLista.getCodigo()+" Videojuego:"+ elementoLista.getTitulo()+" Genero:"+elementoLista.getCategoria()+" Plataforma:"
					+ elementoLista.getCosola());
		}
		System.out.println("----------------------------------");
		//Cambiar dos atributos de dos elemetos de la lista
		
		for(VideoJuego elementoLista:listaVideoJuegos) {
			String nombre = "WuWa";
			if(elementoLista.getTitulo().equals(nombre)) {
				elementoLista.setTitulo("ZZZ");
			}
		}
		for(VideoJuego elementoLista:listaVideoJuegos) {
			String nombre = "Smite";
			if(elementoLista.getTitulo().equals(nombre)) {
				elementoLista.setTitulo("LoL");
			}
		}
		
		for(VideoJuego elementoLista:listaVideoJuegos) {
			int codigo = 8513;
			if(elementoLista.getCodigo() == codigo) {
				elementoLista.setCodigo(8936);;
			}
		}
		for(VideoJuego elementoLista:listaVideoJuegos) {
			int codigo = 3513;
			if(elementoLista.getCodigo() == codigo) {
				elementoLista.setCodigo(9636);
			}
		}
		for(VideoJuego elementoLista:listaVideoJuegos) {
			System.out.println("Codigo:"+elementoLista.getCodigo()+" Videojuego:"+ elementoLista.getTitulo()+" Genero:"+elementoLista.getCategoria()+" Plataforma:"
					+ elementoLista.getCosola());
		}
		System.out.println("---------------------------------");
		//Mostra por pantalla solamente los juegos gacha
		for(VideoJuego elementoLista:listaVideoJuegos) {
			if(elementoLista.getCategoria().equals("Gacha"))
			System.out.println("Codigo:"+elementoLista.getCodigo()+" Videojuego:"+ elementoLista.getTitulo()+" Genero:"+elementoLista.getCategoria()+" Plataforma:"
					+ elementoLista.getCosola());
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
