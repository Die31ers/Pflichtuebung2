package hs.ma.uib.ss14.tpe08.p2;

/**
 * Zum Testen
 * 
 * 
 */
public class Hauptprogramm {

	public static void main(String[] args) {
		Erzmagier giang = Erzmagier.getInstance();

		Daemonenjaeger hunar = Daemonenjaeger.getInstance();
		Nachtelf onur = new Nachtelf();
		Untote burhan = new Untote();
		System.out.println(giang);
		System.out.println(hunar);
		System.out.println(giang.attack(hunar));
		System.out.println(hunar.getHP());
	}

}
