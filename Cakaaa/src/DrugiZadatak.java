import java.util.Scanner;

public class DrugiZadatak {
	
	public static int BrojiMuke(String s) {
		int rez = 0;
		String[] rijeci = s.split(" ");
		for(int i = 0; i< rijeci.length;i++) {
			String vrijednost = rijeci[i].substring(1);//i-ta od karaktera na poziciji i pa na dalje string
			if(rijeci[i].startsWith("S")){
				rez += Integer.parseInt(vrijednost);
			}else {
				rez-= Integer.parseInt(vrijednost);
			}
		}

		return rez;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite recenicu");
		
		String recenica = ulaz.nextLine();
		System.out.println(BrojiMuke(recenica));

	}

}
