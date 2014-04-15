package hs.ma.uib.ss14.tpe08.p2;

public class Lich extends Untote {
	
	private String name = "Lich";
	private double bonus = 2.3;


	public Lich() {
		super();
	}

	@Override
	public void attack(Kaempfer r) {
		// TODO Auto-generated method stub
		super.attack(r);
	}
	
	public void verwesung(Squad s){
		
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
