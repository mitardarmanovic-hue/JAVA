
public class Hrana extends Proizvodi {
	
	private int datum;
	private int brKalorija;
	
	public int getDatum() {
		return datum;
	}
	public void setDatum(int datum) {
		this.datum = datum;
	}
	public int getBrKalorija() {
		return brKalorija;
	}
	public void setBrKalorija(int brKalorija) {
		this.brKalorija = brKalorija;
	}
	public Hrana(String opis, int barkood, String zemljaProizvodnje, int godProizvodnje, double uvoznaCijena, int datum,
			int brKalorija) {
		super(opis, barkood, zemljaProizvodnje, godProizvodnje, uvoznaCijena);
		this.datum = datum;
		this.brKalorija = brKalorija;
	}
	@Override
	public String toString() {
		return "Hrana [datum=" + datum + ", brKalorija=" + brKalorija + ", getOpis()=" + getOpis() + ", getBarkood()="
				+ getBarkood() + ", getZemljaProizvodnje()=" + getZemljaProizvodnje() + ", getGodProizvodnje()="
				+ getGodProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	public void UvecajCijenu() {
		if(this.getDatum()< 6 ) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05);
			}else {
				this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}

}
