package hs.ma.uib.ss14.tpe08.p2;

public class Untote extends Wesen {

	public Untote() {
		super("Untote", "Sind sehr günstig und in der Masse sehr stark", 120,
				30, 16, 2, 1.6);
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
