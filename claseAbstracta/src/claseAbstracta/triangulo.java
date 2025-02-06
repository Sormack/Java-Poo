package claseAbstracta;
//Se hace una erencia de la clase abstracta y se implementa su metodo abstracto
public class triangulo extends figura{
	//Esta clase tiene sus propios atributos 
	//Se encapsula como privadas para que sean de uso exclusivo de esta clase 
	private double base = 10;
	private double altura = 8;
	public triangulo() {
		// TODO Auto-generated constructor stub
	}

	
	public triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public double calcularArea() {
		area = base*altura/2;
		return area;
	}

}
