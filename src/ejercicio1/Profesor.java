package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	
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

	@Override
	public int compareTo(Profesor o) {
		//Ordenamiento por Antiguedad...
		if(o.antiguedadDocente == this.antiguedadDocente)
			return 0;
		
		if(o.antiguedadDocente < this.antiguedadDocente)
		{
			return -1;
		}
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		//if (getClass() != obj.getClass())
		//	return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}	
	
}
