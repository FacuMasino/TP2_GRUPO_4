package ejercicio2;

/*
 * Todos los productos llevan esta informaci�n com�n: 
 * fecha de caducidad y n�mero de lote. 
 * A su vez, cada tipo de producto lleva alguna informaci�n espec�fica.
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

	// M�todos
	
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

	// Este m�todo debe devolver una cadena con toda la informaci�n
	// espec�fica del producto en particular
	public abstract String getInfoEspecifica();
}
