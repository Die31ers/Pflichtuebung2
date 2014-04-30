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
			if (Farseer.istVorhanden() == false) {
				s.hinzufuegen(Farseer.getInstance());
				erg = investition - Rasse.Farseer.getKosten();
				do {
					s.hinzufuegen(new Ork());
					erg = erg - rasse.getKosten();

				} while (erg - rasse.getKosten() > 0);
				// erstelleWesen(s, Rasse.Ork, erg, new Ork());
			}
			break;
		case Untote:
			if (Lich.istVorhanden() == false) {
				s.hinzufuegen(Lich.getInstance());
				erg = investition - Rasse.Lich.getKosten();
				do {
					s.hinzufuegen(new Untote());
					erg = erg - rasse.getKosten();

				} while (erg - rasse.getKosten() > 0);
				// erstelleWesen(s, Rasse.Untote, erg, new Untote());
			}
			break;
		case Mensch:
			if (Erzmagier.istVorhanden() == false) {
				s.hinzufuegen(Erzmagier.getInstance());
				erg = investition - Rasse.Erzmagier.getKosten();
				do {
					s.hinzufuegen(new Mensch());
					erg = erg - rasse.getKosten();

				} while (erg - rasse.getKosten() > 0);
				// erstelleWesen(s, Rasse.Mensch, erg, new Mensch());
			}
			break;
		case Nachtelf:
			if (Daemonenjaeger.istVorhanden() == false) {
				s.hinzufuegen(Daemonenjaeger.getInstance());

				erg = investition - Rasse.Daemonenjaeger.getKosten();
				do {
					s.hinzufuegen(new Nachtelf());
					erg = erg - rasse.getKosten();

				} while (erg - rasse.getKosten() > 0);

				// erstelleWesen(s, Rasse.Nachtelf, erg, new Nachtelf());
			}
			break;
		default:
			break;
		}

	}

}
