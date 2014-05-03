package hs.ma.uib.ss14.tpe08.p2.Wesen;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public abstract class Wesen implements Kaempfer {
	private String rasse;
	private String eigenschaft;
	protected double lebenspunkte;
	private double ruestung;
	protected double schaden;
	protected double geschwindigkeit;
	protected double spezialAttribut;

	protected Wesen(String rasse, String eigenschaft, double lebenspunkte,
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

	public String toString() {
		return "Rasse: " + rasse + ", Lebenspunkte: " + lebenspunkte;
	}

	public double getHP() {
		return this.lebenspunkte;
	}

	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut;
		r.erhalteSchaden(damage);
		return damage;
	}

	@Override
	public double beschraenkeSchaden(double schaden) {
		return schaden;
	}

	@Override
	public double erhalteSchaden(double schaden) {
		if (schaden != 0) {
			this.lebenspunkte = this.lebenspunkte
					- (schaden - (this.ruestung * schaden / 100));
		}
		return this.lebenspunkte;
	}

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
	 * verringen.
	 * 
	 * 
	 * @param obj
	 *            vom Typ Object
	 * @return true oder false, je nachdem was zutrifft
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
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
		result = prime * result + (int) (lebenspunkte);
		result = prime * result + (int) (geschwindigkeit);
		result = prime * result + (int) (spezialAttribut); 
		return result;
	}

}
