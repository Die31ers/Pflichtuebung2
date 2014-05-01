package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 *
 * Die Klasse Geister haben keine Eigenschaften oder Methoden, könne aber
 * trozdem über <code>attack(Kaempfer r)</code> an Kämpfen teilnehmen.
 * 
 * Weiter unten werden die Methoden überschrieben.
 */
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
