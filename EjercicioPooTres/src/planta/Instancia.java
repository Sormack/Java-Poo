package planta;

public class Instancia {

	public static void main(String[] args) {
		Arbol pino = new Arbol("Pino", "Grueso", 45, "Verde con cafe oscuro", "cerrada");
		Flor rosa = new Flor("Rojo", 16, "Rosal", "Primavera");
		Arbusto mata = new Arbusto("Pequeño", true, "mata", "verde", true);
		
		pino.tipoPlanta();
		rosa.tipoPlanta();
		mata.tipoPlanta();
	}

}
