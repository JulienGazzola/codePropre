package ex2;

public class LivretA extends CompteBancaire {

	/** Découvert autorisé */
	private static final int MINI_DECOUVERT = 0;

	/** Pourcentage */
	private static final int POURCENT = 100;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * @param solde
	 * @param taux
	 *            de rémunération
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, MINI_DECOUVERT);
		this.tauxRemuneration = tauxRemuneration;

	}

	/** Ajoute la rémunération annuelle */
	public void appliquerRemuAnnuelle() {
		this.setSolde(getSolde() + getSolde() * tauxRemuneration / POURCENT);
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
