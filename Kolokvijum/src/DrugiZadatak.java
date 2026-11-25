import java.util.Scanner;

public class DrugiZadatak {
	
	public static String konvertujVrijeme(String vrijeme,String format,String zeljeniFormat) {
		String rez ="";
		String[] Vrijeme = vrijeme.split(":");
		int indexMinuta = zeljeniFormat.indexOf("M");
		int indexSata = zeljeniFormat.indexOf("H");
		int indexSekunde = zeljeniFormat.indexOf("S");
		if(zeljeniFormat.contains("M")) {	
			rez = zeljeniFormat.replace("M",Vrijeme[1]);
		} 
		if(zeljeniFormat.contains("H")) {
		rez =zeljeniFormat.replace("H",Vrijeme[0] );
		}
		if(zeljeniFormat.contains("S")){
			rez =zeljeniFormat.replace("S",Vrijeme[2]);
			
		}
		return rez;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrijeme");
		String vrijeme = ulaz.nextLine();
		System.out.println("unesite zeljeni format");
		String format = ulaz.nextLine();
		System.out.println("unesite format u koji konvertujemo vase vrijeme");
		String zeljeniFormat = ulaz.nextLine();
		System.out.println(konvertujVrijeme(vrijeme,format,zeljeniFormat));
	}

}
