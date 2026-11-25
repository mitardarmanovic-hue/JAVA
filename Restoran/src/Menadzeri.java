
public class Menadzeri extends Zaposleni {
	
	private  double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Menadzeri(int id, String ime, String prezime, int satnica, int ukupanBrojSati, double bonus) {
		super(id, ime, prezime, satnica, ukupanBrojSati);
		this.setBonus(bonus);
	}

	@Override
	public String toString() {
		return "Menadzeri [bonus=" + bonus + ", getId()=" + getId() + ", getIme()=" + getIme() + ", getPrezime()="
				+ getPrezime() + ", getSatnica()=" + getSatnica() + ", getUkupanBrojSati()=" + getUkupanBrojSati()
				+ "]";
	}
	private double obracunPlata() {
		double plata=0;
		plata= 1300 + 4* this.getUkupanBrojSati()* this.getSatnica() + this.getBonus();
		return plata;
	}
	

}
//1300 + 4 * ukupanBrojSati * plataPoSatu + bonus.