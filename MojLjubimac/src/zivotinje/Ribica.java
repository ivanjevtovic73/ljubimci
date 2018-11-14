package zivotinje;

import greska.GreskaAplikacije;

public class Ribica extends KucniLjubimac {
	
	private Boolean zlatna;

	public Ribica(String naziv, Boolean dlaka, Boolean zlatna) throws GreskaAplikacije {
		super(naziv, dlaka);
		this.zlatna = zlatna;
	}

	public Boolean getZlatna() {
		return zlatna;
	}

	public void setZlatna(Boolean zlatna) {
		this.zlatna = zlatna;
	}

	@Override
	public String tipZabave() {
		return getNaziv() + " trazi: " + " -Plivanje u akvarijumu";
	}

	@Override
	public Integer preporucenoVremeZabave() {
		return 14400;
	}


}
