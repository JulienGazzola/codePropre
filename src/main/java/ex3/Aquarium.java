package ex3;

/** Repr�sente la zone Aquarium */
public class Aquarium extends Zone {

	/** Nombre de kg de nourriture */
	private static final double NB_KG = 0.2;

	/** Retourne la quantit� de nourriture par jour */
	public double calculerKgsNourritureParJour() {
		return listeAnimal.size() * NB_KG;
	}

	/** Affiche les animaux de la zone Aquarium */
	public void afficherListeAnimaux() {
		System.out.println("Pr�sent dans la zone Aquarium :");
		for (Animal animal : listeAnimal) {
			System.out.println(animal.getNom());
		}
	}
}
