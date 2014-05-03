package hs.ma.uib.ss14.tpe08.p2.WesenErzeugen;

/**
 * Klasse Enumeration Rasse. Sie dient der Auswahl in der Factory Klasse
 * Wesenfactory. Sie enthält außerdem die Kosten pro Art.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public enum Rasse {
	Ork(150), Farseer(300), Untote(70), Lich(140), Mensch(110), Erzmagier(220), Nachtelf(
			145), Daemonenjaeger(290);

	private int kosten;

	private Rasse(int kosten) {
		this.kosten = kosten;
	}

	/**
	 * @return die methode <code>getKosten</code> liefert als Rückgabe kosten.
	 *         z.B Ork Kosten sind 150.
	 */
	public int getKosten() {
		return kosten;
	}

}
