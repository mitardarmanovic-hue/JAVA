import java.util.ArrayList;

public class Trecizadaatak {
	private String nazivStanice;
	private String datumOpazanja;
	private int temp;
	private int vlaznostVazduha;
	private int vazdusniPritisak;
	public String getNazivStanice() {
		return nazivStanice;
	}
	public void setNazivStanice(String nazivStanice) {
		this.nazivStanice = nazivStanice;
	}
	public String getDatumOpazanja() {
		return datumOpazanja;
	}
	public void setDatumOpazanja(String datumOpazanja) {
		this.datumOpazanja = datumOpazanja;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getVlaznostVazduha() {
		return vlaznostVazduha;
	}
	public void setVlaznostVazduha(int vlaznostVazduha) {
		this.vlaznostVazduha = vlaznostVazduha;
	}
	public int getVazdusniPritisak() {
		return vazdusniPritisak;
	}
	public void setVazdusniPritisak(int vazdusniPritisak) {
		this.vazdusniPritisak = vazdusniPritisak;
	}
	public Trecizadaatak(String nazivStanice, String datumOpazanja, int temp, int vlaznostVazduha,
			int vazdusniPritisak) {
		super();
		this.nazivStanice = nazivStanice;
		this.datumOpazanja = datumOpazanja;
		this.temp = temp;
		this.vlaznostVazduha = vlaznostVazduha;
		this.vazdusniPritisak = vazdusniPritisak;
	}
	public Trecizadaatak() {
		this(null,null,0,0,0);
	}
	
	
	
	public static ArrayList <Trecizadaatak> izdvojiPodatke(String s, ArrayList<Trecizadaatak> niz) {
		ArrayList<Trecizadaatak> lista = new ArrayList<Trecizadaatak>();
		for(Trecizadaatak x:niz) {
			if(x.getNazivStanice().equals(s)) {
				lista.add(x);
			}
		}
		return lista;
	}
	/*statičku metodu koja iz niza meteo podataka određuje maksimalnu dnevnu temperaturu za
	specificirani dan i mjernu stanicu (argumenti metode).*/
	public static int najvecaTemp (ArrayList<Trecizadaatak> niz, String datum) {
		int maxTemp = 0;
		for(Trecizadaatak x:niz) {
			if(x.getTemp()> maxTemp && x.getDatumOpazanja().contains(datum)) {
				maxTemp = x.getTemp();
			}
		}
		return maxTemp;
	}
	@Override
	public String toString() {
		return "Trecizadaatak [nazivStanice=" + nazivStanice + ", datumOpazanja=" + datumOpazanja + ", temp=" + temp
				+ ", vlaznostVazduha=" + vlaznostVazduha + ", vazdusniPritisak=" + vazdusniPritisak + "]";
	}
	
}
