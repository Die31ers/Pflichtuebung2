package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * 
 * Da alle Charaktere sich unterschiedlich verhalten z.B. angreifen, 
 * verteidigen,..., erstellen wir hier eine Schnittstelle, um alle
 * Verhaltensweisen später besser darstellen zu können.
 */
public interface Kaempfer {
	
	public double attack(Kaempfer r);
	public boolean isLebendig();
	public double beschraenkeSchaden(double schaden);
	public double erhalteSchaden(double schaden);
	public String getElement();
}
