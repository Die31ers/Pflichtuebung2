package hs.ma.uib.ss14.tpe08.p2;

/**
 * 
 * Die Klasse GameController. Steuert das Spiel.
 * 
 * Regelwerk:
 * 
 * Nur ein Anführer pro Squad!
 * Startkapital: 2000 Elfendollar!
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class GameController {
	
	public static Squad s1 = new Squad("The walking dead", Rasse.Lich, 140, Rasse.Untote, 860,
			Rasse.Ork, 1000);
	public static Squad s2 = new Squad("Superman is nich super", Rasse.Daemonenjaeger, 140, Rasse.Mensch,
			1860);
	/*
	public static Squad s1 = new Squad("The walking dead", Rasse.Untote, 1000,
			Rasse.Ork, 1000);
	public static Squad s2 = new Squad("Superman is nich super", Rasse.Mensch,
			2000);
	 */
	public static int zufall(int squadAnzahl) {
		int erg = (int) (Math.random() * (squadAnzahl - 0 ) + 0);
		return erg;
	}

	public static void runGame() {
		GameController game = new GameController();
		if (s1.team.length == 0) {
			System.out.println("Squad 1 ist leer!");
		}

		else if (s2.team.length == 0) {
			System.out.println("Squad 2 ist leer!");
		}

		else {
			while (s1.team.length != 0 || s2.team.length != 0) {
				GameViewer.printGame(game);
				if (s1.getAnzahl() > 0) {
				for (int i = 0; i < s1.team.length; i++) {
					if (s1.team[i].isLebendig() == false) {
						s1.loesche(s1.team[i]);
					}
				}
				}
				if (s2.getAnzahl() > 0) {
				for (int i = 0; i < s2.team.length; i++) {
					if (s2.team[i].isLebendig() == false) {
						s2.loesche(s2.team[i]);
					}
				}
				}
				if (s1.getAnzahl() > 0 && s2.getAnzahl() > 0) {
					int zufall1 = zufall(s1.team.length);
					int zufall2 = zufall(s2.team.length);
					s1.team[zufall1].attack(s2.team[zufall2]);
				}
				
				if (s1.getAnzahl() > 0 && s2.getAnzahl() > 0) {
					int zufall3 = zufall(s1.team.length);
					int zufall4 = zufall(s2.team.length);
					s2.team[zufall4].attack(s1.team[zufall3]);
				} else {
					break;
				}
			}
			endGame(game);
		}
	}

	public static void endGame(GameController game) {
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
