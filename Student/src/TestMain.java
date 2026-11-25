import java.util.ArrayList;
import java.util.Scanner;
/*Kreirati klasu Student koja će kao podatke članove imati: ime, prezime, brojIndeksa, adresu,
brojBodova i polozioIliNe, kao i statičku promjenljivu prolazNaIspitu. Klasa treba da ima
odgovarajuće konstruktore, inspektore i mutatore. Pored ovoga, klasa treba da posjeduje metodu koja na
osnovu vrijednosti statičke promjenljive prolazNaIspitu ažurira atribut polozioIliNe, kao i metode koje
iz niza studenata izdvajaju one koji žive u istoj ulici i one koji su položili ispit. U glavnom programu
testirati pomenutu klasu.*/
public class TestMain {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		Student.setProlazNaIspitu(50);
		
		Student s1 = new Student("Marija","Darmanovic",57,"blok",100);
		Student s2 = new Student("Mitar","Jankovic",57,"blok",51);
		Student s3 = new Student("Ivan","Darmanovic",57,"blok",49);

		ArrayList<Student> niz = new ArrayList<Student>();
		niz.add(s3);
		niz.add(s2);
		niz.add(s1);
		for(Student x : niz) {
			x.polozioIliNe();
			System.out.println(x);
		}
		System.out.println("unesite adresu");
		String s = ulaz.nextLine();
		
			System.out.println(Student.polozili(niz, s));
	}

}
