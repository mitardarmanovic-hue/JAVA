import java.time.LocalDate;
public class Hrana extends Proizvod {
	
	private LocalDate RokUpotrebe;
	private int BrKalorija;
	
	
	
	public Hrana(String opis, int barkod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena,
			LocalDate rokUpotrebe, int brKalorija) {
		super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		RokUpotrebe = rokUpotrebe;
		BrKalorija = brKalorija;
	}
	public LocalDate getRokUpotrebe() {
		return RokUpotrebe;
	}
	public void setRokUpotrebe(LocalDate rokUpotrebe) {
		RokUpotrebe = rokUpotrebe;
	}
	public int getBrKalorija() {
		return BrKalorija;
	}
	public void setBrKalorija(int brKalorija) {
		BrKalorija = brKalorija;
	}
	public void UvecajCijenu() {
		LocalDate danas =LocalDate.now();
		if(danas.minusMonths(6).isAfter(RokUpotrebe)) {
			this.setUvoznaCijena(getUvoznaCijena()* 1.1);
	}else {
		this.setUvoznaCijena(getUvoznaCijena()*1.1);
	}
	
	}
	@Override
	public String toString() {
		return "Hrana RokUpotrebe=" + RokUpotrebe + ", Kalorija=" + BrKalorija + ", Opis=" + getOpis()
				+ ", Barkod=" + getBarkod() + ", ZemljaProizvodnje=" + getZemljaProizvodnje()
				+ ", GodinaProizvodnje=" + getGodinaProizvodnje() + ",UvoznaCijena=" + getUvoznaCijena();
	}
	
}
