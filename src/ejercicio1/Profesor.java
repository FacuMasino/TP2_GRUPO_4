package ejercicio1;

public class Profesor extends Empleado {
	
	// Atributos
	private String cargo;
	private int antiguedadDocente;
	
	//Constructores
	public Profesor() {
		
		super();
	};
	
	public Profesor(String nombre, int edad, String cargo, int antiguedad) {
		
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedad;
	}
	
	// Getters y setters
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	//Punto 4
	@Override
	public String toString() {
		
		return super.toString() + ", Cargo= " + cargo + ", Antiguedad=" + antiguedadDocente;
	}
	
	
	
}
