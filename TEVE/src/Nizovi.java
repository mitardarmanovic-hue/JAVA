import java.util.Scanner;

public class Nizovi {

	
	public static double someBS(double[] niz) {
		double br= 0;
		double rez =0;
		double suma =0;
		for(int i = 0; i< niz.length;i++) {
			if(niz[i] % 2 ==0 && niz[i]> 0) {
				suma++;
				br= niz[i] + br;
			}
		}
		rez = br/suma;
		return rez;
	}

public static void printaNiz(double[] niz) {

	for(int i = 0; i< niz.length; i++) {

		System.out.print(niz[i]);

	}

}

public static void promjenaNiza(double[] niz) {

	for(int i = 0;i<niz.length; i++) {

		if(niz[i] % 2 == 0 || niz[i]== 0) {

			niz[i]= -1 * niz[i];

		}else {

			niz[i]= 1.0/niz[i];

		}

	}

}

public static void main(String[] args) {

	Scanner ulaz = new Scanner(System.in);

	int N =ulaz.nextInt();

	double[] niz = new double[N];

	for(int i = 0; i< N; i++) {

		System.out.printf("unesite %d dio niza", i);

		niz[i] = ulaz.nextDouble(); //rendom vrijednosti Math.random *100

	}

	promjenaNiza(niz);
	printaNiz(niz);
	someBS(niz);

}


}
