/*private String nazivStanice;
	private String datumOpazanja;
	private int temp;
	private int vlaznostVazduha;
	private int vazdusniPritisak;
	public String getNazivStanice()*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Trecizadaatak> lista = new ArrayList<Trecizadaatak>();
		Trecizadaatak opazanje1 = new Trecizadaatak("stanica1","2026-12-20  20-50-30",10,2,60);
		Trecizadaatak opazanje2 = new Trecizadaatak("stanica2","2026-12-20  20-50-30",10,2,60);
		Trecizadaatak opazanje3 = new Trecizadaatak("stanica3","2026-12-20  20-50-30",18,2,60);
		Trecizadaatak opazanje4 = new Trecizadaatak("stanica1","2026-12-22 20-50-30",120,2,60);
		System.out.println("unesite datum");
		String date= ulaz.nextLine();
		lista.add(opazanje1);
		lista.add(opazanje2);
		lista.add(opazanje3);
		lista.add(opazanje4);
		
		System.out.println(Trecizadaatak.najvecaTemp(lista,date));
		System.out.println("unesite ime stanice koju zelite da istampate");
		String name = ulaz.nextLine();
		System.out.println(Trecizadaatak.izdvojiPodatke(name , lista));
	}

}
