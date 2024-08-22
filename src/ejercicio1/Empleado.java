package ejercicio1;

public class Empleado {
	
	// Atributos
	private static int contadorId = 999;
	
	private final int id; 
	private String nombre;
	private int edad;
	
	//Constructores
	
	public Empleado() 
	{
		contadorId ++;
		
		this.id = contadorId;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad)
	{
		contadorId ++;
		
		this.id = contadorId;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Getters y setters
	
	public int getId()
	{
		return id;
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	} 
	
	//Punto 6 y 7

	public static int devuelveProximoId()
	{
		return contadorId+1;
	}
	
	@Override
	public String toString() {
		return "Empleado: ID= "+ id +", Nombre= " + nombre + ", Edad= " + edad;
	}
	
}
