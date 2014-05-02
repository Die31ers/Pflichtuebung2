package hs.ma.uib.ss14.tpe08.p2.WesenErzeugen;

import hs.ma.uib.ss14.tpe08.p2.Wesen.Wesen;


/**
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
	public ArrayList <Wesen> team = new ArrayList<Wesen>(); //GENERICS YO :D
	
	public Squad(String name, Rasse rasse1, int investition1) {
		this.name = name;
		this.kosten = investition1;
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
		}
	}

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

	public void erhalteTeamSchaden(double schaden) {
		for (int i = 0; i < this.team.size(); i++){
			this.team.get(i).erhalteSchaden(schaden);
		}
	}

	public void hinzufuegen(Wesen w) {
		this.team.add(w);
	}

	public void loesche(Wesen w) {
		this.team.remove(w);
	}

	public int getAnzahl() {
		int zaehler = 0;
		for (int i = 0; i < this.team.size(); i++){
			if (this.team.get(i).isLebendig()){
				zaehler++;
			}
		}
		return zaehler;
	}
}
