package interfase;

public class NuevaFigura {

	public static void main(String[] args) {
		Circulo circulo  = new Circulo();
		System.out.println("El area de circulo es: "+circulo.calcularArea());
		circulo.dibujable();
		
	}

}
