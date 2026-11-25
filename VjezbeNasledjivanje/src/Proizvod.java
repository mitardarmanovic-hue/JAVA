
public class Proizvod {

	private String Opis;
	private int Barkod;
	private String ZemljaProizvodnje;
	private int GodinaProizvodnje;
	private double UvoznaCijena;
	
	
	public Proizvod() {
		this(null,0,null,0,0);
		
	}
	
	public Proizvod(String opis, int barkod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena) {
		Opis = opis;
		Barkod = barkod;
		ZemljaProizvodnje = zemljaProizvodnje;
		GodinaProizvodnje = godinaProizvodnje;
		UvoznaCijena = uvoznaCijena;
	}


	public String getOpis() {
		return Opis;
	}


	public void setOpis(String opis) {
		Opis = opis;
	}


	public int getBarkod() {
		return Barkod;
	}


	public void setBarkod(int barkod) {
		Barkod = barkod;
	}


	public String getZemljaProizvodnje() {
		return ZemljaProizvodnje;
	}


	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		ZemljaProizvodnje = zemljaProizvodnje;
	}


	public int getGodinaProizvodnje() {
		return GodinaProizvodnje;
	}


	public void setGodinaProizvodnje(int godinaProizvodnje) {
		GodinaProizvodnje = godinaProizvodnje;
	}


	public double getUvoznaCijena() {
		return UvoznaCijena;
	}


	public void setUvoznaCijena(double uvoznaCijena) {
		UvoznaCijena = uvoznaCijena;
	}
	public void UvecajCijenu() {// da bi se u mainu mogle pozvati funkcije iz podklasa mora u glavnoj klasi iz koje mi ustvari pozivamo sve moglo pozvati treba nam ova prazna funkcija
		
		
	
	}
	
}
	
	
