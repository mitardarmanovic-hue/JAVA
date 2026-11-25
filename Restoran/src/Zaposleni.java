
public class Zaposleni {
	
	/*Svaki zaposleni ima
jedinstveni ID, ime, prezime, satnicu (plataPoSatu) i ukupan broj sati koje odradi tokom jedne
sedmice (ukupanBrojSati). */
	
	private int id;
	private String ime;
	private String prezime;
	private int satnica;
	private int ukupanBrojSati;
	
	public Zaposleni() {
		this(0,null,null,0,0);
	}
	public Zaposleni(int id, String ime, String prezime, int satnica, int ukupanBrojSati) {
		super();
		this.setId(id);
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setSatnica(satnica);
		this.setUkupanBrojSati(ukupanBrojSati);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getSatnica() {
		return satnica;
	}
	public void setSatnica(int satnica) {
		this.satnica = satnica;
	}
	public int getUkupanBrojSati() {
		return ukupanBrojSati;
	}
	public void setUkupanBrojSati(int ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}
	@Override
	public String toString() {
		return "Zaposleni [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", satnica=" + satnica
				+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}
	
	

}
