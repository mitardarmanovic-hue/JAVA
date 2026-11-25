/*Kreirati klasu Vozilo koja će kao podatke članove imati: marku, model, kubikazu, godiste, kao i
statičku promjenljivu osnovicaZaRegistraciju. Klasa posjeduje odgovarajuće konstruktore, inspektore i
mutatore, kao i metodu za računanje cijene registracije vozila. Iz klase Vozilo izvesti klase Automobil,
Motocikl i Kamion. Kao dodatne podatke članove, klasa Automobil ima brojVrata i brojOsoba; klasa
Motocikl kilometrazu i Kamion nosivost (u tonama). Cijena registracije Automobila se računa po
sledećoj formuli (kubikaza/10+(2026-godiste)*10)*osnovicaZaRegistraciju, Motocikla (kubikaza/5-
kilometraza/1000)*osnovicaZaRegistraciju i Kamiona (kubikaza/10+(2026-
godiste)*10)*osnovicaZaRegistraciju + 30*nosivost. Za svaku od klasa implementirati odgovarajuću
toString metodu. U okviru glavnog programa testirati pomenute klase tako što ćete učitati vozni park
jednog preduzeća i izračunati koliko je novca potrebno za registraciju svih vozila*/
public class Automobil extends Vozilo {

	private int brVrata;
	private int brOsoba;
	
	public int getBrVrata() {
		return brVrata;
	}
	public void setBrVrata(int brVrata) {
		this.brVrata = brVrata;
	}
	public int getBrOsoba() {
		return brOsoba;
	}
	public void setBrOsoba(int brOsoba) {
		this.brOsoba = brOsoba;
	}
	public Automobil(String marka, int kubikaza, int godiste, int brVrata, int brOsoba) {
		super(marka, kubikaza, godiste);
		this.brVrata = brVrata;
		this.brOsoba = brOsoba;
	}
	public Automobil() {
		this(null,0,0,0,0);
	}
	@Override
	public String toString() {
		return "Automobil [brVrata=" + brVrata + ", brOsoba=" + brOsoba + ", getMarka()=" + getMarka()
				+ ", getKubikaza()=" + getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}
	public double cijenaRegistracije() {
		double reg = (this.getKubikaza()/10+(2-this.getGodiste()*10)
				*Vozilo.getOsnovicaZaRegistraciju());
		return reg;
	}
}
