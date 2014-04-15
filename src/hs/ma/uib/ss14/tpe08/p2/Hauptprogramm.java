package hs.ma.uib.ss14.tpe08.p2;


/**
 * Zum Testen
 * 
 *
 */
public class Hauptprogramm {

	public static void main(String[] args) {
		Lich giang = Lich.getInstance();
		Nachtelf onur = new Nachtelf();
		Mensch burhan = new Mensch();

		System.out.println(giang);
		System.out.println(burhan);
		System.out.println(giang.attack(burhan));
		System.out.println(burhan);
		System.out.println(burhan.isLebendig());
		System.out.println(giang.attack(burhan));
		System.out.println(burhan);
		System.out.println(burhan.isLebendig());
	}

}
