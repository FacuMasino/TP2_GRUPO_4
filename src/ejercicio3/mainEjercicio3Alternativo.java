package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3Alternativo {

	public static void main(String[] args) 
	{
		ArrayList<IEdificable> edificaciones = new ArrayList<>();
        
        edificaciones.add(new Polideportivo(1, "Polideportivo A", 1500.0));
        edificaciones.add(new Polideportivo(2, "Polideportivo B", 2000.0));
        edificaciones.add(new Polideportivo(3, "Polideportivo C", 2500.0));
        edificaciones.add(new EdificioDeOficinas(3000.0, 50));
        edificaciones.add(new EdificioDeOficinas(4000.0, 75));
        edificaciones.add(new Edificio(1000.0));
        edificaciones.add(new Edificio(5000.0));
        
        Iterator<IEdificable> iterator = edificaciones.iterator();
        
        while(iterator.hasNext())
        {
        	IEdificable edificable = iterator.next();
        	edificable.mostrarAtributos();
        	System.out.println("--------------------------------");
        }
	}

}
