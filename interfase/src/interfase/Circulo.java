package interfase;

public class Circulo implements Figura,dibujable{
	private double radio = 8;
	//Cnstructor vacio
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	//Contructor sobrecargado ya que este se diferencia del anterior ya que recibe parametros
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	//Se hace una sobre escritura del metodo heredado de figura 
	@Override
	public double calcularArea() {
		double resultado = 3.14 * radio*radio;
		return resultado;
	}
	//Se hace una sobre escritura del metodo heredado de dibujable
	@Override
	public void dibujable() {
		System.out.println("Si se puede dibujar");
		
	}
}
