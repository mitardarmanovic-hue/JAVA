
public class Kuvar extends Zaposleni {

	public Kuvar(int id, String ime, String prezime, int satnica, int ukupanBrojSati) {
		super(id, ime, prezime, satnica, ukupanBrojSati);
	}

	@Override
	public String toString() {
		return "Kuvar [getId()=" + getId() + ", getIme()=" + getIme() + ", getPrezime()=" + getPrezime()
				+ ", getSatnica()=" + getSatnica() + ", getUkupanBrojSati()=" + getUkupanBrojSati() + "]";
	}
	private double obracunPlata() {
		double plata=0;
		plata= 1500 + 4* this.getUkupanBrojSati()* this.getSatnica();
		return plata;
	}
	
}
//1500 plus 4 * ukupanBrojSati * plataPoSatu.