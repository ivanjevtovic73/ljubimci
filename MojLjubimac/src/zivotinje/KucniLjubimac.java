package zivotinje;

import greska.GreskaAplikacije;
import zivotinje.briga.BrigaOLjubimcu;

public abstract class KucniLjubimac implements BrigaOLjubimcu{

	@Override
	public String nazivLjubimca() {
		return getNaziv();
	}

	private String naziv;
	private Boolean dlaka;
	
	public KucniLjubimac(String naziv, Boolean dlaka) throws GreskaAplikacije {
		super();
		if (naziv == null || naziv.isEmpty()) {
			throw new GreskaAplikacije("Naziv mora biti popunjen!");
		}
		this.naziv = naziv;
		this.dlaka = dlaka;
	}
	
//	public abstract void nahrani(String hrana);		- apstraktna metoda; nema viticaste zagrade na kraju, vec samo ;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public Boolean getDlaka() {
		return dlaka;
	}
	
	public void setDlaka(Boolean dlaka) {
		this.dlaka = dlaka;
	}
			
}
