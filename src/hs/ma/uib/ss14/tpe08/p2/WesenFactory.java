package hs.ma.uib.ss14.tpe08.p2;

/**
 * 
 * Die Factory. Rasse wird als Parameter übergeben und die Anführer werden
 * automatisch hinzugefügt. Der Rest von der jeweiligen Rasse wird so oft
 * hinzugefügt, wie es mit dem Geld möglich ist.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class WesenFactory {
	
/**Hier werden, wie schon oben erwähnt, die Wesen durch die 
 *<code>parameter</code>
 *@param Squad s, 
 *@param Rasse rasse,
 *@param int investition,
 *@param Wesen w übergeben.
 */
	public static void erstelleWesen(Squad s, Rasse rasse, int investition,
			Wesen w) {
		int erg = investition;
		do {
			s.hinzufuegen(w);
			erg = erg - rasse.getKosten();
// Solange Geld != 0 ist, wird der Rest der jeweiligen Rasse hinzugefügt. 
		} while (erg - rasse.getKosten() > 0);
	}
	
/**Durch die methode <code>kaufeWesen</code> können wir nun die Wesen: 
 * Ork, Untote, Mensch und Nachtelf erstellen bzw. kaufen und die Anführer
 * werden automatisch hinzugefügt.
 */
	public static void kaufeWesen(Squad s, Rasse rasse, int investition) {
		int erg = 0;
		
		/**Je nach dem was der Benutzer kaufen will, switchen wir in den 
		 *passenden case.
		 *hier würde sie in den case Ork switchen, wenn sie ausgewählt würde.
		 */
		switch (rasse) {
		case Ork:
			s.hinzufuegen(Farseer.getInstance());
			erg = investition - Rasse.Farseer.getKosten();
			do {
				s.hinzufuegen(new Ork());
				erg = erg - rasse.getKosten();
			// Solange die kosten nicht auf Null sind, wird das Wesen Ork erzeugt.
			} while (erg - rasse.getKosten() > 0);
			// erstelleWesen(s, Rasse.Ork, erg, new Ork());
			break;
			
		/** Hier würde sie in den case Untote switchen, 
		 * wenn sie ausgewählt würde.
		 */
		case Untote:
			s.hinzufuegen(Lich.getInstance());
			erg = investition - Rasse.Lich.getKosten();
			do {
				s.hinzufuegen(new Untote());
				erg = erg - rasse.getKosten();
			// Solange die kosten nicht auf Null sind, wird das Wesen Untote erzeugt.
			} while (erg - rasse.getKosten() > 0);
			// erstelleWesen(s, Rasse.Untote, erg, new Untote());
			break;	
			
		/** Hier würde sie in den case Mensch switchen, 
		 * wenn sie ausgewählt würde.
		 */	
		case Mensch:
			s.hinzufuegen(Erzmagier.getInstance());
			erg = investition - Rasse.Erzmagier.getKosten();
			do {
				s.hinzufuegen(new Mensch());
				erg = erg - rasse.getKosten();
			// Solange die kosten nicht auf Null sind, wird das Wesen Mensch erzeugt.
			} while (erg - rasse.getKosten() > 0);
			// erstelleWesen(s, Rasse.Mensch, erg, new Mensch());
			break;
			
		 /** Hier würde sie in den case Nachtelf switchen, 
	  	  * wenn sie ausgewählt würde.
		  */
		case Nachtelf:
			s.hinzufuegen(Daemonenjaeger.getInstance());
			erg = investition - Rasse.Daemonenjaeger.getKosten();
			do {
				s.hinzufuegen(new Nachtelf());
				erg = erg - rasse.getKosten();
			// Solange die kosten nicht auf Null sind, wird das Wesen Nachtelf erzeugt.
			} while (erg - rasse.getKosten() > 0);
			// erstelleWesen(s, Rasse.Nachtelf, erg, new Nachtelf());
			break;
		default:
			break;
		}

	}

}
