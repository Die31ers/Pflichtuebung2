package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Hier wird eine abstracte Klasse Wesen erstellt und zusätlich das Interface 
 * Kaempfer implementiert.
 * Durch den Konstruktor <code>Wesen</code> können wir nun die einzelnen 
 * Eigenschaften der Wesen bestimmen.
 */
public abstract class Wesen implements Kaempfer {
	private String rasse;
	private String eigenschaft;
	protected double lebenspunkte;
	private double ruestung;
	protected double schaden;
	protected double geschwindigkeit;
	protected double spezialAttribut;

/** Konstruktor Wesen mit den folgenden Eigenschaften 
 * @param rasse
 * @param eigenschaft
 * @param lebenspunkte
 * @param ruestung
 * @param schaden
 * @param geschwindigkeit
 * @param spezialAttribut
 */
	public Wesen(String rasse, String eigenschaft, double lebenspunkte,
			double ruestung, double schaden, double geschwindigkeit,
			double spezialAttribut) {
		this.rasse = rasse;
		this.eigenschaft = eigenschaft;
		this.lebenspunkte = lebenspunkte;
		this.ruestung = ruestung;
		this.schaden = schaden;
		this.geschwindigkeit = geschwindigkeit;
		this.spezialAttribut = spezialAttribut;
	}
	
	/** Die Methode <code>toString()</code> wandelt die Werte in einem Sting
	 * @return "Rasse: " + rasse + ", Lebenspunkte: " + lebenspunkte.
	 */
	public String toString() {
		return "Rasse: " + rasse + ", Lebenspunkte: " + lebenspunkte;
	}
	
	/** Mit der Methode <code>getHP()</code> erhalten wir die Lebenspunkte 
	 * zurück
	 * @return this.lebenspunkte
	 */
	public double getHP() {
		return this.lebenspunkte;
	}
	
	/** Die Methode <code>attack(Kaempfer r)</code> gibt den angerichteten 
	 * Schaden zurück und zieht gleichzeitig diesen von den Lebenspunkten des
	 * Gegners ab.
	 * @param r
	 * @return damage
	 */
	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut;
		r.erhalteSchaden(damage);
		return damage;
	}
	
	/** Die Methode <code>beschraenkeSchaden(double schaden)</code> wie der
	 * Name der Methode schon aussagt, den Schaden beschränkt.
	 * Diese Methode ist ausschließlich für Menschen von bedeutung.
	 */
	@Override
	public double beschraenkeSchaden(double schaden) {
		return schaden;
	}
	
	/**
	 * Diese Methode <code>erhalteSchaden(double schaden)</code>
	 * zieht den angerichteten Schaden von den Lebenspunkten der
	 * jeweiligen Wesen ab.
	 * @return und gibt als Rückgabe, die reduzierten Lebenspunkte zurück.
	 */
	@Override
	public double erhalteSchaden(double schaden) {
		if (schaden != 0) {
			this.lebenspunkte = this.lebenspunkte
					- (schaden - (this.ruestung * schaden / 100));
		}
		return this.lebenspunkte;
	}
	
	/** Jede Rasse verfügt zudem über die gleichen Methoden
	 * <code>isLebendig()</code>, die angibt, ob ein Wesen noch lebt.
	 * @return sie gibt false zurück, wenn die Lebenspunkte des Wesens kleiner
	 * oder gleich Null sind, sonst gibt sie true zurück.
	 */
	@Override
	public boolean isLebendig() {
		if (this.lebenspunkte <= 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Vergleichen zweier Festkommazahlen auf Gleichheit. Wir implentieren eine
	 * eigene equals Methode und überschreiben die equals Methode von der Object
	 * Klasse. Verwendet die überschriebene <code>hashCode()</code> Methode um
	 * schneller Objekte miteinander zu vergleichen und den Vergleichsaufwand zu
	 * verringern.
	 * 
	 * 
	 * @param obj
	 *            vom Typ Object
	 * @return true oder false, je nachdem was zutrifft
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (obj.getClass() == this.getClass()) {
			Wesen w = (Wesen) obj;
			if (this.lebenspunkte == w.lebenspunkte) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Errechnen der Hashwerte. Da die equals Methode überschrieben wurde, muss
	 * auch die hashCode Methode von der Object Klasse überschrieben werden. Mit
	 * Hashwerten kann man so viel schneller Objekte miteinander vergleichen, da
	 * es nur ein integer Wert zurückgibt.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (geschwindigkeit);
		result = prime * result + (int) (spezialAttribut); 
		return result;
	}

}
