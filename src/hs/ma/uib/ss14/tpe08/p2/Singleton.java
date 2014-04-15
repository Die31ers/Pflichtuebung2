package hs.ma.uib.ss14.tpe08.p2;

public class Singleton {

	// Eine (versteckte) Klassenvariable vom Typ der eigenen Klasse
	private static Singleton instance;

	// Verhindere die Erzeugung des Objektes über andere Methoden
	private Singleton() {
	}

	// Eine Zugriffsmethode auf Klassenebene, welches dir '''einmal''' ein
	// konkretes
	// Objekt erzeugt und dieses zurückliefert.
	public static Singleton getInstance() {
		if (Singleton.instance == null) {
			Singleton.instance = new Singleton();
		}
		return Singleton.instance;
	}
}
