package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Die Klasse Lich ist eine Unterklasse von Untote. Der Anführer der Untoten 
 * ist der dunkle Lich.
 * Lich hat ein beherrschtes Element Wasser.
 * Die Anführer besitzen zusätzlich einen Bonus Faktor. Dieses wird auch als
 * Multiplikator für die Heldenlebenspunkte verwendet. Bonus für Lich ist 2.3
 */
public class Lich extends Untote {

	private static final String name = "Lich";
	private static final double bonus = 2.3;
	private static final String element = "Wasser";

	private static final Lich instance = new Lich();

	/** Hier wird die Lebenspunkte von Lich berechnet.
	 */
	private Lich() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Lich getInstance() {
		return instance;
	}

	/** Jede Held verfügt zusätzlich über eine Spezialfunktion die nur jede 3.
	 * Runde aufgerufen werden kann.
	 * @param s
	 * <code>verwesung(Squad s)</code> entzieht allen Einheiten des Squads 7
	 * Punkte und gibt sich selbst die enzogene Lebenspunkte.
	 */
	public void verwesung(Squad s) {
		lebenspunkte = lebenspunkte + (s.getAnzahl()* 7 );
		s.erhalteTeamSchaden(7);
	}
	
	public String getElement(){
		return element;
	}
	
	/** Hier wird die Methode <code>attack(Kaempfer r)</code> überschrieben, da
	 * jeder Charakter anders angreift wird sie für jeden Wesen neu definiert.
	 * @param r
	 */
	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut * bonus;
		if (r.getElement().equals("Feuer")) {
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
