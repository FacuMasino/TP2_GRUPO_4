package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		//Punto 6
		TreeSet<Profesor> listaProfesores = new TreeSet<>();
		
		listaProfesores.add(new Profesor("John",20,"Profesor",1));
		listaProfesores.add(new Profesor("Paul",30,"Director",2));
		listaProfesores.add(new Profesor("George",40,"Profesor",3));
		listaProfesores.add(new Profesor("Ringo",50,"JefeTP",4));
		listaProfesores.add(new Profesor("Martin",60,"Ayudante",5));
		
		Iterator<Profesor> it = listaProfesores.iterator();
		System.out.println("PUNTO 6\n");
		while(it.hasNext())
		{
			Profesor p = it.next();
			System.out.println(p.toString());
		}
		
		//Punto 7
		//CASO: Profesor/a igual
		System.out.println("\nPunto 7 \nCaso de Mismo profesor");
		Profesor p1 = new Profesor("Maria de las Mercedes",35,"Profesora",10);
		Profesor p2 = new Profesor("Maria de las Mercedes",35,"Profesora",10);
		
		if(p1.equals(p2))
			System.out.println("Mismo/a Profesor/a");
		else
			System.out.println("Profesor/a diferente");
		
		
		
		//CASO: Profesor/a diferente
		System.out.println("\nPunto 7 \nCaso de Profesor diferente");
		Profesor p3 = new Profesor("Maria",35,"Profesora",10);
		Profesor p4 = new Profesor("Maria",34,"Profesora",10);
		
		if(p3.equals(p4))
			System.out.println("Mismo/a Profesor/a");
		else
			System.out.println("Profesor/a diferente");
	}
}
