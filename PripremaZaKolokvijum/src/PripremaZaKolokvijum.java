import java.util.Scanner;

public class PripremaZaKolokvijum {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj veci od nule");
		int n = ulaz.nextInt();
		String trougao ="";
		for(int i = 0;i<n;i++) {
			trougao = trougao + "*";
			System.out.println(trougao);
		}
			//for(int i = 0;i<n;i++) {
			//trougao = trougao +"*";
		}
			
		}
	

