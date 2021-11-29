package Game;

public class Game {
	
	//Wizard slove = new Wizard(); // j'ai instanci�/cr�� un objet Wizard, appel� Slove -> correspondant � un personnage
	//Wizard dan = new Wizard();
	
	//Cas 1 - instance d'objet avec les valeurs initialis�es dans la classe Character
	//Character test = new Character(); // ici une premi�re cr�ation d'objet
	//Character test2 = new Character(); // ici une seconde = diff�rente
	//comme dans la class Character, j'ai initialis�, par le constructeur, les valeurs de ces deux objets, leur affichage, via la m�thode display() ci-dessous m'affichera les m�mes informations dans les deux cas
	
	//Cas 2 - instance d'objet avec les valeurs initialis�es dans chaque instance d'objet
	//Character test = new Character("Mile", 50, 25); // ici une premi�re cr�ation d'objet avec des valeurs pours les attributs
	//Character test2 = new Character("Jess", 80, 30); // ici une seconde = diff�rente avec des valeurs pours les attributs
	//ici, comme j'ai d�fini des valeurs aux attributs (name, life et strengh) l'affichage sera diff�rent
	
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	//Character test = new Character(); -> message : Cannot instantiate the type Character
	//j'instancie donc les objets h�ritant de cette classe = Wizard, Warrior et Scientist
	Wizard slove = new Wizard();
	Wizard dan = new Wizard();
	//Reprant le Cas 1 - comme dans la class Wizard, j'ai initialis�, par le constructeur, les valeurs de ces deux objets, leur affichage, via la m�thode display() ci-dessous m'affichera les m�mes informations dans les deux cas
	//si j'ai besoin d'initialiser des valeurs pr�cises � chaque instance, je mettrais les valeurs directement dans ces instances
	
	Warrior joy = new Warrior();
	
	Scientist peter = new Scientist();
	
	Test agecolor = new Test();
	
	//constructeurs -> fonction appel�e lors de l'instanction d'objet de la classe
	
	public void display() {
		//System.out.println(test);
		//System.out.print(test2);
		
		System.out.println(slove);
		System.out.println(dan);
		
		System.out.println(joy);
		
		System.out.println(agecolor);
	}
}
