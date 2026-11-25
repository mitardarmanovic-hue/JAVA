
public class Zaposleni {

	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodineStaza() {
		return godineStaza;
	}
	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
		
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setGodineStaza(godineStaza);
		this.setPlata(plata);
	}
	@Override
	public String toString() {
		return "Zaposleni [ime=" + ime + ", prezime=" + prezime + ", godineStaza=" + godineStaza + ", plata=" + plata;

	}
	public void provjeraPlate() {
		if(this.getPlata() < 800) {
			this.setPlata(this.getPlata()*1.06);
		}else {
			this.setPlata(getPlata());
		}
	}

}
