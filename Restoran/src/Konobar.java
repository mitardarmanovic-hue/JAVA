
public class Konobar extends Zaposleni {

	private int prekovremeniRad;


	public Konobar(int id, String ime, String prezime, int satnica, int ukupanBrojSati, int prekovremeniRad) {
		super(id, ime, prezime, satnica, ukupanBrojSati);
		this.prekovremeniRad = prekovremeniRad;
	}

	public int getPrekovremeniRad() {
		return prekovremeniRad;
	}

	public void setPrekovremeniRad(int prekovremeniRad) {
		this.prekovremeniRad = prekovremeniRad;
	}

	@Override
	public String toString() {
		return "Konobar [prekovremeniRad=" + prekovremeniRad + ", getId()=" + getId() + ", getIme()=" + getIme()
				+ ", getPrezime()=" + getPrezime() + ", getSatnica()=" + getSatnica() + ", getUkupanBrojSati()="
				+ getUkupanBrojSati() + "]";
	}
	private double obracunPlata() {
		double plata=0;
		plata =  this.getUkupanBrojSati()* this.getSatnica() +(this.getPrekovremeniRad()*1.20);
		return plata;
}
}
//Konačna mjesečna plata konobara predstavlja četiri sedmice redovnog
	//rada i prekovremenih sati.