
public class HemijskiProizvodi extends Proizvodi {
	
	/* Atribut - Temperatura skladištenja, Zapaljivo.
	 Pravilo za obračun cijene: Uvozna cijena uvećana za maržu od 12.5 % ukoliko je
	 proizvod zapaljiv a ukoliko nije 10%*/
	private int temp;
	private boolean zapaljivo;
	
	
	
	public HemijskiProizvodi(String opis, int barkood, String zemljaProizvodnje, int godProizvodnje, double uvoznaCijena,
			int temp, boolean zapaljivo) {
		super(opis, barkood, zemljaProizvodnje, godProizvodnje, uvoznaCijena);
		this.temp = temp;
		this.zapaljivo = zapaljivo;
	}
	
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	@Override
	public String toString() {
		return "HemijskiProizvodi [temp=" + temp + ", zapaljivo=" + zapaljivo + ", getOpis()=" + getOpis()
				+ ", getBarkood()=" + getBarkood() + ", getZemljaProizvodnje()=" + getZemljaProizvodnje()
				+ ", getGodProizvodnje()=" + getGodProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}
	public void maloProdajnaC () {
		if(this.zapaljivo) {
			setUvoznaCijena(getUvoznaCijena()*1.25);
		}else {
			setUvoznaCijena(this.getUvoznaCijena()*1.1);
		}
	}


}
