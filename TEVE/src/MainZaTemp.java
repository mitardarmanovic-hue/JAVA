import java.util.ArrayList;
import java.util.Scanner;

public class MainZaTemp {

	public static void main(String[] args) {
		
		
		Scanner ulaz = new Scanner(System.in);
		int[] niz = new int[5];
		ArrayList<Integer> nizTemp = new ArrayList<>();

		for(int i = 0; i < 5; i++) {
		    System.out.printf("Unesi %d. dio niza: ",i);
		    nizTemp.add(ulaz.nextInt());
		}
		
		EvidencijaTemp AtributNiz = new EvidencijaTemp(nizTemp);
		
		System.out.println(AtributNiz);
		AtributNiz.makne(2);
		AtributNiz.prosjek();
		
	}

	//double prosjecnaTemperatura(double[] niz) – računa prosjek. 
	// double maksimalnaTemperatura(double[] niz) – pronalazi maksimalnu vrijednost.
}
