package hs.ma.uib.ss14.tpe08.p2;

public class Erzmagier extends Mensch{
	
	private String name = "Erzmagier";
	private double bonus = 5.0;


	public Erzmagier() {
		super();
	}

	@Override
	public void attack(Kaempfer r) {
		// TODO Auto-generated method stub
		super.attack(r);
	}
	
	public void absorption(){
		
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
