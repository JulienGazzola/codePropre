package ex3;

/** Repr�sente la zone Savane Africaine */
public class SavaneAfricaine extends Zone {

	/** Nombre de kg de nourriture */
	private static final double NB_KG = 10;

	/** Retourne la quantit� de nourriture par jour */
	public double calculerKgsNourritureParJour() {
		return listeAnimal.size() * NB_KG;
	}

	/** Affiche les animaux de la zone Savane Africaine */
	public void afficherListeAnimaux() {
		System.out.println("Pr�sent dans la zone Savane Africaine :");
		for (Animal animal : listeAnimal) {
			System.out.println(animal.getNom());
		}
	}
}
