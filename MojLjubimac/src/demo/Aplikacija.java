package demo;

import greska.GreskaAplikacije;

import osoba.Vlasnik;
import zivotinje.*;

public class Aplikacija {
	
	public static void main(String[] args) throws GreskaAplikacije {

		
	try {
		Vlasnik vlasnik = new Vlasnik();
		Kuce ker = new Kuce("dzeki", true, "DOG", false );
		KucniLjubimac ribica = new Ribica("Zlata", false, true);
		KucniLjubimac hrcak = new Hrcak("pera", true, "siva");
				
//		vlasnik.ukloniLjubimca(ribica);
		
//		vlasnik.setaj(ker);
//		vlasnik.setaj(ribica);	- ne moze!
		
//		vlasnik.brigaOLjubimcu(ker);
//		vlasnik.brigaOLjubimcu(ribica);
//		
//		vlasnik.staviOgrlicu(hrcak);
//		vlasnik.staviOgrlicu(ribica);
//		vlasnik.staviOgrlicu(ker);
		
		vlasnik.dodajLjubimca(ribica);
		vlasnik.dodajLjubimca(ribica);
		vlasnik.dodajLjubimca(hrcak);
		vlasnik.dodajLjubimca(ker);
		vlasnik.dodajLjubimca(ker);
		vlasnik.dodajLjubimca(ker);
		
		vlasnik.ukloniLjubimca(ribica);
		vlasnik.ukloniLjubimca(ker);
		vlasnik.ukloniLjubimca(hrcak);
	
						
	} catch (GreskaAplikacije e) {
		System.out.println(e.getMessage());
	}}}
