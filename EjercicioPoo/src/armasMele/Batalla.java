package armasMele;

public class Batalla {

	public static void main(String[] args) {
		
		Espadachin espadachinUno = new Espadachin();
		Espadachin espadachinDos = new Espadachin();
		
		espadachinUno.setNombreArma("Espada corta de hierro");
		espadachinUno.setDanioElementalArma("Fisico");
		espadachinUno.setTipoDanioArma("Cortantente");
		espadachinUno.setCantidadDanio(8);
		
		espadachinDos.setNombreArma("Espada larga de hierro");
		espadachinDos.setDanioElementalArma("Fuego");
		espadachinDos.setTipoDanioArma("Cortantente");
		espadachinDos.setCantidadDanio(12);
		
		System.out.println("Soy el combatiende uno y huso: " + espadachinUno.getNombreArma());
		System.out.println("Mi daño es de tipo: " + espadachinUno.getDanioElementalArma()+" y "+ espadachinUno.getTipoDanioArma());
		System.out.println("Mi daño base es de: " +espadachinUno.getCantidadDanio());
		System.out.println("---------------------------------------");
		
		System.out.println("Soy el combatiende Dos y huso: " + espadachinDos.getNombreArma());
		System.out.println("Mi daño es de tipo: " + espadachinDos.getDanioElementalArma()+" y "+ espadachinDos.getTipoDanioArma());
		System.out.println("Mi daño base es de: " +espadachinDos.getCantidadDanio());
		System.out.println("---------------------------------------");
		
		
		
	}

}
