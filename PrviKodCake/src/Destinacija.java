import java.util.ArrayList;

public class Destinacija {
//naziv, drzava, ocjena (0–10), udaljenostKm,
	//brojPosjeta
	
	private String naziv;
	private String drzava;
	private int ocjena;
	private int udaljenostKm;
	private int brPosjeta;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public int getOcjena() {
		return ocjena;
	}
	public void setOcjena(int ocjena) {
		if(ocjena<0 || ocjena> 10) {
			this.ocjena=10;
		}else {
		this.ocjena = ocjena;
	}
	}
	public int getUdaljenostKm() {
		return udaljenostKm;
	}
	public void setUdaljenostKm(int udaljenostKm) {
		this.udaljenostKm = udaljenostKm;
	}
	public int getBrPosjeta() {
		return brPosjeta;
	}
	public void setBrPosjeta(int brPosjeta) {
		this.brPosjeta = brPosjeta;
	}
	public Destinacija(String naziv, String drzava, int ocjena, int udaljenostKm, int brPosjeta) {
		this.setNaziv(naziv);
		this.setDrzava(drzava);
		this.setOcjena(ocjena);
		this.setUdaljenostKm(udaljenostKm);
		this.setBrPosjeta(brPosjeta);
	}
	public static ArrayList<Destinacija> kulMjesta (ArrayList<Destinacija> niz) {
		ArrayList<Destinacija> kulMjesta = new ArrayList<>();
		for(Destinacija x:niz) {
			if(x.getOcjena()> 8 && x.getUdaljenostKm()<1000) {
				kulMjesta.add(x);
			}
		}
		return kulMjesta;
	}
	@Override
	public String toString() {
		return "Destinacija [naziv=" + naziv + ", drzava=" + drzava + ", ocjena=" + ocjena + ", udaljenostKm="
				+ udaljenostKm + ", brPosjeta=" + brPosjeta + "]";
	}
//	pronalaze destinaciju sa najvećim brojem posjeta,
	
	public static ArrayList<Destinacija> najPosjecenija (ArrayList<Destinacija> niz) {
		ArrayList<Destinacija> x = new ArrayList<>();
		int max =niz.get(0).getBrPosjeta();
		for(Destinacija a:niz) {
			if(max< a.getBrPosjeta()) {//ove petlje prodji sa chatom
				max = a.getBrPosjeta();	
				x.add(a);
				}
		}
		return x;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}