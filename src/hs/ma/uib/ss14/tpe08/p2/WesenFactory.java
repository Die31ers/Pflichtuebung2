package hs.ma.uib.ss14.tpe08.p2;

public class WesenFactory {

	public static void kaufeWesen(Squad s) {
		Rasse rasse = null;

		switch (rasse) {
		case Ork:
			s.hinzufuegen(new Ork());
			break;
		case Untote:
			s.hinzufuegen(new Untote());
			break;
		case Mensch:
			s.hinzufuegen(new Mensch());
			break;
		case Nachtelf:
			s.hinzufuegen(new Nachtelf());
			break;
		case Daemonenjaeger:
			s.hinzufuegen(Daemonenjaeger.getInstance());
			break;
		case Erzmagier:
			s.hinzufuegen(Erzmagier.getInstance());
			break;
		case Farseer:
			s.hinzufuegen(Farseer.getInstance());
			break;
		case Lich:
			s.hinzufuegen(Lich.getInstance());
			break;
		default:
			break;
		}
	}
}