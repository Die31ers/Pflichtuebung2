package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Hier wird die Klasse Squad erstellt welches eine Namen für den Squad bekommt
 * und ein Array erstellt, welches die Wesen die gekauft wurden,welches ein
 * Team bilden in einem Array gespeichert.
 */

public class Squad {
	private String name;
	public Wesen[] team = new Wesen[0];
	private int kosten = 0;
/** 
 * In einem Squad können beliebig viele Wesen, aber maximal zwei 
 * unterschiedliche Rassen enthalten sein und der Anführer darf 
 * nur einmal vorkommen. Die Anzahl der Wesen wird durch deren Kosten begrenzt.
 * 
 * Der Name, die Rassen 1 und 2, die investition 1 und 2 werden durch 
 * @param name,
 * @param rasse1,
 * @param rasse2,
 * @param investition1,
 * @param ivestition2 übergeben.
 */
	public Squad(String name, Rasse rasse1, int investition1, Rasse rasse2,
			int investition2) {
		this.name = name;
		/**Die Kosten setzen sich aus investition1 und investition2 zusammen.
		 */
		
		this.kosten = investition1 + investition2;
		/**Ist die Summe zwischen inverstition1 und investition2 nicht 
		 * über 2000 Elfendollar, so kann er sich aus der Klasse WesenFactory 
		 * zwei verschiedene Rassen kaufen. 
		 */
		
		/** Die Kosten hierfür sind mit 2000 Elfendollar begrenzt.
		 */
		
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
			WesenFactory.kaufeWesen(this, rasse2, investition2);
		}
	}

	@Override
	public String toString() {
		return name;
	}

	public int getKosten() {
		return this.kosten;
	}
	/** In diesem Array werden die gekauften Wesen gespeichert bzw. erweitert 
	 *@return und als rückgabe das aktuelle Array ausgegeben. 
	 */
	
	public static Wesen[] arrayErweitern(Wesen[] ursprungsArray, Wesen w) {
		Wesen[] neuesArray = new Wesen[ursprungsArray.length + 1];
		for (int l = 0; l < ursprungsArray.length; l++) {
			neuesArray[l] = ursprungsArray[l];
		}
		neuesArray[neuesArray.length - 1] = w;
		return neuesArray;
	}
	/** In diesem Array werden die gekauften Wesen reduziert. 
	 *@return und als rückgabe das aktuelle Array ausgegeben. 
	 */
	
	public static Wesen[] arrayKuerzen(Wesen[] ursprungsArray) {
		Wesen[] neuesArray = new Wesen[ursprungsArray.length - 1];
		for (int l = 0; l < ursprungsArray.length - 1; l++) {
			neuesArray[l] = ursprungsArray[l + 1];
		}
		return neuesArray;
	}
	/** Hier wird der Schaden des Teams berechnet.
	 */
	
	public void erhalteTeamSchaden(double schaden) {
		for (int i = 0; i < this.team.length; i++) {
			this.team[i].erhalteSchaden(schaden);
		}
	}
	/** Mit der Methode hinzufügen werden die gekauften Wesen in das Team 
	 * hinzugefügt.
	 * @param Wesen w 
	 */
	
	public void hinzufuegen(Wesen w) {
		this.team = arrayErweitern(this.team, w);
	}
	/** Hier wird das Wesen aus dem Team gelöscht und zusätzlich das Array 
	 * gekürzt, indem die Wesen gespeichert sind.
	 * @param w
	 */
	public void loesche(Wesen w) {
		if (this.team[0].equals(this.team[this.team.length - 1])) {
			Wesen[] nix = new Wesen[0];
			this.team = nix;
		} else {
			for (int i = 0; i < this.team.length - 1; i++) {
				if (this.team[i].equals(w)) {
					this.team[i] = this.team[i + 1];
					this.team = arrayKuerzen(this.team);
				}
			}
		}
	}
	/** Mit der Methode getAnzahl bekommen wir die Anzahl von Kämpfern
	 * zurück, die noch lebendig sind.
	 * @return zaehler
	 */
	
	public int getAnzahl() {
		int zaehler = 0;
		if (this.team != null) {
			for (int i = 0; i < this.team.length; i++) {
				if (this.team[i].isLebendig()) {
					zaehler++;
				}
			}
		}
		return zaehler;
	}
}
