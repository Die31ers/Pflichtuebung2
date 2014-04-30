package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class GameViewer {
	private static int i = 0;

	public static void printGame(GameController game) {
		i++;
		System.out.printf("%n<< Runde %d >> %n", i);
		System.out.println();
		System.out.print(game.s1);
		System.out.printf(", Anzahl %d %n", game.s1.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s1.team.length; x++) {
			if (game.s1.team[x].isLebendig()){
				System.out.println(game.s1.team[x]);
			}
		}
		System.out.println();
		System.out.print(game.s2);
		System.out.printf(", Anzahl %d %n", game.s2.getAnzahl());
		System.out.println();
		for (int x = 0; x < game.s2.team.length; x++) {
			if (game.s2.team[x].isLebendig()){
			System.out.println(game.s2.team[x]);
			}
		}
		System.out.println();
	}
}
