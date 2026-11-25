import java.util.Scanner;

public class SomeBS {
//	Napisati program kojim se unose tri cijela broja a, b i c, i koji određuje koliko je pozitivnih, a koliko
	//negativnih brojeva. Nulu računati kao pozitivni broj.
	//Napisati program kojim se učitava prirodan broj N i koji provjerava da li su cifre najmanje i najveće
	//težine toga broja jednake.\
	
	public static boolean provjeraZadnjegNajveceg(int x) {
		int prvi = 0;
		int zadnji = x % 10;
		while(x>0) {
			prvi= x% 10;
			x=x/10;
		}
		if( prvi == zadnji ) {
			return true;
		}else {
			return false;
			
		}
	}
	public static void brojPozNeg(int[] niz) {
		int poz = 0;
		int neg = 0;
		for(int i = 0; i < niz.length;i++) {
			if(niz[i]< 0) {
				neg++;
			}else {
				poz++;
			}
			
		}
		String s = "Niz ima "+ poz + " pozitivnih brojeva i "+ neg +" negativnih brojeva";
		System.out.println(s);
	}
	public static int faktorijel( int n) {
	int fakt = 1;
	while(n>0) {
		fakt = fakt *n;
		n--;
	}
	return fakt;
	}
	public static void main(String[] args) {
		// Napisati program kojim se unose tri cijela broja a, b i c, i koji određuje koji je od ta tri broja najmanji, a
		//koji najveći.

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijeli broj");
		int x = ulaz.nextInt();
		System.out.println("Unesite cijeli broj");
		int y = ulaz.nextInt();
		System.out.println("Unesite cijeli broj");
		int z= ulaz.nextInt();
		
		int[] niz= {x,y,z};
		int najmanji = x;
		int najveci = x;
		for(int i = 0;i< niz.length; i++) {
			if(najmanji > niz[i]) {
	 najmanji = niz[i];
			}else if(najveci< niz[i] ) {
				najveci = niz[i];
			}
		}
		System.out.println(najmanji);
		
		System.out.println(najveci);
		brojPozNeg(niz);
		System.out.println(faktorijel(x));
		System.out.println(provjeraZadnjegNajveceg(y));		
	}

}
