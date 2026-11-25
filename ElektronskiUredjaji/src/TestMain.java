import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {// napravi opciju dva sa slajdova i tamo pretrazi po uredjajimai napravi listu dje ubacas e
		ArrayList<EUredjaji> lista = new ArrayList<EUredjaji>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite marku proizvoda koju zelite");
		String marka = ulaz.nextLine();
		System.out.println("Unesite sifru proizvoda");
		String sifra = ulaz.nextLine();
		System.out.println("unesite uvoznu cijenu");
		Double uvozna = ulaz.nextDouble();
		if(sifra.startsWith("RA")) {
			System.out.println("Unesite memoriju u GB");
			int memorija = ulaz.nextInt();
			System.out.println("Unesite tip procesora");
			String procesor = ulaz.nextLine();
					EUredjaji ra = new Racunari(marka,sifra,uvozna,memorija,procesor);
					System.out.println(ra);
					lista.add(ra);
		}else if(sifra.startsWith("TE")) {
			System.out.println("unesite operativni sistem");
			String os = ulaz.nextLine();
			System.out.println("unesite velicinu ekrana");
			double velEkrana = ulaz.nextDouble();
			Telefoni te = new Telefoni(marka,sifra,uvozna,os,velEkrana);
			System.out.println(te);
			lista.add(te);
		}else if(sifra.startsWith("TE")){
			System.out.println("unesite velicinu ekrana");
			double ekranSize = ulaz.nextDouble();
			Televizor tv = new Televizor(marka,sifra,uvozna,ekranSize);
			System.out.println(tv);
			lista.add(tv);
		}
		
		
		
		System.out.println("Unesite tip proizvoda koji trazite (RA, TE, TV)");
		String tip = ulaz.next();
		
		ArrayList<EUredjaji> pretrazeni = new ArrayList<EUredjaji>();
		pretrazeni = EUredjaji.pretragaUredjaja(lista,tip);
		
		for(EUredjaji x : pretrazeni) {
		    System.out.println();
		}	
		}
		
		
}
/*Televizor tv2TE = new Televizor("LG","TV56443TZ",100.0,40.0);

		Televizor tv1 = new Televizor("LG","TV56443TZ",100.0,40.0);
		Racunari PC = new Racunari("Asus","RA098662TR",200.0,256,"intel");
		Telefoni iphone = new Telefoni("iphone","TE9775954TZ",150.0,"IOS",7.0);)*/