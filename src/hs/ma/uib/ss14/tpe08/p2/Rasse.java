package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 *Hier wird eine Enumeration enum Rasse erzeugt, damit man die Art der 
 *erzeugten Wesen auswählen kann. Sie enthält außerdem die Kosten pro Art.
 */

public enum Rasse  {
	/** Die Kosten für Ork ist wie hier unten angegeben z.B 150,
	 * für Farseer 300,... und so weiter. 
	 */
	
	Ork(150), Farseer(300), Untote(70), Lich(140), Mensch(110), Erzmagier(220), Nachtelf(
			145), Daemonenjaeger(290);

	private int kosten;

	private Rasse(int kosten) { //
		this.kosten = kosten;
	}
	/**
	 * @return die methode <code>getKosten</code> liefert als Rückgabe kosten.
	 * z.B Ork Kosten sind 150.
	 */
	
	public int getKosten(){
		return kosten;
	}
	
}
