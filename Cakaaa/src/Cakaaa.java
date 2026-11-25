import java.util.Scanner;

public class Cakaaa{
	public static boolean JePalindrom(String s) {
		s= s.replace(" ","");
		
		String obrnuti = new StringBuilder(s).reverse().toString();
		if(obrnuti.equals(s)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println(" unesite recenicu");
		
		String recenica = ulaz.nextLine();
		System.out.println("recenica je " + JePalindrom(recenica));

	}

}
