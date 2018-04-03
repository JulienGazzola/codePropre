package ex3;

/** Repr�sente la zone Ferme aux Reptiles */
public class FermeReptile extends Zone {

	/** Nombre de kg de nourriture */
	private static final double NB_KG = 0.1;

	/** Retourne la quantit� de nourriture par jour */
	public double calculerKgsNourritureParJour() {
		return listeAnimal.size() * NB_KG;
	}

	/** Affiche les animaux de la zone Ferme aux Reptiles */
	public void afficherListeAnimaux() {
		System.out.println("Pr�sent dans la zone Ferme Reptile :");
		for (Animal animal : listeAnimal) {
			System.out.println(animal.getNom());
		}
	}
}
