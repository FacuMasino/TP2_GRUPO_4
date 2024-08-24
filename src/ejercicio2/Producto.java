package ejercicio2;

/*
 * Todos los productos llevan esta información común: 
 * fecha de caducidad y número de lote. 
 * A su vez, cada tipo de producto lleva alguna información específica.
 */
public abstract class Producto {
	
	// Atributos
	private String nombre;
	private String fechaCaducidad;
	private int nroLote;

	// Constructores
	
	public Producto() {
		nombre = "Sin nombre";
		fechaCaducidad = "01/01/1990";
		nroLote = 0;
	}
	
	public Producto(String nombre, String fechaCaducidad, int nroLote) {
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.nroLote = nroLote;
	}

	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNroLote() {
		return nroLote;
	}

	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	// Métodos
	
	@Override
	public String toString() {
		return String.format(
		"\n******************************" +
	    "\nNombre: %s \nFecha de Caducidad: %s \nLote Nro: %d" +
	    "\n********INFO ESPECIFICA*******\n" + getInfoEspecifica() +
		"\n******************************",
		nombre, fechaCaducidad, nroLote
	    );
	}

	// Este método debe devolver una cadena con toda la información
	// específica del producto en particular
	public abstract String getInfoEspecifica();
}
