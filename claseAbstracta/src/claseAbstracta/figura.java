package claseAbstracta;
//Las clase abstractas solo sirven como moldes para sus clases hijas y esta no pude ser instanciada
public abstract class figura {
	//EL enncapsulamiento protected solo pude ser usado por las clases hijas
	protected double x;
	protected double y;
	protected double area;
	
	//Se tiene que implemental al menos un metodo abstracto
	public abstract double calcularArea();
	
}
