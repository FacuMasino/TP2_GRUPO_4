package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		//Punto 5
		List<Profesor> listaProfesores = new ArrayList<>();
		
		listaProfesores.add(new Profesor("Juan", 33, "Profesor", 5));
		listaProfesores.add(new Profesor("Gonzalo", 31, "Director", 9));
		listaProfesores.add(new Profesor("Maximiliano", 30, "Rector", 7));
		listaProfesores.add(new Profesor("Ana", 29, "Profesora", 3));
		listaProfesores.add(new Profesor("Facundo", 25, "Profesor", 4));
		
		ListIterator<Profesor> iterarProfesores = listaProfesores.listIterator();
		while(iterarProfesores.hasNext()) {
			
			Profesor profesor = iterarProfesores.next();
			System.out.println(profesor.toString());
		
		}
		
	}

}
