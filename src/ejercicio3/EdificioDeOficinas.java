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

	@Override
	public void mostrarAtributos() {
		System.out.println("Edificio de Oficinas:");
        System.out.println("Superficie Edificio: " + getSuperficieEdificio());
        System.out.println("Numero de Oficinas: " + getNumeroDeOficinas());
		
	}

	public void setNumeroDeOficinas(int numeroDeOficinas)
	{
		this.numeroDeOficinas = numeroDeOficinas;
	}
}
