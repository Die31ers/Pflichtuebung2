package hs.ma.uib.ss14.tpe08.p2;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Farseer extends Ork {

	private static final String name = "Farseer";
	private static final double bonus = 1.2;
	private static final String element = "Erde";
	private static boolean vorhanden;

	private static final Farseer instance = new Farseer();

	private Farseer() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Farseer getInstance() {
		vorhanden = true;
		return instance;
	}

	public static boolean istVorhanden() {
		return vorhanden;
	}

	public void doppelschlag(Squad s) {
		for (int i = 0; i < 2; i++) {
			int zufall = (int) (Math.random() * (s.getAnzahl() - 0) + 0);
			s.loesche(s.team.get(zufall));
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
		return name + ", " + super.toString();
	}

}
