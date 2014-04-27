package hs.ma.uib.ss14.tpe08.p2;

public class Geist implements Kaempfer{

	@Override
	public double attack(Kaempfer r) {
		return r.beschraenkeSchaden(1);
	}

	@Override
	public boolean isLebendig() {
		return false;
	}

	@Override
	public double beschraenkeSchaden(double schaden) {
		return 0;
	}

	@Override
	public double erhalteSchaden(double schaden) {
		return 0;
	}

	@Override
	public String getElement() {
		return null;
	}

}
