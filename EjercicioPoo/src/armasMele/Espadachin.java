package armasMele;

public class Espadachin extends armaMele implements espadaCorta,espadaLarga{

	public Espadachin() {
		super();
	}

	//Se implentan todod los metodos abstractos que se heredador la clase abstracta y las clases de interfase
	@Override
	public void bloqueo() {
		System.out.println("Puedo bloquear ataques");
		
	}

	@Override
	public void estocada() {
		System.out.println("Puedo causar daño a distanicia");
		
	}

	@Override
	public void laceracion() {
		System.out.println("Puedo causa daño por laceraciones");
		
	}

	@Override
	public void desvio() {
		System.out.println("Puedo desviar ataques");
		
	}

	@Override
	protected double ataqueAcendente() {
		cantidadDanio = 18;
		return cantidadDanio;
	}

	@Override
	protected double ataqueDecendente() {
		cantidadDanio = 29;
		return cantidadDanio;
	}

	@Override
	protected double ataqueHorizontal() {
		cantidadDanio = 50;
		return cantidadDanio;
	}

}
