import java.util.ArrayList;

public class Racunari extends EUredjaji {
	
	private int Memorija;
	private String procesor;
	
	public Racunari(String opisProizvoda, String sifra, double uvoznaCijena, int memorija, String procesor) {
		super(opisProizvoda, sifra, uvoznaCijena);
		this.setMemorija(memorija);
		this.setProcesor(procesor);
	}
	public int getMemorija() {
		return Memorija;
	}
	public void setMemorija(int memorija) {
		Memorija = memorija;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	@Override
	public String toString() {
		return "Racunari [Memorija=" + Memorija + ", procesor=" + procesor + ", getOpisProizvoda()="
				+ getOpisProizvoda() + ", getSifra()=" + getSifra() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	
	public void obracunMaloprodajneCijene () {
		this.setUvoznaCijena(getUvoznaCijena()*1.05);
		this.setUvoznaCijena(getUvoznaCijena()*1.05);
	}
	

}
