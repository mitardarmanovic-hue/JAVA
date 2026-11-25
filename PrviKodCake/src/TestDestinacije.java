import java.util.ArrayList;

public class TestDestinacije {
	//naziv, drzava, ocjena (0–10), udaljenostKm,
		//brojPosjeta

	public static void main(String[] args) {

		ArrayList<Destinacija> dest = new ArrayList<>();
		
		Destinacija d1 = new Destinacija("Blok 5","Madagaskar", 12,100,3);
		Destinacija d2 = new Destinacija("Crnjak","Crna Zemlja", 7,100,4000);
		Destinacija d3 = new Destinacija("Jahorina","Bosna", 9,100,400);
		Destinacija d4 = new Destinacija("Blok 5","Crna Gora", 10,100,20);
		Destinacija d5 = new Destinacija("Pariz","Francuska", 6,100,230);

		dest.add(d1);
		dest.add(d2);
		dest.add(d3);
		dest.add(d4);
		dest.add(d5);

		ArrayList<Destinacija> p = Destinacija.kulMjesta(dest);
		ArrayList<Destinacija> l = Destinacija.najPosjecenija(dest);

		for(Destinacija x:p) {
			System.out.println(x);
		}
		System.out.println("drugi zad");
		for(Destinacija n:l) {
			System.out.println(n);
		}
	}

}
