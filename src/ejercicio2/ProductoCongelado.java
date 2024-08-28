package ejercicio2;

public class ProductoCongelado extends Producto{
	
	private int temperaturaRecomendada;
	
	public ProductoCongelado() {
		
		super();
		this.temperaturaRecomendada = 0;
	}
	
	public ProductoCongelado(String nombre, String fecha, int lote, int temperatura) {
		
		super(nombre, fecha, lote);
		this.temperaturaRecomendada = temperatura;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String getInfoEspecifica() {
		
		return String.format("Temperatura recomendada: %d \n", temperaturaRecomendada);
	}

}
