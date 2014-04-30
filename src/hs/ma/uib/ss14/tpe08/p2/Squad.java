package hs.ma.uib.ss14.tpe08.p2;
/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class Squad {
	private String name;
	public Wesen[] team = new Wesen[0];
	private int kosten = 0;

	public Squad(String name, Rasse rasse1, int investition1, Rasse rasse2,
			int investition2) {
		this.name = name;
		this.kosten = investition1 + investition2;
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
			WesenFactory.kaufeWesen(this, rasse2, investition2);
		}
	}
	
	public Squad(String name, Rasse rasse1, int investition1, Rasse rasse2,
			int investition2, Rasse rasse3,	int investition3) {
		this.name = name;
		this.kosten = investition1 + investition2 + investition3;
		if (this.kosten <= 2000) {
			WesenFactory.kaufeWesen(this, rasse1, investition1);
			WesenFactory.kaufeWesen(this, rasse2, investition2);
			WesenFactory.kaufeWesen(this, rasse3, investition3);
		}
	}

	@Override
	public String toString() {
		return name;
	}

	public int getKosten() {
		return this.kosten;
	}

	public static Wesen[] arrayErweitern(Wesen[] ursprungsArray, Wesen w) {
		Wesen[] neuesArray = new Wesen[ursprungsArray.length + 1];
		for (int l = 0; l < ursprungsArray.length; l++) {
			neuesArray[l] = ursprungsArray[l];
		}
		neuesArray[neuesArray.length - 1] = w;
		return neuesArray;
	}

	public static Wesen[] arrayKuerzen(Wesen[] ursprungsArray) {
		Wesen[] neuesArray = new Wesen[ursprungsArray.length - 1];
		for (int l = 0; l < ursprungsArray.length - 1; l++) {
			neuesArray[l] = ursprungsArray[l + 1];
		}
		return neuesArray;
	}

	public void erhalteTeamSchaden(double schaden) {
		for (int i = 0; i < this.team.length; i++) {
			this.team[i].erhalteSchaden(schaden);
		}
	}

	public void hinzufuegen(Wesen w) {
		this.team = arrayErweitern(this.team, w);
	}

	public void loesche(Wesen w) {
		if (this.team[0].equals(this.team[this.team.length - 1])) {
			Wesen[] nix = new Wesen[0];
			this.team = nix;
		} else {
			for (int i = 0; i < this.team.length - 1; i++) {
				if (this.team[i].equals(w)) {
					this.team[i] = this.team[i + 1];
					this.team = arrayKuerzen(this.team);
				}
			}
		}
	}

	public int getAnzahl() {
		int zaehler = 0;
		if (this.team != null) {
			for (int i = 0; i < this.team.length; i++) {
				if (this.team[i].isLebendig()) {
					zaehler++;
				}
			}
		}
		return zaehler;
	}
}
