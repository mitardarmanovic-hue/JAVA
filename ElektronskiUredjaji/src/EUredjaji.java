
import java.util.ArrayList;

public class EUredjaji {

	//su opis proizvoda, šifre proizvoda i uvozna cijena
	//proizvoda.
	private String opisProizvoda;
	private String sifra;
	private double uvoznaCijena;
	
	
	public EUredjaji(String opisProizvoda, String sifra, double uvoznaCijena) {
		super();
		this.setOpisProizvoda(opisProizvoda);
		this.setSifra(sifra);
		this.setUvoznaCijena(uvoznaCijena);
	}
	public EUredjaji() {
		this(null,null,0);
	}
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	@Override
	public String toString() {
		return "EUredjaji [opisProizvoda=" + opisProizvoda + ", sifra=" + sifra + ", uvoznaCijena=" + uvoznaCijena
				+ "]";
	}
	public  void obracunMaloprodajneCijene () {
	}
	public static ArrayList<EUredjaji> pretragaUredjaja (ArrayList<EUredjaji> niz, String s){
		ArrayList<EUredjaji> nizZaPrintanje = new ArrayList<EUredjaji>();
		for(EUredjaji x:niz) {
			if(x.getSifra().contains(s)) {
				nizZaPrintanje.add(x);
		}
		}
			return nizZaPrintanje;
	}

	
	
	
}
