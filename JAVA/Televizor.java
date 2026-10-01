package JAVA;

public class Televizor {

	private int BrojKanala;

	private String NazivKanala;
	private int JacinaTona;

	public Televizor (int BrojKanala, String NazivKanala,int JacinaTona) {

	setBrojKanala(BrojKanala);

	this.NazivKanala=NazivKanala;

	setJacinaTona(JacinaTona);

}

	public int getBrojKanala() {

		return BrojKanala;

	}

	public void setBrojKanala(int brojKanala) {

		if(brojKanala >= 1) {

			this.BrojKanala=brojKanala;

		}else {

			System.out.println("");

		}

	}
	public String getNazivKanala() {

		return NazivKanala;

	}

	public void setNazivKanala(String nazivKanala) {

		NazivKanala = nazivKanala;

	}

	public int getJacinaTona() {

		return JacinaTona;

	}
	public void setJacinaTona(int jacinaTona) {

		if(jacinaTona >=0 && jacinaTona <= 10) {

			this.JacinaTona = jacinaTona;

		}else {

			if(jacinaTona < 0) {

				this.JacinaTona=0;

			}

			if(jacinaTona > 10) {
				this.JacinaTona = 10;
			}
		}
	}

	public void PojacajTon() {
		if(this.JacinaTona <10) {
			this.JacinaTona++;
			System.out.println("Ton je povecan na " +this.JacinaTona);
		}else {
			System.out.println("ton je vec na maksimumu");
		}
	}

	public void ispisi() {
		System.out.println("naziv kanala je "+ this.NazivKanala + "ton je " + this.JacinaTona + "Broj kanala" + this.BrojKanala);
	}
}