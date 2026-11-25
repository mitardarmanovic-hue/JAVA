
public class Televizor {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	public int getBrojKanala() {
		return brojKanala;
	}
	public void setBrojKanala(int brojKanala) {
		if(brojKanala < 1) {
			this.brojKanala =1;
		}else {
			this.brojKanala = brojKanala;
		}
	}
	public String getNazivKanala() {
		return nazivKanala;
	}
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	public int getJacinaTona() {
		return jacinaTona;
	}
	public void setJacinaTona(int jacinaTona) {
		if(jacinaTona < 1 || jacinaTona > 10) {
			this.jacinaTona = 1;
		}else {
			this.jacinaTona = jacinaTona;
		}
	}
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		super();
		this.setBrojKanala(brojKanala);
		this.setNazivKanala(nazivKanala);
		this.setJacinaTona(jacinaTona);
	}
	

	public void pojacajTon() {
		if(getJacinaTona() <10) {
			setJacinaTona(getJacinaTona()+1);
		}else if(getJacinaTona() == 10) {
			System.out.println("PREGLASNO JEEEEEE");
		}
		
	}
	@Override
	public String toString() {
		return "Televizor [brojKanala=" + brojKanala + ", nazivKanala=" + nazivKanala + ", jacinaTona=" + jacinaTona
				+ "]";
	}
	
}
