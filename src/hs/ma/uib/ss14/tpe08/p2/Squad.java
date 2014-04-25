package hs.ma.uib.ss14.tpe08.p2;

public class Squad {
	private String name;
	public Wesen[] team = new Wesen[20]; // vorerst festgesetzt auf 20 Plätze.

	public Squad(String name) {
		this.name = name;
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
