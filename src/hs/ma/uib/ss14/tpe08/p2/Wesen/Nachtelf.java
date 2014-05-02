package hs.ma.uib.ss14.tpe08.p2.Wesen;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class Nachtelf extends Wesen {

	public Nachtelf() {
		super("Nachtelf", "Sind sehr intelligent", 120, 20, 15, 3,
				2.9);
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
		return "";
	}




}
