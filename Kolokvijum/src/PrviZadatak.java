import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite broj n");
		int n = ulaz.nextInt();
		int br = n%8;
		int rez = 1 * 8 +br*1;
		System.out.println(rez);
		
		
		
	}

}
