import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Proizvod> Proiz = new ArrayList <Proizvod>();
		
		Proiz.add(new Garderoba("Kacket", 8907,"Madagaskar", 2026,9.99,"pamuk","ljetnja"));
		Proiz.add(new HemijskiProizvodji("parfem",78655,"Indija",2016,48.99,10,true));
		Proiz.add(new Hrana("Pica",32445,"Italy",2016,11,LocalDate.of(2026,10,22),600));
		
		
		for(Proizvod p:Proiz) {
			p.UvecajCijenu();
		}
		for(Proizvod p:Proiz) {
			System.out.println(p);
		}
	}

}
