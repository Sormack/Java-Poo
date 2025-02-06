package arrayList;

public class Estudiante {
	String Nombre;
	String Apellido;
	int numeroCuenta;
	String Semestre;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellido, int numeroCuenta, String semestre) {
		Nombre = nombre;
		Apellido = apellido;
		this.numeroCuenta = numeroCuenta;
		Semestre = semestre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
	
	
	
}
