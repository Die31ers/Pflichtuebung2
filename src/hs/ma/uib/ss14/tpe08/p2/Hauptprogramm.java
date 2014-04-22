package hs.ma.uib.ss14.tpe08.p2;

/**
 * Zum Testen
 * 
 * 
 */
public class Hauptprogramm {

	public static void main(String[] args) {
		Erzmagier giang = Erzmagier.getInstance();
		Daemonenjaeger sovann = Daemonenjaeger.getInstance();

		Ork fisch = new Ork();
		Mensch blau = new Mensch();
		Nachtelf onur = new Nachtelf();
		Untote burhan = new Untote();

		System.out
				.println("_______________________erster_________________________");
		System.out.println(giang);
		System.out
				.println("______________________________________________________");
		System.out.println(sovann);
		System.out
				.println("______________________________________________________");
		System.out.println(giang.attack(sovann));
		System.out.println(sovann.getHP());
		System.out
				.println("______________________________________________________");
		System.out.println();
		System.out.println();
		System.out
				.println("______________________zweiter_________________________");

		System.out.println(fisch);
		System.out
				.println("______________________________________________________");
		System.out.println(burhan);
		System.out
				.println("______________________________________________________");
		System.out.println(burhan.attack(fisch));
		System.out.println(fisch.getHP());
		System.out
				.println("______________________________________________________");

		System.out.println();
		System.out.println();

		System.out
				.println("______________________dritter_________________________");

		System.out.println(blau);
		System.out
				.println("______________________________________________________");
		System.out.println(burhan);
		System.out
				.println("______________________________________________________");
		System.out.println(blau.attack(burhan));
		System.out.println(burhan.getHP());
		System.out
				.println("______________________________________________________");

	}

}
