package Game;

public class Main {
//le Main lance le programme - c'est le point d'entr�e
	public static void main(String[] args) {
		
		Game game = new Game(); 
		// j'instancie l'objet Game, nomm� game, pour construire l'objet en question et utiliser ses valeurs, m�thodes, etc.
		// Pourquoi le game ? -> car quand on veut jouer � un jeu, on lance le jeu donc on d�bute par le game
		game.display();
		
		System.out.println("Hello");
	}

}
