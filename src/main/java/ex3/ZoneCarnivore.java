package ex3;

/** Repr�sente la Zone Carnivore */
public class ZoneCarnivore extends Zone {

	/** Nombre de kg de nourriture */
	private static final double NB_KG = 10;

	/** Retourne la quantit� de nourriture par jour */
	public double calculerKgsNourritureParJour() {
		return listeAnimal.size() * NB_KG;
	}
	/** Affiche les animaux de la zone Carnivore */
	public void afficherListeAnimaux() {
		System.out.println("Pr�sent dans la zone Carnivore :");
		for (Animal animal : listeAnimal) {
			System.out.println(animal.getNom());
		}
	}
}
