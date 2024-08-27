package ejercicio2;

public class ProductoRefrigerado extends Producto {
	
	// Atributos
	
	private String codSupervision;
	
	// Constructores
	
	public ProductoRefrigerado()
	{
		
	}
	
	public ProductoRefrigerado(String nombre, String fechaCaducidad, int nroLote, String codSupervision)
	{
		super(nombre, fechaCaducidad, nroLote);
		this.codSupervision = codSupervision;
	}
	
	// Getters y Setters
	
	public String getCodSupervision()
	{
		return codSupervision;
	}
	
	public void setCodSupervision(String codSupervision)
	{
		this.codSupervision = codSupervision;
	}

	// Metodos

	@Override
	public String getInfoEspecifica()
	{
		return String.format("Codigo del organismo de supervision alimentaria: %s \n", codSupervision);
	}
}
