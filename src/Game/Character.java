package Game;

public abstract class Character {
	//Cas 3 - classe Character en abstract + instance des objets des classes filles
	//abstract = je ne peux pas instancier d'objet de cette classe et, tous les attributs et méthodes de cette classe iront aux classes filles
	//Pourquoi passer cette classe en abstract ? -> car, dans notre jeu, ce n'est le Character qui nous intéresse mais le type de personnage (si c'est un sorcier, un guerrier ou un scientifique)
	//De plus, Character, c'est bien trop vaste pour le définir (si on me demande de dessiner un personnage, je ne saurais pas quoi dessiner) donc on ne l'instancie pas
	
	//attributs 
	//-> 
	private String name;
	private int life;
	private int strengh;
	
	//Constructeur
	//-> méthode qui permet d'initialiser les attributs, soit leurs valeurs, SOIT leurs instances, de la class
	public Character(String name, int life, int strengh) {
		this.name = name;
		this.life = life;
		this.strengh = strengh;
	}
	//on définit une méthode Character qui a le même nom que la class, qui reçoit 3 paramètres pour pouvoir initalialiser, dans le corps de la méthode en question les 3 attributs déclarés
	
	/*3 différences des constructeurs par rapport aux autres méthodes :
	* pas de type de retour = pas de void
	* même nom que la class
	* invoqués systématiquement à chaque fois d'une instance est créée
	*/
	
	//Cas 1 - instance d'objet avec les valeurs initialisées dans la classe Character
	//initialisation des attributs avec des valeurs = si display() instance alors affiche les mêmes infos
	/*public Character() { 
		this.name = "Test";
		this.life = 52;
		this.strengh = 80;
	}*/
	// ici, j'initialise les attributs du character à "Test", 52 et 80 -> ce sont ces infos de base (comme moi, je m'appelle Jessica, 120 et 50)

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
	
	/*ACCESSEURS : pour récupérer et modifier les valeurs private de la classe - valeurs misent en private pour des raisons de sécurités, afin de ne pas modifier leurs déclarations
	 * les getters récupèrent la valeur
	 * les setters permettent de modifier la valeur
	 */
	
	public String toString() {
		return "le personnage s'appelle " + this.name + ", il a une vie de " + this.life + " et une force de " + this.strengh;
	}
	//pourquoi le toString() s'afficher, via display(), à chaque instance créée -> car les méthodes présentes dans la class parent sont aussi utilisées dans la class enfant, via l'héritage
}
