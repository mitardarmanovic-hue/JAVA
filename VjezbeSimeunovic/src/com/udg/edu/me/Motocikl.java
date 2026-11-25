package com.udg.edu.me;

public class Motocikl extends Vozilo {
	
	private int Kilometraza;

	public int getKilometraza() {
		return Kilometraza;
	}

	public void setKilometraza(int kilometraza) {
		Kilometraza = kilometraza;
	}
	
	public Motocikl() {
		this(null,null,0,1945,0);
	}

	public Motocikl(String marka, String model, int kubikaza, int godiste, int kilometraza) {
		super(marka, model, kubikaza, godiste);
		Kilometraza = kilometraza;
	}

	@Override
	public String toString() {
		return "Motocikl [Kilometraza=" + Kilometraza + ", Marka()=" + getMarka() + ", Model()=" + getModel()
				+ ", Kubikaza()=" + getKubikaza() + ", Godiste()=" + getGodiste() + "]";
	}

	@Override
	public float CijenaRegistracije() {
		float Cijena;
		Cijena = ((float)this.getKubikaza()/5 + (float)this.getKilometraza() * Vozilo.getOsnovicaZaRegistraciju());
		return Cijena;
	}
	
	

}
