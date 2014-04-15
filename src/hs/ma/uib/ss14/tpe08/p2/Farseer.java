package hs.ma.uib.ss14.tpe08.p2;

public class Farseer extends Ork {
	
	private String name = "Farseer";

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
	public void beschraenkeSchaden(double schaden) {
		// TODO Auto-generated method stub
		super.beschraenkeSchaden(schaden);
	}

	@Override
	public String toString() {
		// Name muss dazu gemacht werden.
		return name + super.toString();
	}
	
	
	
}
