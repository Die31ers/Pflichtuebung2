package hs.ma.uib.ss14.tpe08.p2;

public class Squad {
	private String name;
	private Rasse rasse;
	private Rasse rasse1;
	private int investition;
	private int investition1;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param rasse
	 * @param investition
	 */

	public Squad(String name, Rasse rasse,  int investition,Rasse rasse1,
			int investition1) {
		this.name = name;
		this.rasse = rasse;
		this.investition = investition;
		this.rasse1 = rasse1;
		this.investition1 = investition1;
	}

	public Wesen[] team = new Wesen[0];

	public static Wesen[] arrayErweitern(Wesen[] ursprungsArray, Wesen w) {
		Wesen[] neuesArray = new Wesen[ursprungsArray.length + 1];
		for (int l = 0; l < ursprungsArray.length; l++) {
			neuesArray[l] = ursprungsArray[l];
		}
		neuesArray[neuesArray.length - 1] = w;
		return neuesArray;
	}

	@Override
	public String toString() {
		return name;
	}

	public void erhalteTeamSchaden(double schaden) {
		for (int i = 0; i < this.team.length; i++) {
			this.team[i].erhalteSchaden(schaden);
		}
	}

	public void hinzufuegen(Wesen w) {

		for (int i = 0; i < this.team.length; i++) {
			if (this.team[i] == null) {
				this.team[i] = w;
			}
		}
	}

	public void loesche(Wesen w) {
		for (int i = 0; i < this.team.length; i++) {
			if (this.team[i].equals(w)) {
				this.team[i] = this.team[i + 1];
			}
		}
	}

	public int getAnzahl() {
		int zaehler = 0;
		for (int i = 0; i < this.team.length; i++) {
			if (this.team[i] != null) {
				zaehler++;
			}
		}
		return zaehler;
	}
}
