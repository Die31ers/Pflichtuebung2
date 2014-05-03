package hs.ma.uib.ss14.tpe08.p2.Game;

/**
 * Status von Teams und Kampfergebnisse werden auf der Konsole angezeigt!
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class GameViewer {
	private static int i = 0;

	/**
	 * Status von Teams pro Runde
	 * 
	 * @param game
	 * 
	 */
	public static void printGame(GameController game) {
		i++;
		System.out.printf("%n<< Runde %d >> %n", i);
		System.out.println();
		System.out.print(game.s1);
		System.out.printf(", Anzahl %d %n", game.s1.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s1.getAnzahl(); x++) {
			if (game.s1.team.get(x).isLebendig()) {
				System.out.println(game.s1.team.get(x));
			}
		}
		System.out.println();
		System.out.print(game.s2);
		System.out.printf(", Anzahl %d %n", game.s2.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s2.getAnzahl(); x++) {
			if (game.s2.team.get(x).isLebendig()) {
				System.out.println(game.s2.team.get(x));
			}
		}
		System.out.println();
		actions(game);
		wipe(game);
	}

	/**
	 * Zufallsgenerator. Benötigt für die Attacken gegen das jeweilige Wesen im
	 * Team. Obergrenze ist die Anzahl der Teammitglieder, Untergrenze 0, da
	 * ArrayList bei index 0 anfängt.
	 * 
	 * @param squadAnzahl
	 * @return
	 */
	public static int zufall(int squadAnzahl) {
		int erg = (int) (Math.random() * ((squadAnzahl) - 0) + 0);
		return erg;
	}

	/**
	 * Hier sollen zufällig ausgewählte Wesen gegen zufällig ausgewählte Gegner
	 * antreten. Hierbei wird der Zufallsgenerator benutzt.
	 * 
	 * @param game
	 */
	public static void actions(GameController game) {
		System.out.println("<< Ereignisse >> ");
		if (game.s1.getAnzahl() > 0 && game.s2.getAnzahl() > 0) {
			int zufall1 = zufall(game.s1.getAnzahl());
			int zufall2 = zufall(game.s2.getAnzahl());
			System.out
					.printf("%s trifft %s mit %f Schaden %n",
							game.s1.team.get(zufall1).toString(),
							game.s2.team.get(zufall2).toString(),
							game.s1.team.get(zufall1).attack(
									game.s2.team.get(zufall2)));
		}
		if (game.s1.getAnzahl() > 0 && game.s2.getAnzahl() > 0) {
			int zufall3 = zufall(game.s1.getAnzahl());
			int zufall4 = zufall(game.s2.getAnzahl());
			System.out
					.printf("%s trifft %s mit %f Schaden %n",
							game.s2.team.get(zufall4).toString(),
							game.s1.team.get(zufall3).toString(),
							game.s2.team.get(zufall4).attack(
									game.s1.team.get(zufall3)));
		}

	}

	/**
	 * Hier wird das Schlachtfeld von toten Wesen "gesäubert" (wipe). Es wird
	 * geschaut, ob es Wesen gibt, die weniger als 0 Lebenspunkte haben. Ist
	 * dies der Fall, wird das betroffene Wesen aus dem Squad geworfen.
	 * 
	 * @param game
	 */
	public static void wipe(GameController game) {
		if (game.s1.getAnzahl() >= 0) {
			for (int i = 0; i < game.s1.team.size(); i++) {
				if (game.s1.team.get(i).isLebendig() == false) {
					System.out.println(game.s1.team.get(i) + " wurde getötet!");
					game.s1.loesche(game.s1.team.get(i));
				}
			}
		}
		if (game.s2.getAnzahl() >= 0) {
			for (int i = 0; i < game.s2.team.size(); i++) {
				if (game.s2.team.get(i).isLebendig() == false) {
					System.out.println(game.s2.team.get(i) + " wurde getötet!");
					game.s2.loesche(game.s2.team.get(i));
				}
			}
		}
	}
}
