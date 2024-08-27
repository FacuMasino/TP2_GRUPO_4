package ejercicio2;

public class mainEjercicio2
{
	public static void main(String[] args)
	{
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado();
		productoRefrigerado.setNombre("Not Chiken");
		productoRefrigerado.setFechaCaducidad("27/08/24");
		productoRefrigerado.setNroLote(4563456);
		productoRefrigerado.setCodSupervision("F2356MJ5678");
		System.out.println(productoRefrigerado.toString());
		System.out.println(productoRefrigerado.getInfoEspecifica());
	}
}
