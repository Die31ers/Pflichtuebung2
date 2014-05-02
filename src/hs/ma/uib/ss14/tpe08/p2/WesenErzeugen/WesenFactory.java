package hs.ma.uib.ss14.tpe08.p2.WesenErzeugen;

import hs.ma.uib.ss14.tpe08.p2.Wesen.Daemonenjaeger;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Erzmagier;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Farseer;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Lich;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Mensch;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Nachtelf;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Ork;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Untote;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Wesen;

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

	public static void kaufeWesen(Squad s, Rasse rasse, int investition) {
		int erg = investition;
		switch (rasse) {
		case Ork:
			if (Farseer.istVorhanden() == false) {
				s.hinzufuegen(Farseer.getInstance());
				erg = erg - Rasse.Farseer.getKosten();
			}
			while (erg - rasse.getKosten() > 0) {
				s.hinzufuegen(new Ork());
				erg = erg - rasse.getKosten();
			}
			break;
		case Untote:
			if (Lich.istVorhanden() == false) {
				s.hinzufuegen(Lich.getInstance());
				erg = erg - Rasse.Lich.getKosten();
			}
			while (erg - rasse.getKosten() > 0) {
				s.hinzufuegen(new Untote());
				erg = erg - rasse.getKosten();
			}
			break;
		case Mensch:
			if (Erzmagier.istVorhanden() == false) {
				s.hinzufuegen(Erzmagier.getInstance());
				erg = erg - Rasse.Erzmagier.getKosten();
			}
			while (erg - rasse.getKosten() > 0) {
				s.hinzufuegen(new Mensch());
				erg = erg - rasse.getKosten();
			}
			break;
		case Nachtelf:
			if (Daemonenjaeger.istVorhanden() == false) {
				s.hinzufuegen(Daemonenjaeger.getInstance());
				erg = erg - Rasse.Daemonenjaeger.getKosten();
			}
			while (erg - rasse.getKosten() > 0) {
				s.hinzufuegen(new Nachtelf());
				erg = erg - rasse.getKosten();
			}
			break;
		}
	}
}
