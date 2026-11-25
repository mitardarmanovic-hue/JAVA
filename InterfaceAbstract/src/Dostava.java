import java.util.ArrayList;
import java.util.Random;

public class Dostava {

	public static void main(String[] args) {

		ArrayList<Vozilo> vozila = new ArrayList<>();
		vozila.add(new Biciklo("A0",10));
		vozila.add(new Motor("B0",15));
		vozila.add(new Automobil("C0",25));
		int udaljenost = 10;
		for(Vozilo v:vozila) {
			udaljenost += new Random().nextInt();
			v.info();
			System.out.println("Vrijeme dostave: " + v.izracunajVrijemeDostave(udaljenost));
			
			if(v instanceof Ekonomicnost  e) {
				System.out.println("Vozilo je enkonoimcno a potrojsnja je " + e.potrosnjaPoKm());
				
			}else {
				System.out.println("Vozilo je automobil");
			}
		}
		
	}

}
