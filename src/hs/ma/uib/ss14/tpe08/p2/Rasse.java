package hs.ma.uib.ss14.tpe08.p2;

public enum Rasse {
	Ork(150), Farseer(300), Untote(70), Lich(140), Mensch(110), Erzmagier(220), Nachtelf(
			145), Daemonenjaeger(290);

	private int kosten;

	private Rasse(int kosten) { //
		this.kosten = kosten;
	}
	
	public int getKosten(){
		return kosten;
	}

	
}
