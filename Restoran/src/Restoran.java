import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
	
	/*odatke: naziv, adresu i PIB, kao i listu zaposlenih.*/
	private String naziv;
	private String adresa;
	private String pib;
	private ArrayList<Zaposleni> listaZaposlenih;
	
	
	public Restoran(String naziv, String adresa, String pib, ArrayList<Zaposleni> listaZaposlenih) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.listaZaposlenih = listaZaposlenih;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public ArrayList<Zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}
	public void setListaZaposlenih(ArrayList<Zaposleni> listaZaposlenih) {
		this.listaZaposlenih = listaZaposlenih;
	}
	@Override
	public String toString() {
		return "Restoran [naziv=" + naziv + ", adresa=" + adresa + ", pib=" + pib + ", listaZaposlenih="
				+ listaZaposlenih + "]";
	}
	
	public static ArrayList<Zaposleni> dodajZaposlene(){
		 ArrayList<Zaposleni> list = new  ArrayList<Zaposleni>();
		 
	Scanner ulaz = new Scanner(System.in);
	System.out.println("unesite id radnika");
	int id = ulaz.nextInt();
	ulaz.nextLine();
	
	System.out.println("unesite ime radnika");
	String ime = ulaz.nextLine();
	System.out.println("unesite prezime");
	String prezime = ulaz.nextLine();
	
	System.out.println("unesite satnicu radnika");
	int satnica = ulaz.nextInt();
	ulaz.nextLine();
	System.out.println("Unesite ukupan broj sati koje je radnik radio u toku nedelje");
	int ukupanBrSati = ulaz.nextInt();
	ulaz.nextLine();
	System.out.println("koji tip radnika unosite");
	String radnik = ulaz.nextLine();
	if(radnik.toLowerCase().contains("menadzer")) {
		System.out.println("unesite ukoliko imate bonus");
		double bonus = ulaz.nextDouble();
		ulaz.nextLine();
		Menadzeri menadzer1 = new Menadzeri(id,ime,prezime,satnica,ukupanBrSati,bonus);
		list.add(menadzer1);
	}else if (radnik.toLowerCase().contains("konobar")) {
		System.out.println(" unesite prekovremene sate");
		int prekovremeniSati = ulaz.nextInt();
		ulaz.nextLine();
		Konobar konobar1 = new Konobar(id,ime,prezime,satnica,ukupanBrSati,prekovremeniSati);
		list.add(konobar1);
	}else {
		Kuvar kuvar1 = new Kuvar(id,ime,prezime,satnica,ukupanBrSati);
		list.add(kuvar1);
	}
	return list;
	
	}
	public double izracunajPlatu(Zaposleni z) {

	    double plata = 0;
	    if(z instanceof Menadzeri) {
	        Menadzeri m = (Menadzeri) z;
	        plata = 1300 + 4 * z.getUkupanBrojSati() * z.getSatnica() + m.getBonus();
	    } else if(z instanceof Konobar) {
	        Konobar k = (Konobar) z;
	        plata = 4 * (z.getUkupanBrojSati() * z.getSatnica()
	                + k.getPrekovremeniRad() * z.getSatnica() * 1.20);

	    } else if(z instanceof Kuvar) {
	        plata = 1500 + 4 * z.getUkupanBrojSati() * z.getSatnica();
	    }
	    return plata;
	}
		
	
	
	
	
	

}
