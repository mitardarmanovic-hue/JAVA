import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner ulaz = new Scanner(System.in);
		KompleksniBroj k1 = new KompleksniBroj(9,5);
		System.out.println("unesite imaginarni dio");
		double b = ulaz.nextDouble();
		System.out.println("unesite realni dio");
		double a = ulaz.nextDouble();
		KompleksniBroj k2 = new KompleksniBroj(a,b);
		System.out.println(k1);
		System.out.println(k1.pomnozi(k2));
		System.out.println(k1.saberi(k2));
		System.out.println(k1.oduzmi(k2));
		System.out.println(k1.modul());
		
		ArrayList <KompleksniBroj> lista = new ArrayList<>();
		lista.add(k2);
		lista.add(k1);
		System.out.println("mmmmm");
		System.out.println(KompleksniBroj.provjeraVelicine(lista));
		
	}

}
