package ex2;

public class LivretA extends CompteBancaire {

	/** D�couvert autoris� */
	private static final int MINI_DECOUVERT = 0;

	/** Pourcentage */
	private static final int POURCENT = 100;

	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * @param solde
	 * @param taux
	 *            de r�mun�ration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, MINI_DECOUVERT);
		this.tauxRemuneration = tauxRemuneration;

	}

	/** Ajoute la r�mun�ration annuelle */
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
