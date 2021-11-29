package Game;

public class Main {
//le Main lance le programme - c'est le point d'entrée
	public static void main(String[] args) {
		
		Game game = new Game(); 
		// j'instancie l'objet Game, nommé game, pour construire l'objet en question et utiliser ses valeurs, méthodes, etc.
		// Pourquoi le game ? -> car quand on veut jouer à un jeu, on lance le jeu donc on débute par le game
		game.display();
		
		System.out.println("Hello");
	}

}
