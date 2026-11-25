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
public class Kamion extends Vozilo {
	
	private double nosivost;

	public Kamion(String marka, int kubikaza, int godiste, double nosivost) {
		super(marka, kubikaza, godiste);
		this.nosivost = nosivost;
	}

	public double getNosivost() {
		return nosivost;
	}

	public void setNosivost(double nosivost) {
		this.nosivost = nosivost;
	}
	public Kamion() {
		this(null,0,0,0);
	}
	public double cijenaRegistracije() {
		double reg = (this.getKubikaza()/10+(2026-
				this.getGodiste())*10)*Vozilo.getOsnovicaZaRegistraciju() + 30*this.getNosivost();
		return reg;
	
	}
}
