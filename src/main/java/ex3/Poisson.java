package ex3;

/** Représente un animal de type Poisson */ 
public class Poisson extends Animal{
	/** Constructeur Poisson
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Poisson(String type, String nom, String comportement){
		super();
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
	}
}
