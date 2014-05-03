package hs.ma.uib.ss14.tpe08.p2.Test;

import static org.junit.Assert.*;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Daemonenjaeger;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Erzmagier;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Farseer;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Lich;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Nachtelf;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Ork;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Mensch;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Untote;
import hs.ma.uib.ss14.tpe08.p2.Wesen.Geist;
import hs.ma.uib.ss14.tpe08.p2.WesenErzeugen.Rasse;
import hs.ma.uib.ss14.tpe08.p2.WesenErzeugen.Squad;

import org.junit.Test;

public class Teste {

	Squad s1 = new Squad("Daemonenjaeger Gruppe", Rasse.Daemonenjaeger, 1000,
			Rasse.Mensch, 1000);
	Squad s2 = new Squad("Lich Gruppe", Rasse.Lich, 1200, Rasse.Nachtelf, 800);
	
	Squad s3 = new Squad("The walking Dead", Rasse.Lich, 1400, Rasse.Mensch,
			600);
	
	Squad s4 = new Squad("The Heroes", Rasse.Erzmagier, 1220, Rasse.Mensch,
			780);

	@Test
	public void testeNamen0() {
		assertEquals("Daemonenjaeger Gruppe", s1.toString());
	}
	
	@Test
	public void testeNamen1() {
		assertEquals("Lich Gruppe", s2.toString());
	}
	
	@Test
	public void testeNamen2() {
		assertEquals("The walking Dead", s3.toString());
	}
	
	@Test
	public void testeNamen3() {
		assertEquals("The Heroes", s4.toString());
	}
		
	@Test
	public void testeNamen4() {
		Squad s6 = new Squad("Erzmagier Gruppe", Rasse.Erzmagier, 1500,
				Rasse.Untote, 500);
		assertEquals("Erzmagier Gruppe", s6.toString());
	}	
	
	@Test
	public void testeNamen5() {
		Squad s7 = new Squad("Farseer Gruppe", Rasse.Farseer, 900, Rasse.Mensch,
				1100);
		assertEquals("Farseer Gruppe", s7.toString());
	}

	@Test
	public void testeEnum0() {
		assertEquals(70, Rasse.Untote.getKosten());
	}

	
	@Test
	public void testeEnum1() {
		assertEquals(150, Rasse.Ork.getKosten());
	}
	
	@Test
	public void testeEnum2() {
		assertEquals(290, Rasse.Daemonenjaeger.getKosten());
	}
	
	@Test
	public void testeEnum3() {
		assertEquals(220, Rasse.Erzmagier.getKosten());
	}
		
	@Test 
	public void GeistAngriff() {
		assertEquals(1, new Geist().attack(new Untote()),0);
	}
	
	@Test
	public void testeAngriff0() {
		assertEquals(8000.0,
				Erzmagier.getInstance().attack(Daemonenjaeger.getInstance()),0);
	}

	@Test
	public void testeAngriff1() {
		assertEquals(132, new Ork().attack(new Nachtelf()),0);
	}

	@Test
	public void testeAngriff2() {
		assertEquals(51.2, new Untote().attack(new Mensch()),0);
	}
	
	@Test
	public void testeAngriff3() {
		assertEquals(800, new Mensch().attack(new Nachtelf()),0);
	}
	
	@Test
	public void testeAngriff4() {
		assertEquals(130.5, new Nachtelf().attack(new Untote()),0);
	}
	
	@Test
	public void TestSingelton0() {
		assertTrue(Daemonenjaeger.getInstance().equals(
				Daemonenjaeger.getInstance()));
	}
	
	@Test
	public void TestSingelton1() {
		assertTrue(Erzmagier.getInstance().equals(
				Erzmagier.getInstance()));
	}

	@Test
	public void testeVerwesung() {
		assertEquals(276, Lich.getInstance().getHP(), 0);
		Squad s5 = new Squad("l", Rasse.Nachtelf, 2000);
		Lich.getInstance().verwesung(s5);
		assertEquals(114.4, s5.team.get(0).getHP(), 0);
		assertEquals(13, s5.getAnzahl(), 0);
		assertEquals(367, Lich.getInstance().getHP(), 0);
	}
	
	@Test
	public void testeGoldschuss() {
		Squad s3 = new Squad("Nase", Rasse.Mensch, 1000, Rasse.Ork, 1000);
		Daemonenjaeger.getInstance().goldschuss(s3);
		assertEquals(126.5, s3.team.get(1).getHP(), 0);
	}

	@Test
	public void testeDoppelschlag() {
		Squad s4 = new Squad("Test", Rasse.Ork, 1000, Rasse.Untote, 1000);
		assertEquals(19, s4.team.size(), 0);
		Farseer.getInstance().doppelschlag(s4);
		assertEquals(17, s4.team.size(), 0);
	}

	@Test
	public void teste1Absorption() {
		Erzmagier.getInstance().absorption();
		Farseer.getInstance().attack(Erzmagier.getInstance());
		assertEquals(700, Erzmagier.getInstance().getHP(), 0);
	}

	 /*
	  * Sollte der Anführer auf einen anderen Anführer treffen und dessen 
	  * Element überlegen sein, wird der Schaden noch einmal verdoppelt.
	  * Hierbei gilt:
	  * Feuer(Erzmagier )stärker Luft(Dämonenjäger)
	  * Wasser(Lich)stärker Feuer (Erzmagier )
	  * Erde(Farseer) stärker Wasser(Lich)
	  * Luft(Dämonenjäger) stärker Erde(Farseer)
	  */

	@Test
	public void testeDoppelterSchaden1() {
		assertEquals(8000,
				Erzmagier.getInstance().attack(Daemonenjaeger.getInstance()), 0);
	}

	@Test
	public void testeDoppelterSchaden2() {
		assertEquals(316.8, Farseer.getInstance().attack(Lich.getInstance()), 0);
	}

	@Test
	public void testeDoppelterSchaden3() {
		assertEquals(783,
				Daemonenjaeger.getInstance().attack(Farseer.getInstance()), 0);
	}

	@Test
	public void testeDoppelterSchaden4() {
		assertEquals(235.52,
				Lich.getInstance().attack(Erzmagier.getInstance()), 0.0000001);
	}
	
	// Hier nocheinmal ohne überlegene Elemente. 
	
	@Test
	public void testeSchaden1() {
		assertEquals(4000,
				Erzmagier.getInstance().attack(Farseer.getInstance()),0);
	}
	
	@Test
	public void testeSchaden2() {
		assertEquals(158.4,
				Farseer.getInstance().attack(Daemonenjaeger.getInstance()),0);
	}
	
	@Test
	public void testeSchaden3() {
		assertEquals(391.5,
				Daemonenjaeger.getInstance().attack(Erzmagier.getInstance()),0);
	}
	
	@Test
	public void testeSchaden4() {
		assertEquals(117.76,
				Lich.getInstance().attack(Farseer.getInstance()),0.0000001);
	}
}
