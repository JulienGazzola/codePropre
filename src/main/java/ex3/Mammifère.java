package ex3;

/** Repr�sente un animal de type Mammif�re */
public class Mammif�re extends Animal{

	/** Constructeur Mammif�re
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Mammif�re(String type, String nom, String comportement){
		super();
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
	}
}