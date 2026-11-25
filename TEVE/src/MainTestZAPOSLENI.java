
public class MainTestZAPOSLENI {

	public static void main(String[] args) {
		
		Zaposleni Z1 = new Zaposleni("Mitar" ,"Darmanovic", 12,750);
		Zaposleni Z2 = new Zaposleni("Dimitrije" ,"Jankovic", 32,850);
		Zaposleni Z3 = new Zaposleni("Marko" ,"Ivanovic", 15,799);

		Z1.provjeraPlate();
		System.out.println(Z1);
	}

}
