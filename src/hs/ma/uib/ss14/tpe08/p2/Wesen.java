package hs.ma.uib.ss14.tpe08.p2;

public abstract class Wesen {
	private String rasse;
	private String eigenschaft;
	private double lebenspunkte;
	private double ruestung;
	private double schaden;
	private double geschwindigkeit;
	private double spezialAttribut;

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

	public String toString() {
		return rasse + lebenspunkte;
	}
}
