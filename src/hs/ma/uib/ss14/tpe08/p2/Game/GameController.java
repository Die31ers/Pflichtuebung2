package hs.ma.uib.ss14.tpe08.p2.Game;

import hs.ma.uib.ss14.tpe08.p2.WesenErzeugen.Rasse;
import hs.ma.uib.ss14.tpe08.p2.WesenErzeugen.Squad;

/**
 * 
 * Die Klasse GameController. Steuert das Spiel.
 * 
 * Regelwerk:
 * 
 * Nur ein Anführer pro Squad! Startkapital: 2000 Elfendollar!
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class GameController {
	public static Squad s1 = new Squad("The walking dead", Rasse.Untote, 1000,
			Rasse.Ork, 1000);
	public static Squad s2 = new Squad("Superman is nich super", Rasse.Mensch,
			1000, Rasse.Nachtelf, 1000);

	/**
	 * Das Spiel fängt erst an, wenn die Squads erstellt und mit Wesen gefüllt
	 * wurden und hört auf, sobald es in einem Squad keine überlebenden mehr
	 * gibt. Die Methode printGame(game) der Klasse GameViewer wird aufgerufen,
	 * solange das Spiel läuft.
	 */
	public static void runGame() {
		GameController game = new GameController();
		if (s1.team.size() == 0) {
			System.out.println("Squad 1 ist leer!");
		} else if (s2.team.size() == 0) {
			System.out.println("Squad 2 ist leer!");
		} else {
			while (s1.getAnzahl() != 0 || s2.getAnzahl() != 0) {
				GameViewer.printGame(game);
				if (!(s1.getAnzahl() > 0 && s2.getAnzahl() > 0)) {
					break;
				}
			}
			endGame(game);
		}
	}

	/**
	 * Mit <code>endGame</code> wird nach dem Ende des Spiels der Gewinner
	 * ausgegeben.
	 * 
	 * @param game
	 */
	public static void endGame(GameController game) {
		GameViewer.printGame(game);

		if (s1.getAnzahl() == 0) {
			System.out.println("Squad '" + s2 + "' hat gewonnen!");
		}
		if (s2.getAnzahl() == 0) {
			System.out.println("Squad '" + s1 + "' hat gewonnen!");
		}
	}

	/**
	 * Die Main Methode ruft <code>runGame()</code> auf.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		runGame();
	}
}
