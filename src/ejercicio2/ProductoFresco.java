package ejercicio2;

public class ProductoFresco extends Producto {
	
	// Atributos
	
	private String fechaEnvasado;
	private String paisOrigen;

	// Constructores
	
	public ProductoFresco () {
		
		super();
		fechaEnvasado = "01/01/1990";
		paisOrigen = "No Determinado";
		
	}
	
	public ProductoFresco (String nombre, String fechaCaducidad, int nroLote,  String fechaEnvasado, String paisOrigen ) {
		
		super(nombre, fechaCaducidad,nroLote );
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
		
	// Getters y Setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	
	//Métodos
	
	@Override
	public String getInfoEspecifica() {
		return String.format(
			    "Fecha de Envasado: %s \nPais de Origen: %s",
				 fechaEnvasado, paisOrigen
			    );
	}

}

	