import java.util.ArrayList;

public class KompleksniBroj {
	/*Kreirati klasu kojom se modeluju kompleksni brojevi. Klasa treba da posjeduje odgovarajuće
konstruktore, mutatore, inspektore, kao i metode koje će omogućavati osnovne operacije sa
kompleksnim brojevima. Kreirati testnu klasu u čijoj funkciji main ćete demonstrirati upotrebu metoda
prethodne klase, kao i učitati niz kompleksnih brojeva i odrediti maksimalni elemenat u datom nizu.
Kompleksne brojeve porediti po modulu.*/
	private double realniDio;
	private double imaginarniDio;
	
	
	public KompleksniBroj(double realniDio, double imaginarniDio) {
	
		this.setRealniDio(realniDio);
		this.setImaginarniDio(imaginarniDio);
	}
	public KompleksniBroj() {
		this(0,0);
	}
	public double getRealniDio() {
		return realniDio;
	}
	public void setRealniDio(double realniDio) {
		this.realniDio = realniDio;
	}
	public double getImaginarniDio() {
		return imaginarniDio;
	}
	public void setImaginarniDio(double imaginarniDio) {
		this.imaginarniDio = imaginarniDio;
	}
	public KompleksniBroj saberi(KompleksniBroj x){
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.setRealniDio(realniDio + x.realniDio);
		
		rezultat.setImaginarniDio(imaginarniDio + x.imaginarniDio);
		return rezultat;
	}
	public KompleksniBroj oduzmi(KompleksniBroj x) {
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.setImaginarniDio(imaginarniDio - x.imaginarniDio);
		rezultat.setRealniDio(realniDio - x.realniDio);

		return rezultat;
		
	}
	public KompleksniBroj pomnozi(KompleksniBroj x){
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.setRealniDio(realniDio * x.realniDio - imaginarniDio*x.imaginarniDio);
		rezultat.setImaginarniDio(imaginarniDio*x.realniDio +realniDio*
		x.imaginarniDio);
		return rezultat;
}
	public double modul() {
		double rez = Math.sqrt(imaginarniDio*imaginarniDio + realniDio * realniDio);
		return rez;
	}
	@Override
	public String toString() {
		return "KompleksniBroj " + getRealniDio() + "+" + getImaginarniDio() +"i";
	}
	
	public static KompleksniBroj provjeraVelicine(ArrayList<KompleksniBroj> lista) {
		KompleksniBroj max = new KompleksniBroj(0,0);
		for(KompleksniBroj x:lista) {
			if(max.modul()< x.modul()) {
				max = x;
			}
		}
		return max ;
		}
	}

