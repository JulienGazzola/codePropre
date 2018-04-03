package ex3;

/** Représente le Zoo */
public class Zoo {
	/** nom */
	private String nom;
	/** zone Savane Africaine */
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	/** zone Carnivore */
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	/** zone Ferme Reptile */
	private FermeReptile fermeReptile = new FermeReptile();
	/** zone Aquarium */
	private Aquarium aquarium = new Aquarium();

	/**
	 * Création du zoo
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Ajoute un animal dans la zone en fonction de son type et son comportement
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals("MAMMIFERE")) {
			if (animal.getComportement().equals("CARNIVORE")) {
				zoneCarnivore.addAnimal(animal);
			} else {
				savaneAfricaine.addAnimal(animal);
			}
		} else if (animal.getType().equals("POISSON")) {
			aquarium.addAnimal(animal);
		} else if (animal.getType().equals("REPTILE")) {
			fermeReptile.addAnimal(animal);
		}
	}

	/** Affiche la liste des animaux */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
