package ex3;

import java.util.ArrayList;
import java.util.List;

/** Représente une zone d'animaux du zoo */
public class Zone {
	/** Liste d'animaux de la zone */
	protected List<Animal> listeAnimal = new ArrayList<Animal>();

	/** Ajoute un animal dans la zone */
	public void addAnimal(Animal animal) {
		if (animal != null) {
			listeAnimal.add(animal);
		}
	}

}
