import java.util.Scanner;

public class PrviZadatakKolokvijum {


public static String dajPodatke(String s) {

    String rez = "";

    int indexT = s.indexOf('t');
    float temp = Float.parseFloat(s.substring(indexT + 1, indexT + 4));
    float Temp = (temp - 32) * 5 / 9;

    int indexh = s.indexOf('h');
    float vlazn = Float.parseFloat(s.substring(indexh + 1, indexh + 3));

    int indexB = s.indexOf('b');
    float pritisak = Float.parseFloat(s.substring(indexB + 1, indexB + 6));
    return rez = "temp " + Temp + " vlaznost " + vlazn + " pritisak " + pritisak;
}

public static void main(String[] args) {

    /*
    (10 poena) Napisati program koji od korisnika traži unos cijelog broja N.
    Program treba da, koristeći karakter zvjezdica ('*'), nacrta jednakokraki
    pravougli trougao dužine katete N zvjezdica.
    */

    Scanner ulaz = new Scanner(System.in);

    System.out.println("unesite broj veci od nule");
    int n = ulaz.nextInt();

    String s = "*";

    for (int i = 0; i < n; i++) {
        s = "*".repeat(n - i);
        System.out.println(s);
    }

    ulaz.nextLine();

    System.out.println("unesite string");
    String k = ulaz.nextLine();

    System.out.println(PrviZadatakKolokvijum.dajPodatke(k));
}


}
