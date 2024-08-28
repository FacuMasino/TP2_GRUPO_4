package ejercicio2;

public class mainEjercicio2
{
	public static void main(String[] args){
		
		ProductoFresco productoFresco = new ProductoFresco();
		productoFresco.setNombre("Empanadas");
		productoFresco.setFechaCaducidad("29/08/2024");
		productoFresco.setNroLote(26062011);
		productoFresco.setFechaEnvasado("27/08/2024");
		productoFresco.setPaisOrigen("Argentina");
		System.out.println(productoFresco.toString());
		System.out.println(productoFresco.getInfoEspecifica());
		
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado();
		productoRefrigerado.setNombre("Not Chiken");
		productoRefrigerado.setFechaCaducidad("27/08/24");
		productoRefrigerado.setNroLote(4563456);
		productoRefrigerado.setCodSupervision("F2356MJ5678");
		System.out.println(productoRefrigerado.toString());
		System.out.println(productoRefrigerado.getInfoEspecifica());
		
		ProductoCongelado productoCongelado = new ProductoCongelado();
		productoCongelado.setNombre("Hamburguesa");
		productoCongelado.setFechaCaducidad("16/04/2026");
		productoCongelado.setNroLote(0303456);
		productoCongelado.setTemperaturaRecomendada(-18);
		System.out.println(productoCongelado.toString());
		System.out.println(productoCongelado.getInfoEspecifica());
		
	}
}
