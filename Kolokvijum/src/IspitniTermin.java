import java.util.ArrayList;

public class IspitniTermin {
	
	private String nazivPredmeta;
	private String sifraTermina;
	private String datumVrijemeTrajanja;
	private String oznakaSale;
	private int brPrijavljenihStudenata;
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getSifraTermina() {
		return sifraTermina;
	}
	public void setSifraTermina(String sifraTermina) {
		this.sifraTermina = sifraTermina;
	}
	public String getDatumVrijemeTrajanja() {
		return datumVrijemeTrajanja;
	}
	public void setDatumVrijemeTrajanja(String datumVrijemeTrajanja) {
		this.datumVrijemeTrajanja = datumVrijemeTrajanja;
	}
	public String getOznakaSale() {
		return oznakaSale;
	}
	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}
	public int getBrPrijavljenihStudenata() {
		return brPrijavljenihStudenata;
	}
	public void setBrPrijavljenihStudenata(int brPrijavljenihStudenata) {
		this.brPrijavljenihStudenata = brPrijavljenihStudenata;
	}
	public IspitniTermin(String nazivPredmeta, String sifraTermina, String datumVrijemeTrajanja, String oznakaSale,
			int brPrijavljenihStudenata) {
		
		this.nazivPredmeta = nazivPredmeta;
		this.sifraTermina = sifraTermina;
		this.datumVrijemeTrajanja = datumVrijemeTrajanja;
		this.oznakaSale = oznakaSale;
		this.brPrijavljenihStudenata = brPrijavljenihStudenata;
	}
	public IspitniTermin() {
		this(null,null,null,null,0);
	}
	@Override
	public String toString() {
		return "IspitniTermin [nazivPredmeta=" + nazivPredmeta + ", sifraTermina=" + sifraTermina
				+ ", datumVrijemeTrajanja=" + datumVrijemeTrajanja + ", oznakaSale=" + oznakaSale
				+ ", brPrijavljenihStudenata=" + brPrijavljenihStudenata + "]";
	}
	public static String vracaSaluIspitnu(ArrayList<IspitniTermin> lista,String sifraTermina) {
		String rez="";
		for(IspitniTermin x: lista) {
			if(sifraTermina.equals(x.getSifraTermina()))	{		
			rez = x.getOznakaSale();
			}
			
		}
		return rez;
	}
	

	public static int brojiStudente(String naziv,ArrayList<IspitniTermin> lista) {
		int rez = 0;
		for(IspitniTermin x: lista) {
			if(naziv.equals(x.getNazivPredmeta())) {
				rez = rez + x.getBrPrijavljenihStudenata();
			}
		}
		return rez;
		
	}
}
