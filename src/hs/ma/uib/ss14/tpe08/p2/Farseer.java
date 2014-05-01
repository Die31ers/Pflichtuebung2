package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 *
 * Die Klasse Farseer ist eine Unterklasse von Ork. Der Anführer der Orks 
 * ist der Held Farseer.
 * Farseer hat ein beherrschtes Element Erde.
 * Die Anführer besitzen zusätzlich einen Bonus Faktor. Dieses wird auch als
 * Multiplikator für die Heldenlebenspunkte verwendet. 
 * Bonus für Farseer ist 1.2
 */
public class Farseer extends Ork {

	private static final String name = "Farseer";
	private static final double bonus = 1.2;
	private static final String element = "Erde";

	private static final Farseer instance = new Farseer();

	private Farseer() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Farseer getInstance() {
		return instance;
	}
	
	/** Jede Held verfügt zusätzlich über eine Spezialfunktion die nur jede 3.
	 * Runde aufgerufen werden kann.
	 * @param s
	 * <code>doppelschlag(Squad s)</code> löscht 2 zufällige Wesen des Gegeners
	 * komplett aus.
	 */
	public void doppelschlag(Squad s) {
		for (int i = 0; i < 2; i++) {
			int zufall = (int) (Math.random() * (s.team.length - 0) + 0);
			s.loesche(s.team[zufall]);
		}
	}

	public String getElement() {
		return element;
	}

	/** Hier wird die Methode <code>attack(Kaempfer r)</code> überschrieben, da
	 * jeder Charakter anders angreift wird sie für jeden Wesen neu definiert.
	 * @param r
	 */
	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut * bonus;
		if (r.getElement().equals("Wasser")) {
			damage = damage * 2;
		}
		r.erhalteSchaden(damage);
		return damage;
	}


	@Override
	public double beschraenkeSchaden(double schaden) {
		return super.beschraenkeSchaden(schaden);
	}

	@Override
	public boolean isLebendig() {
		return super.isLebendig();
	}

	@Override
	public String toString() {
		return name + ", " + super.toString();
	}

}
