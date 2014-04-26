package hs.ma.uib.ss14.tpe08.p2;

public class GameController {

	// nur ein Test
	public static Squad s1 = new Squad("The walking dead", Rasse.Ork, 1000, Rasse.Untote, 1000);
	public static Squad s2 = new Squad("Superman is nich super", Rasse.Mensch, 1000,
			Rasse.Nachtelf, 1000);

	public static void runGame() {

		GameController game = new GameController();
		while (s2.team[0].isLebendig()) { 
			s1.team[0].attack(s2.team[0]);
			//s2.team[0].attack(s1.team[0]);
			
			for (int i = 0; i < s1.getAnzahl(); i++){
				if (s1.team[i].isLebendig() == false){
					s1.loesche(s1.team[i]);
				}
			}
			
			for (int i = 0; i < s2.getAnzahl(); i++){
				if (s2.team[i].isLebendig() == false){
					s2.loesche(s2.team[i]);
				}
			}
			
			GameViewer.printGame(game);
		}
	}

	public static void main(String[] args) {
		runGame();
	}
}
