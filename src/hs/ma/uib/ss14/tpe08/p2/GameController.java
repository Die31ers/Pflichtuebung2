package hs.ma.uib.ss14.tpe08.p2;

public class GameController {
	public static Squad s1 = new Squad("The walking dead", Rasse.Untote, 1000,
			Rasse.Ork, 1000);
	public static Squad s2 = new Squad("Superman is nich super",
			Rasse.Nachtelf, 1000, Rasse.Mensch, 1000);

	public static void runGame() {
		GameController game = new GameController();

		do {
			GameViewer.printGame(game);

			s1.team[0].attack(s2.team[0]);
			if (s2.team[0].isLebendig() == false) {
				s2.loesche(s2.team[0]);
			}
			s2.team[0].attack(s1.team[0]);
			if (s1.team[0].isLebendig() == false) {
				s1.loesche(s1.team[0]);
			}
			
		} while (s1.getAnzahl() != 0);
		
		endGame(game);
	}
	
	public static void endGame(GameController game){
		GameViewer.printGame(game);
		
		if (s1.getAnzahl() == 0) {
			System.out.println("Squad '" + s2 + "' hat gewonnen!");
		}
		if (s2.getAnzahl() == 0) {
			System.out.println("Squad '" + s1 + "' hat gewonnen!");
		}
	}

	public static void main(String[] args) {
		runGame();
	}
}
