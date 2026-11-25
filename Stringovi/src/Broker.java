import java.util.Scanner;

public class Broker {
	
//	Napisati program koji za unijeti string provjerava da li je broker u plusu ili minus
	//nakon trgovine akcijama. Prefiks stringa sadrzi S kada je odradjena prodaja, a B kada
	//je odradjena kupovina akcija.
//	Ulaz: a = “S50 S40 B50 B100”; 
	
	
	public static int plusMinusBrokera(String s) {
		String[] niz =s.split(" ");
		int sumaS= 0;
		int sumaB= 0;
		for(int i = 0;i<niz.length;i++) {
			if(niz[i].startsWith("S")) {
				int x =Integer.parseInt(niz[i].substring(1));// u int ubacam brojeve posle slova s
				sumaS= sumaS + x;
			}else {
				int y =Integer.parseInt(niz[i].substring(1));
				sumaB = sumaB + y;
			}
			
		}
		int rez = sumaS - sumaB;
		return rez;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi String za brokerske transakcije");
		String s = ulaz.nextLine();
		System.out.println(plusMinusBrokera(s));
		
	}

}
