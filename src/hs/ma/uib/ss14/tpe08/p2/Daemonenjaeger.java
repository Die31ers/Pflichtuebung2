package hs.ma.uib.ss14.tpe08.p2;

public class Daemonenjaeger extends Nachtelf {
	
	private String name = "Daemonenjaeger";

	public Daemonenjaeger() {
		super();
		
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
