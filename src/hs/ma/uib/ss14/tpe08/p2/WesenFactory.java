package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * Die Factory. Rasse wird als Parameter übergeben und die Anführer werden automatisch hinzugefügt.
 * Der Rest von der jeweiligen Rasse wird wird so oft hinzugefügt, wie es mit dem Geld möglich ist. 
 * 
 * @author Giang
 * @author Joshua
 * @author Hunar
 *
 */
public class WesenFactory {

	public static void erstelleWesen(Squad s, Rasse rasse, int investition,
			Wesen w) {
		int erg = investition;
		do {
			s.hinzufuegen(w);
			erg = erg - rasse.getKosten();

		} while (erg - rasse.getKosten() > 0);
	}

	public static void kaufeWesen(Squad s, Rasse rasse, int investition) {
		int erg = 0;
		switch (rasse) {
		case Ork:
			s.hinzufuegen(Farseer.getInstance());
			erg = investition - Rasse.Farseer.getKosten();
			erstelleWesen(s, Rasse.Ork, erg, new Ork());
			break;
		case Untote:
			s.hinzufuegen(Lich.getInstance());
			erg = investition - Rasse.Lich.getKosten();
			erstelleWesen(s, Rasse.Untote, erg, new Untote());
			break;
		case Mensch:
			s.hinzufuegen(Erzmagier.getInstance());
			erg = investition - Rasse.Erzmagier.getKosten();
			erstelleWesen(s, Rasse.Mensch, erg, new Mensch());
			break;
		case Nachtelf:
			s.hinzufuegen(Daemonenjaeger.getInstance());
			erg = investition - Rasse.Daemonenjaeger.getKosten();
			erstelleWesen(s, Rasse.Nachtelf, erg, new Nachtelf());
			break;
		}

	}

}
