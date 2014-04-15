package hs.ma.uib.ss14.tpe08.p2;

public class GameViewer {
	public static void printGame(GameController game){
		System.out.println(game.s1);
		System.out.println(game.s2);
		System.out.println(game.s2.team[0].isLebendig());
		System.out.println(game.s2.getAnzahl());
	}
}
