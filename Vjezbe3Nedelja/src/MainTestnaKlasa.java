import java.util.ArrayList;
public class MainTestnaKlasa {

	public static void main(String[] args) {
		
		ArrayList<Student> Lista = new ArrayList<>();
		
		
		Student S1 = new Student("Mitar","Darmanovic",25057,10,8,9);
		Student S2 = new Student("Marija","Jankovic",25058,10,10,10);
		Student S3 = new Student("Stefan","Bozovic",26032,2,11,7);

		Lista.add(S1);
		Lista.add(S2);
		Lista.add(S3);

		for(Student x: Lista) {
			System.out.println(x);// implicitno poziva toString metodu 
		}
		
	//	System.out.println(S3);
		//S1.ProsjekStudenta();
	
		

	}

}
