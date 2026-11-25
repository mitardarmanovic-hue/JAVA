import java.util.Scanner;

public class MetodeSaStringovima {
	
	/*Napisati program koji za unijeti string s (karakteri stringa cifre od 0 do 9) enkriptuje na
	sledeći način: ako je karakter paran broj pretvara se u 0, a ako je karakter neparan broj
	pretvara se u 1. Npr. za s = ‘15023’ rezultat je 11001*/
	public static String enkriptovanje (String s) {
		StringBuilder rez = new StringBuilder();

		for(int i = 0; i < s.length(); i++) {
		    int a = s.charAt(i) - '0'; // Pretvaramo karakter u int
		    if(a % 2 == 0) {
		        rez.append("0");
		    } else {
		        rez.append("1");
		    }

		}

		return rez.toString();

		
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite broj");
		int n = ulaz.nextInt();
		String g="*";
		for(int i =0;i < n;i++) {
			System.out.println(g);
			g=g+"*";
		}
		

		
		System.out.println("Unesite String");
		String s = ulaz.nextLine();
		s=s.trim();
		int brRijeci = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				brRijeci++;
			}
		}
		System.out.println("broj rijeci je " + brRijeci);
		System.out.println();
		s.toLowerCase();
		 int brSamoglasnika= 0;
		 int brSuglasnika = 0;
		for(int i = 0; i <s.length();i++) {
			if(s.charAt(i)== 'a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				brSamoglasnika++;
			}else {
				brSuglasnika++;
			}
		}
		System.out.println(enkriptovanje(s));

		System.out.printf("\n Broj suglasnika je %d a samoglasnika %d",brSuglasnika,brSamoglasnika);
		System.out.println();
		s = s.replace(" ", "");
		StringBuilder S = new StringBuilder(s);
		
		System.out.println(S);

		StringBuilder obrnuti = new StringBuilder(S);
		obrnuti.reverse();

		if(S.toString().equals(obrnuti.toString())) {
		System.out.println("Palindrom je");
		} else {
		System.out.println("Nije palindrom");
		}
		
		System.out.println();
		String ponavljajucaSlova = " ";
		for(int i = 0; i< s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				ponavljajucaSlova= ponavljajucaSlova + s.charAt(i);
			}
		}
		System.out.println("Ponavljajuca slova su" + ponavljajucaSlova);
		System.out.println();
		System.out.println("unesite drugi string");

		String s2 = ulaz.nextLine();
		 boolean subString= false;
		 if(s.contains(s2)) {
			 subString=true;
			
		 }
		 System.out.println(subString);
		 if(s.equalsIgnoreCase(s2)) {
			 System.out.println("brao");
		 }
			 System.out.println("nisu isti");
			 StringBuilder SB = new StringBuilder(s2);
			 SB.delete(3,SB.length());
			 System.out.println(SB);
				System.out.println(SB.reverse());
				
		 }
	
 
	
				
			
		
		

	}


