
public class Garderoba extends Proizvodi {

	private String materijal;
	private String sezona;
	public String getMaterijal() {
		return materijal;
	}
	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	public Garderoba(String opis, int barkood, String zemljaProizvodnje, int godProizvodnje, double uvoznaCijena,
			String materijal, String sezona) {
		super(opis, barkood, zemljaProizvodnje, godProizvodnje, uvoznaCijena);
		this.materijal = materijal;
		this.sezona = sezona;
	}
	@Override
	public String toString() {
		return "Garderoba [materijal=" + materijal + ", sezona=" + sezona + ", getOpis()=" + getOpis()
				+ ", getBarkood()=" + getBarkood() + ", getZemljaProizvodnje()=" + getZemljaProizvodnje()
				+ ", getGodProizvodnje()=" + getGodProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	public void UvecajCijenu() {
		this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		}
}
