package Game;

public class Wizard extends Character{
	//extends -> hérite de la class mère Character

	public Wizard(String name, int life, int strengh) {
		super(name, life, strengh); //super -> c'est l'héritage des attributs de la classe mère = soit attributs communs à toutes les classes filles
	}
	
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	public Wizard() {
		super("Slove", 10, 9); //ici, rebelot, j'initialise les attributs de la classe Wizard
		//Reprant le Cas 1 - qui fait que, quand je display() l'instance slove, il m'affichera SES informations là
		
	}
	
}
