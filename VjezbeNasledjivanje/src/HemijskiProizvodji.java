
public class HemijskiProizvodji extends Proizvod {
	
	private double temperaturaSkladistenja;
	private boolean zapaljivo;
	
	
	public HemijskiProizvodji(String opis, int barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, double temperaturaSkladistenja, boolean zapaljivo) {
		super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	public double getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public void setTemperaturaSkladistenja(double temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	
	

	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	public void UvecajCijenu() {
		if(this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.25);
			}else {
				this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}
	
	@Override
	public String toString() {
		return "HemijskiProizvodji temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ ", Opis=" + getOpis() + ", Barkod=" + getBarkod() + ", ZemljaProizvodnje="
				+ getZemljaProizvodnje() + ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", UvoznaCijena="
				+ getUvoznaCijena() ;
	}
	
}
