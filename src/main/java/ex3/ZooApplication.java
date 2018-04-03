package ex3;

/** Repr�sente l'application zoo */
public class ZooApplication {

	/** Lance l'application */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Mammif�re("MAMMIFERE", "Gazelle", "HERBIVORE"));
		zoo.addAnimal(new Mammif�re("MAMMIFERE", "Z�bre", "HERBIVORE"));
		zoo.addAnimal(new Mammif�re("MAMMIFERE", "Lion", "CARNIVORE"));
		zoo.addAnimal(new Mammif�re("MAMMIFERE", "Panth�re", "CARNIVORE"));
		zoo.addAnimal(new Poisson("POISSON", "Requin blanc", "CARNIVORE"));
		zoo.addAnimal(new Poisson("POISSON", "Truite dor�e", "HERBIVORE"));
		zoo.addAnimal(new Reptile("REPTILE", "Boa constrictor", "CARNIVORE"));
		zoo.addAnimal(new Reptile("REPTILE", "Python", "CARNIVORE"));
		
		zoo.afficherListeAnimaux();
	}
}
