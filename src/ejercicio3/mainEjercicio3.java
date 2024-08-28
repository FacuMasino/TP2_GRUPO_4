package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3
{
    
    public static void main(String[] args)
    {
        ArrayList<IEdificable> edificaciones = new ArrayList<>();
        
        edificaciones.add(new Polideportivo(1, "Polideportivo A", 1500.0));
        edificaciones.add(new Polideportivo(2, "Polideportivo B", 2000.0));
        edificaciones.add(new Polideportivo(3, "Polideportivo C", 2500.0));
        edificaciones.add(new EdificioDeOficinas(3000.0, 50));
        edificaciones.add(new EdificioDeOficinas(4000.0, 75));
        
        Iterator<IEdificable> iterator = edificaciones.iterator();
        
        while (iterator.hasNext())
        {
            IEdificable edificable = iterator.next();
            
            if (edificable instanceof Polideportivo)
            {
                Polideportivo polideportivo = (Polideportivo) edificable;
                System.out.println("Polideportivo:");
                System.out.println("Nombre: " + polideportivo.getNombre());
                System.out.println("Superficie Edificio: " + polideportivo.getSuperficieEdificio());
                System.out.println("Tipo de Instalación: " + polideportivo.getTipoDeInstalacion());
            }
            else if (edificable instanceof EdificioDeOficinas)
            {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificable;
                System.out.println("Edificio de Oficinas:");
                System.out.println("Superficie Edificio: " + edificioDeOficinas.getSuperficieEdificio());
                System.out.println("Número de Oficinas: " + edificioDeOficinas.getNumeroDeOficinas());
            }
            
            System.out.println("--------------------------------");
        }
        
    }
}
