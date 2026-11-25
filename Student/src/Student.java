import java.util.ArrayList;

public class Student {
	
	/*Kreirati klasu Student koja će kao podatke članove imati: ime, prezime, brojIndeksa, adresu,
brojBodova i polozioIliNe, kao i statičku promjenljivu prolazNaIspitu. Klasa treba da ima
odgovarajuće konstruktore, inspektore i mutatore. Pored ovoga, klasa treba da posjeduje metodu koja na
osnovu vrijednosti statičke promjenljive prolazNaIspitu ažurira atribut polozioIliNe, kao i metode koje
iz niza studenata izdvajaju one koji žive u istoj ulici i one koji su položili ispit. U glavnom programu
testirati pomenutu klasu.*/
	
	private String ime;
	private String prezime;
	private int brIndeksa;
	private String adresa;
	private double brBodova;
	private boolean polozio;
	private static double prolazNaIspitu;
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
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public double getBrBodova() {
		return brBodova;
	}
	public void setBrBodova(double brBodova) {
		this.brBodova = brBodova;
	}
	public boolean isPolozio() {
		return polozio;
	}
	public void setPolozio(boolean polozio) {
	  this.polozio=polozio;
	}
		
	public static double getProlazNaIspitu() {
		return prolazNaIspitu;
	}
	public static void setProlazNaIspitu(double prolazNaIspitu) {
		Student.prolazNaIspitu = prolazNaIspitu;
	}
	public Student(String ime, String prezime, int brIndeksa, String adresa, double brBodova) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.brIndeksa = brIndeksa;
		this.adresa = adresa;
		this.brBodova = brBodova;
		this.polozio = false;
		
	}
	public Student () {
		this(null,null,0,null,0);
	}
	public void polozioIliNe() {
		if(this.getBrBodova()> Student.getProlazNaIspitu()) {
			this.setPolozio(true);
		}else {
		this.setPolozio(false);
	}
	}
	/* kao i metode koje
iz niza studenata izdvajaju one koji žive u istoj ulici i one koji su položili ispit. U glavnom programu
testirati pomenutu klasu.*/
	
	public static ArrayList <Student> polozili (ArrayList<Student> lista, String s) {
		ArrayList <Student> niz = new ArrayList <Student>();
		for(Student x:lista ) {
			if(x.isPolozio() == true && s.equals(x.getAdresa())) {
				niz.add(x);
			}
		}
		return niz;
	}
	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brIndeksa=" + brIndeksa + ", adresa=" + adresa
				+ ", brBodova=" + brBodova + ", polozio=" + polozio + "]";
	}
	
}
