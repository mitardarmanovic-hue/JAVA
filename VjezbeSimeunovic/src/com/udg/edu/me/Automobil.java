package com.udg.edu.me;

public class Automobil extends Vozilo {
	private int BrVrata;
	private int BrOsoba;
	
	
	public int getBrVrata() {
		return BrVrata;
	}
	public int setBrVrata(int brVrata) {
		if(BrVrata >= 3) {
			this.BrVrata = brVrata;
		}
		return brVrata;
	}
	public int getBrOsoba() {
		return BrOsoba;
	}
	public int setBrOsoba(int brOsoba) {
		return BrOsoba = brOsoba;
	}
	
	public Automobil() {
		this(null,null,0,1945,3,2);
		
	}
	public Automobil(String marka, String model, int kubikaza, int godiste, int brVrata, int brOsoba) {
		super(marka, model, kubikaza, godiste);
		BrVrata = setBrVrata(BrVrata);
		BrOsoba = setBrOsoba(brOsoba);
	}
	@Override
	public String toString() {
		return "Automobil [BrVrata=" + BrVrata + ", BrOsoba=" + BrOsoba + ", Marka()=" + getMarka() + ", Model()="
				+ getModel() + ", Kubikaza()=" + getKubikaza() + ", Godiste()=" + getGodiste() + "]";
	}
	@Override
	public float CijenaRegistracije() {
		float Cijena;
		
		Cijena = ((float)this.getKubikaza()/10 +(2026-this.getGodiste()*10) * Vozilo.getOsnovicaZaRegistraciju());
		return Cijena;
	}
	
	

}
