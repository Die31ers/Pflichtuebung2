package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * Die Klasse Mensch ist eine Unterklasse von Wesen. Menschen sind sehr 
 * ausdauernt, was bedeutet, dass sie größeren Schaden als andere Wesen 
 * einstecken können.
 * Der Anführer der Menschen ist der Erzmagier.
 */
public class Mensch extends Wesen {

	/** 
	 *Durch den Schlüsselwort <code>super</code> rufen wir den Konstruktor 
	 *Wesen, mit den vordefinierten Eigenschaften auf. 
	 */
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
	
	/** Die Methode <code>beschraenkeSchaden(double schaden) wird hier 
	 * berechnet. Bei Menschen führt diese Methode dazu, dass der angerichtete 
	 * Schaden prozentual um den Wert des Spezialattributes verringert wird.
	 * Bei anderen Wesen hat sie keine Wirkung.
	 */
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
