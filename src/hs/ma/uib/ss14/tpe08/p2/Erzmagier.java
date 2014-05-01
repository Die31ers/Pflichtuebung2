package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Die Klasse Erzmagier ist eine Unterklasse von Mensch. 
 * Der Anführer der Menschen ist der Erzmagier.
 * Erzmagier hat ein beherrschtes Element Feuer.
 * Die Anführer besitzen zusätzlich einen Bonus Faktor. Dieses wird auch als
 * Multiplikator für die Heldenlebenspunkte verwendet. 
 * Bonus für Erzmagier ist 5.0
 */
public class Erzmagier extends Mensch {

	private static final String name = "Erzmagier";
	private static final double bonus = 5.0;
	private static final String element = "Feuer";
	private boolean unverwundbar = false;

	private static final Erzmagier instance = new Erzmagier();

	private Erzmagier() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Erzmagier getInstance() {
		return instance;
	}

	/** 
	 * Jede Held verfügt zusätzlich über eine Spezialfunktion die nur jede 3.
	 * Runde aufgerufen werden kann.
	 * <code>absorption()</code> Bekommt eine Runde keinen Schaden.
	 */
	public void absorption() {
		unverwundbar = true;
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
		if (r.getElement().equals("Luft")) {
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
	public double erhalteSchaden(double schaden) {
		if (unverwundbar) {
			return super.erhalteSchaden(0);
		}
		return super.erhalteSchaden(schaden);
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
