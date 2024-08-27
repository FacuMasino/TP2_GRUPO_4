package ejercicio3;

public class EdificioDeOficinas extends Edificio
{
	// Atributos
	
	private int numeroDeOficinas;
	
	// Constructores
	
	public EdificioDeOficinas()
	{
		
	}
	
	public EdificioDeOficinas(double superficieEdificio, int numeroDeOficinas)
	{
		super(superficieEdificio);
		this.numeroDeOficinas = numeroDeOficinas;
	}

	// Getters y Setters
	
	
	public int getNumeroDeOficinas()
	{
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas)
	{
		this.numeroDeOficinas = numeroDeOficinas;
	}
}
