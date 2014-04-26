package hs.ma.uib.ss14.tpe08.p2;

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

	public void doppelschlag(Squad s) {
		for (int i = 0; i < 2; i++) {
			int zufall = (int) (Math.random() * (s.team.length - 0) + 0);
			s.loesche(s.team[zufall]);
		}
	}

	public String getElement() {
		return element;
	}

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
		// Name muss dazu gemacht werden.
		return name + ", " + super.toString();
	}

}
