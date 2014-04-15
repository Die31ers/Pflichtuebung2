package hs.ma.uib.ss14.tpe08.p2;

public class Daemonenjaeger extends Nachtelf {
	
	private String name = "Daemonenjaeger";

	public Daemonenjaeger(String rasse, String eigenschaft,
			double lebenspunkte, double ruestung, double schaden,
			double geschwindigkeit, double spezialAttribut) {
		super(rasse, eigenschaft, lebenspunkte, ruestung, schaden,
				geschwindigkeit, spezialAttribut);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Kaempfer r) {
		// TODO Auto-generated method stub
		super.attack(r);
	}

	@Override
	public void isLebendig() {
		// TODO Auto-generated method stub
		super.isLebendig();
	}
	
	@Override
	public String toString() {
		// Name muss dazu gemacht werden.
		return name + super.toString();
	}
}
