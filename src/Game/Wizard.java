package Game;

public class Wizard extends Character{
	//extends -> h�rite de la class m�re Character

	public Wizard(String name, int life, int strengh) {
		super(name, life, strengh); //super -> c'est l'h�ritage des attributs de la classe m�re = soit attributs communs � toutes les classes filles
	}
	
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	public Wizard() {
		super("Slove", 10, 9); //ici, rebelot, j'initialise les attributs de la classe Wizard
		//Reprant le Cas 1 - qui fait que, quand je display() l'instance slove, il m'affichera SES informations l�
		
	}
	
}
