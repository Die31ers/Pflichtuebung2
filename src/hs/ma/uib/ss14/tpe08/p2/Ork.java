package hs.ma.uib.ss14.tpe08.p2;

public class Ork extends Wesen {

	public Ork() {
		super("Ork", "Sind sehr stark", 100, 30, 33, 1, 4);

	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public double attack(Kaempfer r) {
		return super.attack(r);
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
	public String getElement() {
		// TODO Auto-generated method stub
		return "";
	}

}
