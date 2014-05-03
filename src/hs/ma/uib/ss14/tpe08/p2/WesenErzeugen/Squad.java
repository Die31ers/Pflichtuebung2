package hs.ma.uib.ss14.tpe08.p2.WesenErzeugen;

import hs.ma.uib.ss14.tpe08.p2.Wesen.Wesen;

/**
 * Spieler hat ein Squad, mit welchen er Rassen für die Schlacht einkaufen kann. 
 * Er übergibt einen Namen, 2000 Elfendollar und die gewünschte(n) Rasse(n) 
 * um sein Squad zu erhalten.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
import java.util.ArrayList;

public class Squad {
	private String name;
	private int kosten = 0;
	public ArrayList<Wesen> team = new ArrayList<Wesen>();

	/**
	 * 1. Konstruktor. Wenn der Spieler nur eine Rasse im Squad haben möchte.
	 * 
	 * @param name
	 * @param rasse1
	 * @param investition1
	 */
	public Squad(String name, Rasse rasse1, int investition1) {
		this.name = name;
		this.kosten = investition1;
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
		}
	}

	/**
	 * 2. Konstruktor. Wenn der Spieler zwei Rassen im Squad haben möchte.
	 * 
	 * @param name
	 * @param rasse1
	 * @param investition1
	 * @param rasse2
	 * @param investition2
	 */
	public Squad(String name, Rasse rasse1, int investition1, Rasse rasse2,
			int investition2) {
		this.name = name;
		this.kosten = investition1 + investition2;
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
			WesenFactory.kaufeWesen(this, rasse2, investition2);
		}
	}

	@Override
	public String toString() {
		return name;
	}

	public int getKosten() {
		return this.kosten;
	}

	/**
	 * Jedes Teammitglied bekommt durch den übergebenen Wert die Lebenspunkte
	 * abgezogen. Siehe Lich mit seiner Spezialfähigkeit Verwesung.
	 * 
	 * @param schaden
	 */
	public void erhalteTeamSchaden(double schaden) {
		for (int i = 0; i < this.team.size(); i++) {
			this.team.get(i).erhalteSchaden(schaden);
		}
	}

	/**
	 * Wesen werden hinzugefügt.
	 * 
	 * @param w
	 *            vom Typ Wesen
	 */
	public void hinzufuegen(Wesen w) {
		this.team.add(w);
	}

	/**
	 * Wesen werden gelöscht.
	 * 
	 * @param w
	 *            vom Typ Wesen
	 */
	public void loesche(Wesen w) {
		this.team.remove(w);
	}

	/**
	 * Methode zählt die Anzahl der überlebenden im Squad. Benötigt um das Spiel
	 * am Laufen zu halten bzw. zu beenden.
	 * 
	 * @return Anzahl der noch lebenden Wesen.
	 */
	public int getAnzahl() {
		int zaehler = 0;
		for (int i = 0; i < this.team.size(); i++) {
			if (this.team.get(i).isLebendig()) {
				zaehler++;
			}
		}
		return zaehler;
	}
}
