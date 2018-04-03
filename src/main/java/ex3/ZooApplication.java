package ex3;

/** Représente l'application zoo */
public class ZooApplication {

	/** Lance l'application */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Mammifère("MAMMIFERE", "Gazelle", "HERBIVORE"));
		zoo.addAnimal(new Mammifère("MAMMIFERE", "Zèbre", "HERBIVORE"));
		zoo.addAnimal(new Mammifère("MAMMIFERE", "Lion", "CARNIVORE"));
		zoo.addAnimal(new Mammifère("MAMMIFERE", "Panthère", "CARNIVORE"));
		zoo.addAnimal(new Poisson("POISSON", "Requin blanc", "CARNIVORE"));
		zoo.addAnimal(new Poisson("POISSON", "Truite dorée", "HERBIVORE"));
		zoo.addAnimal(new Reptile("REPTILE", "Boa constrictor", "CARNIVORE"));
		zoo.addAnimal(new Reptile("REPTILE", "Python", "CARNIVORE"));
		
		zoo.afficherListeAnimaux();
	}
}
