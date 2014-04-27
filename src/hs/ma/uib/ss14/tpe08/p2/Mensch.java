package hs.ma.uib.ss14.tpe08.p2;

public class Mensch extends Wesen {

	public Mensch() {
		super("Mensch", "Sind sehr ausdauernd", 140, 40, 40, 2, 10);
	}


	@Override
	public double attack(Kaempfer r) {
		return super.attack(r);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean isLebendig() {
		return super.isLebendig();
	}

	@Override
	public double beschraenkeSchaden(double schaden) {
		double erg = schaden - (spezialAttribut*schaden/100);
		return erg;
	}

	@Override
	public double erhalteSchaden(double schaden) {		
		if (schaden == 0){
			return super.erhalteSchaden(0);
		}
		double damage = beschraenkeSchaden(schaden); 
		return super.erhalteSchaden(damage);
	}


	@Override
	public String getElement() {
		return "";
	}


}
