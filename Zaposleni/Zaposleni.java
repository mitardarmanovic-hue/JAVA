package Zaposleni;

public class Zaposleni {
	
	private String Ime;
	private String Prezime;
	private int GodineStaza;
	private double Plata;
	
	public Zaposleni (String Ime, String Prezime, int GodineStaza,double Plata) {
		this.Ime = Ime;
		this.Prezime = Prezime;
		this.Plata = Plata;
		this.GodineStaza = GodineStaza;		
		
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public int getGodineStaza() {
		return GodineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		if(this.GodineStaza < 0) {
			System.out.println(" Lazes");
			this.GodineStaza = 0;
		}else {
			this.GodineStaza= this.GodineStaza;
			
		}

	}

	public double getPlata() {
		return Plata;
	}

	public void setPlata(double plata) {
		Plata = plata;
	}

public void ispisi() {
	System.out.printf(  this.Ime + this.Prezime + this.GodineStaza + this.Plata);

}
	public void ProvjeraPlate() {
		if(this.Plata < 800 && GodineStaza >= 1) {
			this.Plata = this.Plata + this.Plata* 0.6;
			System.out.println("Vasa plata je bila ispod 800 samim tim je povecana za 6 posto i iznosi" + this.Plata);
		}else 
			System.out.println("Vasa plata je preko 800 i nece biti povecana");
	}
}

