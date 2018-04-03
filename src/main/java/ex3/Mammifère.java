package ex3;

/** Représente un animal de type Mammifère */
public class Mammifère extends Animal{

	/** Constructeur Mammifère
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Mammifère(String type, String nom, String comportement){
		super();
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
	}
}