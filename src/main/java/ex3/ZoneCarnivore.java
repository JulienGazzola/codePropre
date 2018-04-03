package ex3;

/** Représente la Zone Carnivore */
public class ZoneCarnivore extends Zone {

	/** Nombre de kg de nourriture */
	private static final double NB_KG = 10;

	/** Retourne la quantité de nourriture par jour */
	public double calculerKgsNourritureParJour() {
		return listeAnimal.size() * NB_KG;
	}
	/** Affiche les animaux de la zone Carnivore */
	public void afficherListeAnimaux() {
		System.out.println("Présent dans la zone Carnivore :");
		for (Animal animal : listeAnimal) {
			System.out.println(animal.getNom());
		}
	}
}
