
public class Proizvodi {
	//opis proizvoda, barkod,
	//zemlja proizvodnje, godina proizvodnje i uvozna cijena proizvoda

	private String opis;
	private int barkood;
	private String zemljaProizvodnje;
	private int godProizvodnje;
	private double uvoznaCijena;
	
	public void UvecajCijenu() {}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getBarkood() {
		return barkood;
	}
	public void setBarkood(int barkood) {
		this.barkood = barkood;
	}
	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}
	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}
	public int getGodProizvodnje() {
		return godProizvodnje;
	}
	public void setGodProizvodnje(int godProizvodnje) {
		this.godProizvodnje = godProizvodnje;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public Proizvodi(String opis, int barkood, String zemljaProizvodnje, int godProizvodnje, double uvoznaCijena) {
		super();
		this.opis = opis;
		this.barkood = barkood;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.godProizvodnje = godProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}
	public Proizvodi() {
		this(null,0,null,0,0);
	}
	@Override
	public String toString() {
		return "Proizvodi [opis=" + opis + ", barkood=" + barkood + ", zemljaProizvodnje=" + zemljaProizvodnje
				+ ", godProizvodnje=" + godProizvodnje + ", uvoznaCijena=" + uvoznaCijena + "]";
	}
	
	
	
	
}
