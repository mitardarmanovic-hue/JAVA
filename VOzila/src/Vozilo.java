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
public class Vozilo {
	private String marka;
	private int kubikaza;
	private int godiste;
	private static double osnovicaZaRegistraciju;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public static double getOsnovicaZaRegistraciju() {
		return osnovicaZaRegistraciju;
	}
	public static void setOsnovicaZaRegistraciju(double osnovicaZaRegistraciju) {
		Vozilo.osnovicaZaRegistraciju = osnovicaZaRegistraciju;
	}
	public Vozilo(String marka, int kubikaza, int godiste) {
		this.marka = marka;
		this.kubikaza = kubikaza;
		this.godiste = godiste;
	}
	public Vozilo() {
		this(null,0,0);
	}
	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	}
	public  double cijenaRegistracije() {
		return 0;
	}
	

}
