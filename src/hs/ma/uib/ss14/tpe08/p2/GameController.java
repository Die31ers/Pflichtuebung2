package hs.ma.uib.ss14.tpe08.p2;

public class GameController {
	
	public static Squad s1 = new Squad("The Walking death", Rasse.Farseer, 1000, Rasse.Mensch, 1000);
	public static Squad s2 = new Squad("Superman ist nicht super", Rasse.Ork, 1200, Rasse.Untote, 800);
	
	
	public static void runGame() {
		WesenFactory.kaufeWesen(s1);
	}

	public static void main(String[] args) {
		runGame();
	}
}