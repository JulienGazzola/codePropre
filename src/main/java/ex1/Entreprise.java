package ex1;

import java.util.Date;

/** Représente une entreprise */
public class Entreprise {

	/** Siret */
	private int siret;

	/** Nom */
	private String nom;

	/** Adresse */
	private String adresse;

	/** Date création */
	private Date dateCreation;

	/** Capital Maximum */
	public static final int capitalMax = 3000000;

	/** Affiche le status */
	public void afficherStatut() {

	}

	/** getter Sirret */
	public int getSiret() {
		return siret;
	}

	/** setter Sirret */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** getter Nom */
	public String getNom() {
		return nom;
	}

	/** setter Nom */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** getter Adresse */
	public String getAdresse() {
		return adresse;
	}

	/** setter Adresse */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** getter Date de création */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** setter Date de création */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
