package hs.ma.uib.ss14.tpe08.p2.Wesen;

import hs.ma.uib.ss14.tpe08.p2.WesenErzeugen.Squad;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Daemonenjaeger extends Nachtelf {

	private static final String name = "Daemonenjaeger";
	private static final double bonus = 3.0;
	private static final String element = "Luft";
	private static boolean vorhanden;

	private static final Daemonenjaeger instance = new Daemonenjaeger();

	private Daemonenjaeger() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Daemonenjaeger getInstance() {
		vorhanden = true;
		return instance;
	}

	public static boolean istVorhanden() {
		return vorhanden;
	}

	public void goldschuss(Squad s) {
		s.erhalteTeamSchaden(25);
	}

	public String getElement() {
		return element;
	}

	@Override
	public double attack(Kaempfer r) {
		double damage = geschwindigkeit * schaden * spezialAttribut * bonus;
		if (r.getElement().equals("Erde")) {
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
