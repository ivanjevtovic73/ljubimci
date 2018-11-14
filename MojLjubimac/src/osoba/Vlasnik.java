package osoba;

import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.briga.BrigaOLjubimcu;
import zivotinje.briga.Setnja;
import java.util.ArrayList;
import java.util.List;

import greska.GreskaAplikacije;

public class Vlasnik {
	
//	private List<KucniLjubimac> mojiLjubimci = new ArrayList<>();	-	moze i ovako, ali bi zbog exception-a trebalo:
	
	public List<KucniLjubimac> mojiLjubimci;
	
	public Vlasnik() {
		super();
		this.mojiLjubimci = new ArrayList<>();
	}
	
	public void dodajLjubimca (KucniLjubimac ljubimac) throws GreskaAplikacije {
		if(mojiLjubimci.isEmpty()) {
			mojiLjubimci.add(ljubimac);
		} else {
			for(KucniLjubimac k : mojiLjubimci) {
				if(k.getNaziv().equals(ljubimac.getNaziv()))
					throw new GreskaAplikacije("Postoji kucni ljubimac sa imenom " + ljubimac.getNaziv()+ " !");			
			} 
			mojiLjubimci.add(ljubimac);
			System.out.println("Ljubimac je uspesno dodat!");
		} 
	}
	
	public void ukloniLjubimca (KucniLjubimac ljubimac) throws GreskaAplikacije {
		if (mojiLjubimci.isEmpty()) {
			throw new GreskaAplikacije("Nemas ljubimce!!!");
		}
		if(mojiLjubimci.contains(ljubimac)) {
			throw new GreskaAplikacije("Ljubimac ne postoji u Listi!");
		}
		mojiLjubimci.remove(ljubimac);
		System.out.println("Uspesno je uklonjen ljubimac " + ljubimac.getNaziv());
		
	}
		
	public void setaj(Setnja setnja) {
		Kuce kuce = (Kuce) setnja;
		System.out.println("Moj ljubimac je " + kuce.getNaziv() +  ", setam ga " + kuce.preporucenoVremeZabave() + " minuta dnevno.");
	}
	
	public void staviOgrlicu (KucniLjubimac kucniLjubimac) {
				
		try {
			Kuce pas = (Kuce) kucniLjubimac;
			System.out.println("Stavljena je ogrlica na " + pas.getNaziv());
				
		} catch (ClassCastException e) {
			System.err.println("Ne moze se staviti ogrlica!!!");}	//	catch blok uvek popunjavati, nikad ne ostavljati prazan!!!
		}
	
	public void brigaOLjubimcu(BrigaOLjubimcu oLjubimcu) {
		KucniLjubimac kl = (KucniLjubimac) oLjubimcu;
		System.out.println("O svom ljubimcu " + kl.getNaziv() + " se brinem na sledece nacine:");
		System.out.println(oLjubimcu.tipZabave());
		System.out.println("  najmanje " + oLjubimcu.preporucenoVremeZabave() + " minuta dnevno.");
		
		}
}