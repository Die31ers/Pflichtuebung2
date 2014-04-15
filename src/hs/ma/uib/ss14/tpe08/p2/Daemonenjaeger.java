package hs.ma.uib.ss14.tpe08.p2;

public class Daemonenjaeger extends Nachtelf {

	private static final String name = "Daemonenjaeger";
	private static final double bonus = 3.0;
	private static final String element = "Luft";

	private static final Daemonenjaeger instance = new Daemonenjaeger();

	private Daemonenjaeger() {
		super.lebenspunkte = lebenspunkte * bonus;
	}

	public static Daemonenjaeger getInstance() {
		return instance;
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
		// Name muss dazu gemacht werden.
		return name + ", " + super.toString();
	}
}
