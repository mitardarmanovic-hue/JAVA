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
public class Motocikl extends Vozilo {
	
	private int kilometraza;

	public int getKilometraza() {
		return kilometraza;
	}

	public void setKilometraza(int kilometraza) {
		this.kilometraza = kilometraza;
	}

	public Motocikl(String marka, int kubikaza, int godiste, int kilometraza) {
		super(marka, kubikaza, godiste);
		this.kilometraza = kilometraza;
	}

	@Override
	public String toString() {
		return "Motocikl [kilometraza=" + kilometraza + ", getMarka()=" + getMarka() + ", getKubikaza()="
				+ getKubikaza() + ", getGodiste()=" + getGodiste() + "]";
	}
	public Motocikl() {
		this(null,0,0,0);
	}
	public double cijenaRegistracije() {
		double reg =(this.getGodiste()/5-
				this.getKilometraza()
				/1000)*Vozilo.getOsnovicaZaRegistraciju();
		return reg;
	}
}
