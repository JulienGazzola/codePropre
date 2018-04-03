package ex3;

/** Représente un animal de type Reptile */ 
public class Reptile extends Animal{
	/** Constructeur Reptile
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Reptile(String type, String nom, String comportement){
		super();
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
	}
}
