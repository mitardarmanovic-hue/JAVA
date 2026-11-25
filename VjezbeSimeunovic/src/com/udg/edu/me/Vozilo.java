package com.udg.edu.me;

public class Vozilo {

	private String marka;
	private String model;
	private int kubikaza;
	private int godiste;
	
	private static float OsnovicaZaRegistraciju;
	
	public Vozilo() {
		this(null,null,0,1945);
	}
	
	public Vozilo(String marka, String model, int kubikaza, int godiste) {
		super();
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.godiste = godiste;
		
		
	}
	public static float getOsnovicaZaRegistraciju() {
		return OsnovicaZaRegistraciju;
	}

	public static void setOsnovicaZaRegistraciju(float osnovicaZaRegistraciju) {
		OsnovicaZaRegistraciju = osnovicaZaRegistraciju;
	}

	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		if(kubikaza >= 0) {
			this.kubikaza = kubikaza;
		}
	}
	public int getGodiste() {
		
		
		return godiste;
	}
	public void setGodiste(int godiste) {
		if(godiste > 1945) {
		this.godiste = godiste;
	}
	}
	public float CijenaRegistracije() {
		return 0;
	}

	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	}
	
}
