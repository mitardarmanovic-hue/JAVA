import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*U okviru glavnog programa testirati pomenute klase tako što ćete učitati vozni park
	jednog preduzeća i izračunati koliko je novca potrebno za registraciju svih vozila*/
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite osnovicu za registraciu");
		Vozilo.setOsnovicaZaRegistraciju(ulaz.nextDouble());
	ArrayList <Vozilo> preduzece = new ArrayList<Vozilo>();
	Vozilo auto = new Automobil("Bmw",1,1,1,1);
	Vozilo motor = new Motocikl ("ktm",2,3,5);
	Vozilo kamion = new Kamion("vrumvrum",2,3,6);
	System.out.println(auto.cijenaRegistracije());
	preduzece.add(kamion);
	preduzece.add(motor);
	preduzece.add(auto);
	double cijena =0;

	for(Vozilo x:preduzece) {
		
		cijena = x.cijenaRegistracije() + cijena;
		
	}
	System.out.println("Ukupna cijena za registrovanje svih kola je " + cijena);

	}

}
