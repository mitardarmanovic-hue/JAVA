import java.util.ArrayList;

public class Televizor extends EUredjaji {
	private double velicinaEkrana;

	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(double velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}

	public Televizor(String opisProizvoda, String sifra, double uvoznaCijena, double velicinaEkrana) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.setVelicinaEkrana(velicinaEkrana);
	}

	@Override
	public String toString() {
		return "Televizor [velicinaEkrana=" + velicinaEkrana + ", getOpisProizvoda()=" + getOpisProizvoda()
				+ ", getSifra()=" + getSifra() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}

	public  void obracunMaloprodajneCijene () {
		this.setUvoznaCijena(getUvoznaCijena()*1.05);
		if(this.getVelicinaEkrana()> 65) {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}
	//Takođe, potrebno je napraviti metodu koja štampa određenu grupu proizvoda. Metoda
	//kao parametar prima niz uređaja i String tip uređaja a vraća sve uređaje odabranog tipa.
	

}
