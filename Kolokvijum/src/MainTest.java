import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		IspitniTermin it1 = new IspitniTermin("java","sifra","2026-12-12","A4",100);
		IspitniTermin it2 = new IspitniTermin("java","sifra","2026-12-12","A5",80);
		IspitniTermin it3 = new IspitniTermin("matematika","sifraa","2026-12-12","A2",90);
		IspitniTermin it4 = new IspitniTermin("baze","SIifra","2026-12-12","A1",90);
		IspitniTermin it5 = new IspitniTermin("java","drugasifra","2026-12-12","A3",15);
		ArrayList<IspitniTermin> lista = new ArrayList<IspitniTermin>();
		lista.add(it1);
		lista.add(it2);
		lista.add(it3);
		lista.add(it4);
		lista.add(it5);
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite naziv predmeta");
		
		String naziv = ulaz.nextLine();
		System.out.println("unesite sifru");
		String sifra = ulaz.nextLine();
		
		
		System.out.println(IspitniTermin.brojiStudente(naziv,lista));
		System.out.println(IspitniTermin.vracaSaluIspitnu(lista,sifra));
		
	}

}
