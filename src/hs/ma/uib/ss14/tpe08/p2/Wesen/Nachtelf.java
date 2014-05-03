package hs.ma.uib.ss14.tpe08.p2.Wesen;

/**
 * Die Klasse Nachtelf ist eine Unterklasse von Wesen. Nachelfen besitzen die
 * Eigenschaft sehr intelligent zu sein.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Nachtelf extends Wesen {
	/**
	 * Durch den Schlüsselwort <code>super</code> rufen wir den Konstruktor
	 * Wesen, mit den vordefinierten Eigenschaften auf.
	 */
	public Nachtelf() {
		super("Nachtelf", "Sind sehr intelligent", 120, 20, 15, 3, 2.9);
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
