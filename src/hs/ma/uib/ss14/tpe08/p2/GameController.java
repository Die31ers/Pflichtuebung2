package hs.ma.uib.ss14.tpe08.p2;

public class GameController {
	// nur ein Test
	public static Squad s1 = new Squad("The walking dead");
	public static Squad s2 = new Squad("Superman is nich super");
	public static Squad s3 = new Squad("D is nich super");

	public static int elfendollar = 2000;
	
	public static void runGame() {
		WesenFactory.kaufeWesen(s1, Rasse.Ork);
	}
	public static void main(String[] args) {
		runGame();
	}
}
/*
 * public static void runGame() { GameController game = new GameController();
 * 
 * s1.hinzufuegen(Farseer.getInstance());
 * s2.hinzufuegen(Erzmagier.getInstance()); s3.hinzufuegen(new Ork()); int i =
 * 0; while (s2.team[0].isLebendig()) { // in dieser Schleife wird alles //
 * ablaufen s1.team[0].attack(s2.team[0]);
 * 
 * GameViewer.printGame(game); System.out.println("___________________");
 * 
 * } }
 * 
 * public static void main(String[] args) { runGame(); } }
 */