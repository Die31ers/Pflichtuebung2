package hs.ma.uib.ss14.tpe08.p2;

public class GameViewer {
	private static int i = 0;

	public static void printGame(GameController game) {
		i++;
		System.out.printf("Runde %d %n", i);
		System.out.println();
		System.out.println(game.s1);
		System.out.printf("Anzahl %d %n", game.s1.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s1.getAnzahl(); x++) {
			System.out.println(game.s1.team[x]);
		}
		System.out.println();
		System.out.println(game.s2);
		System.out.printf("Anzahl %d %n", game.s2.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s2.getAnzahl(); x++) {
			System.out.println(game.s2.team[x]);
		}
		System.out.println();
		// System.out.println((1000-Rasse.Farseer.getKosten())%Rasse.Ork.getKosten());

	}
}
