package ejercicio3;

public class Polideportivo extends InstalacionDeportiva implements IEdificable
{
	// Atributos
	
	private String nombre;
	private double superficieEdificio;
	
	// Constructores
	
	public Polideportivo()
	{
		
	}
	
	public Polideportivo(int tipoDeInstalacion, String nombre, double superficieEdificio)
	{
		super(tipoDeInstalacion);
		this.superficieEdificio = superficieEdificio;
		this.nombre = nombre;
	}
	
	// Getters y Setters
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setSuperficieEdificio(double superficieEdificio)
	{
		this.superficieEdificio = superficieEdificio;
	}
	
	@Override
	public double getSuperficieEdificio()
	{
		return superficieEdificio;
	}
}
