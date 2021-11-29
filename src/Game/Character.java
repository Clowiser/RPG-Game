package Game;

public abstract class Character {
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	//abstract = je ne peux pas instancier d'objet de cette classe et, tous les attributs et m�thodes de cette classe iront aux classes filles
	//Pourquoi passer cette classe en abstract ? -> car, dans notre jeu, ce n'est le Character qui nous int�resse mais le type de personnage (si c'est un sorcier, un guerrier ou un scientifique)
	//De plus, Character, c'est bien trop vaste pour le d�finir (si on me demande de dessiner un personnage, je ne saurais pas quoi dessiner) donc on ne l'instancie pas
	
	//attributs 
	//-> 
	private String name;
	private int life;
	private int strengh;
	
	//Constructeur
	//-> m�thode qui permet d'initialiser les attributs, soit leurs valeurs, SOIT leurs instances, de la class
	public Character(String name, int life, int strengh) {
		this.name = name;
		this.life = life;
		this.strengh = strengh;
	}
	//on d�finit une m�thode Character qui a le m�me nom que la class, qui re�oit 3 param�tres pour pouvoir initalialiser, dans le corps de la m�thode en question les 3 attributs d�clar�s
	
	/*3 diff�rences des constructeurs par rapport aux autres m�thodes :
	* pas de type de retour = pas de void
	* m�me nom que la class
	* invoqu�s syst�matiquement � chaque fois d'une instance est cr��e
	*/
	
	//Cas 1 - instance d'objet avec les valeurs initialis�es dans la classe Character
	//initialisation des attributs avec des valeurs = si display() instance alors affiche les m�mes infos
	/*public Character() { 
		this.name = "Test";
		this.life = 52;
		this.strengh = 80;
	}*/
	// ici, j'initialise les attributs du character � "Test", 52 et 80 -> ce sont ces infos de base (comme moi, je m'appelle Jessica, 120 et 50)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getStrengh() {
		return strengh;
	}

	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}
	
	/*ACCESSEURS : pour r�cup�rer et modifier les valeurs private de la classe - valeurs misent en private pour des raisons de s�curit�s, afin de ne pas modifier leurs d�clarations
	 * les getters r�cup�rent la valeur
	 * les setters permettent de modifier la valeur
	 */
	
	public String toString() {
		return "le personnage s'appelle " + this.name + ", il a une vie de " + this.life + " et une force de " + this.strengh;
	}
	//pourquoi le toString() s'afficher, via display(), � chaque instance cr��e -> car les m�thodes pr�sentes dans la class parent sont aussi utilis�es dans la class enfant, via l'h�ritage
}
