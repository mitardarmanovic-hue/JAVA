
public class Garderoba extends Proizvod {
	
	private String MaterijalProiz;
	private String Sezona;
	
	public Garderoba(String opis, int barkod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena,
			String materijalProiz, String sezona) {
		super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.MaterijalProiz = materijalProiz;
		this.Sezona = sezona;
	}
	
	public String getMaterijalProiz() {
		return MaterijalProiz;
	}
	public void setMaterijalProiz(String materijalProiz) {
		MaterijalProiz = materijalProiz;
	}
	public String getSezona() {
		return Sezona;
	}
	public void setSezona(String sezona) {
		Sezona = sezona;
	}

	public void UvecajCijenu() {
	this.setUvoznaCijena(this.getUvoznaCijena()* 1.05);
		
	}

	@Override
	public String toString() {
		return "Garderoba [MaterijalProiz=" + MaterijalProiz + ", Sezona=" + Sezona + ", Opis=" + getOpis()
				+ ", Barkod=" + getBarkod() + ", ZemljaProizvodnje=" + getZemljaProizvodnje()
				+ ", GodinaProizvodnje=" + getGodinaProizvodnje() + ", UvoznaCijena=" + getUvoznaCijena();
	}
	
}
