package hs.ma.uib.ss14.tpe08.p2;

public class Erzmagier extends Mensch {

	private static final String name = "Erzmagier";
	private static final double bonus = 5.0;
	private static final String element = "Feuer";
	private boolean unverwundbar = false;

	private static final Erzmagier instance = new Erzmagier();

	private Erzmagier() {
		super();
	}

	public static Erzmagier getInstance() {
		return instance;
	}

	public void absorption() {
		unverwundbar = true;
	}

	public String getElement() {
		return element;
	}

	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut * bonus;
		// geht, dafür sind aber diese attribute protected und nicht mehr
		// private
		// double damage = super.attack(r) * bonus; // geht nicht, weil
		// super.attack(r) beschraenkeSchaden schon aufruft
		if (element.equals("Feuer")) { // Wie findet man Element des Gegners
										// raus?
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
		// Name muss dazu gemacht werden.
		return name + ", " + super.toString();
	}
}
