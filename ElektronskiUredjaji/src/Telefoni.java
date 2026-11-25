import java.util.ArrayList;

public class Telefoni extends EUredjaji {

	private String OS;
	private double velicinaEkrana;
	
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}
	public void setVelicinaEkrana(double velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	public Telefoni(String opisProizvoda, String sifra, double uvoznaCijena, String oS, double velicinaEkrana) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.setOS(oS);
		this.setVelicinaEkrana(velicinaEkrana);
	}
	@Override
	public String toString() {
		return "Telefoni [OS=" + OS + ", velicinaEkrana=" + velicinaEkrana + ", getOpisProizvoda()="
				+ getOpisProizvoda() + ", getSifra()=" + getSifra() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	public void obracunMaloprodajneCijene () {
		this.setUvoznaCijena(getUvoznaCijena()*1.05);
	if(this.getVelicinaEkrana()> 6) {
		this.setUvoznaCijena(getUvoznaCijena()*1.03);
	}
	
	}
	
}
