import java.util.ArrayList;

public class Auto {

	private String markaAuta;
	private int godAuta;
	private int snagaMotora;
	private boolean prodato;
	private int kubikaza;
	private boolean registrovan;
	
	public static int getBrProdatih() {
		return brProdatih;
	}
	private static int brProdatih;
	
	public Auto(String markaAuta, int godAuta, int snagaMotora, boolean prodato, int kubikaza, boolean registrovan) {
		
		this.setMarkaAuta(markaAuta);
		this.setGodAuta(godAuta);
		this.setSnagaMotora(snagaMotora);
		this.setProdato(prodato);
		this.setKubikaza(kubikaza);
		this.setRegistrovan(registrovan);
	}
	public Auto() {
		this(null,0,0,false,0,false);
	}
	public String getMarkaAuta() {
		return markaAuta;
	}
	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}
	public int getGodAuta() {
		return godAuta;
	}
	public void setGodAuta(int godAuta) {
		this.godAuta = godAuta;
	}
	public int getSnagaMotora() {
		return snagaMotora;
	}
	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public boolean isProdato() {
		if(this.isProdato()== true) {
			brProdatih++;
		}
		return prodato;
	}
	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public boolean isRegistrovan() {
		return registrovan;
	}
	public void setRegistrovan(boolean registrovan) {
		if(this.getGodAuta()<1985) {
			registrovan = false;
			}else {
				this.registrovan = registrovan;
			}
		}
	@Override
	public String toString() {
		return "Auto markaAuta=" + markaAuta + ", godAuta=" + godAuta + ", snagaMotora=" + snagaMotora + ", prodato="
				+ prodato + ", kubikaza=" + kubikaza + ", registrovan=" + registrovan ;
	}
	//Kreirati statičku metodu klase koja vraće listu auta koja se mogu registrovati a koja nijesu registrovana.
	public static ArrayList<Auto> trebaReg(ArrayList<Auto> x){
		ArrayList<Auto> niz = new ArrayList<Auto>();
		for(Auto a : x) {
			if(a.isRegistrovan() == false && a.getGodAuta()> 1985) {
				niz.add(a); 
			}
			
		}
		return niz;
	}
	/*  Kreirati i statički
atribut klase koji prati koliko ima prodatih auta.
*/
	
	public static float iznosReg (ArrayList<Auto> x) {
		float rez = 0;
		for(Auto a:x) {
				if(a.getGodAuta()>1985 && a.getGodAuta()< 2000) {
					rez=a.getKubikaza()* a.getSnagaMotora()*3;
				}else if(a.getGodAuta()>2001 && a.getGodAuta()<2010) {
					rez=a.getKubikaza()* a.getSnagaMotora()*2;
				}else {
					rez=(float)(a.getKubikaza()* a.getSnagaMotora()*1.5);
				}
			}
		return rez;
	}
	
	
	
	}
