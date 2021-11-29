package Game;

public class Game {
	
	//Wizard slove = new Wizard(); // j'ai instancié/créé un objet Wizard, appelé Slove -> correspondant à un personnage
	//Wizard dan = new Wizard();
	
	//Cas 1 - instance d'objet avec les valeurs initialisées dans la classe Character
	//Character test = new Character(); // ici une première création d'objet
	//Character test2 = new Character(); // ici une seconde = différente
	//comme dans la class Character, j'ai initialisé, par le constructeur, les valeurs de ces deux objets, leur affichage, via la méthode display() ci-dessous m'affichera les mêmes informations dans les deux cas
	
	//Cas 2 - instance d'objet avec les valeurs initialisées dans chaque instance d'objet
	//Character test = new Character("Mile", 50, 25); // ici une première création d'objet avec des valeurs pours les attributs
	//Character test2 = new Character("Jess", 80, 30); // ici une seconde = différente avec des valeurs pours les attributs
	//ici, comme j'ai défini des valeurs aux attributs (name, life et strengh) l'affichage sera différent
	
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	//Character test = new Character(); -> message : Cannot instantiate the type Character
	//j'instancie donc les objets héritant de cette classe = Wizard, Warrior et Scientist
	Wizard slove = new Wizard();
	Wizard dan = new Wizard();
	//Reprant le Cas 1 - comme dans la class Wizard, j'ai initialisé, par le constructeur, les valeurs de ces deux objets, leur affichage, via la méthode display() ci-dessous m'affichera les mêmes informations dans les deux cas
	//si j'ai besoin d'initialiser des valeurs précises à chaque instance, je mettrais les valeurs directement dans ces instances
	
	Warrior joy = new Warrior();
	
	Scientist peter = new Scientist();
	
	Test agecolor = new Test();
	
	//constructeurs -> fonction appelée lors de l'instanction d'objet de la classe
	
	public void display() {
		//System.out.println(test);
		//System.out.print(test2);
		
		System.out.println(slove);
		System.out.println(dan);
		
		System.out.println(joy);
		
		System.out.println(agecolor);
	}
}
