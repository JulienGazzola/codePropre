package ex3;

/** Représente un animal */
public class Animal {
	/** Nom */
	String nom;

	/** Comportement */
	String comportement;

	/** Type */
	String type;

	/** Getter nom */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter nom
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter comportement */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter comportement
	 * 
	 * @param comportement
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	/** Getter type */
	public String getType() {
		return type;
	}

	/**
	 * Setter type
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
