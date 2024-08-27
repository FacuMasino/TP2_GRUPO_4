package ejercicio3;

public class Edificio implements IEdificable
{
	// Atributos
	
	private double superficieEdificio;
	
	// Constructores
	
	public Edificio()
	{
		
	}
	
	public Edificio(double superficieEdificio)
	{
		this.superficieEdificio = superficieEdificio;
	}
	
	// Getters y Setters

	@Override
	public double getSuperficieEdificio()
	{
		return superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio)
	{
		this.superficieEdificio = superficieEdificio;
	}
}
