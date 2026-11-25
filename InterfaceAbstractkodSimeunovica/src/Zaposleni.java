
public abstract class Zaposleni implements Trosak {

	private String ime;
	private String prezime;
	private int godinaStaza;
	
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
	public int getGodinaStaza() {
		return godinaStaza;
	}
	public void setGodinaStaza(int godinaStaza) {
		if(godinaStaza>= 0)
		this.godinaStaza = godinaStaza;
	}
	public Zaposleni(String ime, String prezime, int godinaStaza) {
		
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setGodinaStaza(godinaStaza);
	}
	public abstract float obracunPlate();
	
}
