package com.udg.edu.me;

public class Kamion extends Vozilo {
	
	private int Nosivosit;

	public int getNosivosit() {
		return Nosivosit;
	}

	public void setNosivosit(int nosivosit) {
		Nosivosit = nosivosit;
	}

	public Kamion() {
		this(null,null,0,1945,0);
	}
	public Kamion(String marka, String model, int kubikaza, int godiste, int nosivosit) {
		super(marka, model, kubikaza, godiste);
		Nosivosit = nosivosit;
	}

	@Override
	public String toString() {
		return "Kamion [Nosivosit=" + Nosivosit + ", Nosivosit()=" + getNosivosit() + ", Marka()=" + getMarka()
				+ ", Model()=" + getModel() + ", Kubikaza()=" + getKubikaza() + ", Godiste()=" + getGodiste()
				+ "]";
	}

	@Override
	public float CijenaRegistracije() {
		float Cijena;
		Cijena = ((float)this.getKubikaza() + (2026-this.getGodiste()) * 10) *Vozilo.getOsnovicaZaRegistraciju() + 30 * this.getNosivosit();
		
		return Cijena;
	}
	

}
