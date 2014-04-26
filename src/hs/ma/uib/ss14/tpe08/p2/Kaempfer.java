package hs.ma.uib.ss14.tpe08.p2;

public interface Kaempfer {
	
	public double attack(Kaempfer r);
	public boolean isLebendig();
	public double beschraenkeSchaden(double schaden);
	public double erhalteSchaden(double schaden);
	public String getElement();
}
