import java.util.ArrayList;

public class MeteoPodatak {

	private String nazivMjerneStanice;
	private String datumVrijemeOcitavanja;
	private float temperatura;
	private float vlaznostVazduha;
	private float pritisak;
	
	
	public MeteoPodatak(String nazivMjerneStanice, String datumVrijemeOcitavanja, float temperatura,
			float vlaznostVazduha, float pritisak) {
		super();
		this.setNazivMjerneStanice(nazivMjerneStanice);
		this.setDatumVrijemeOcitavanja(datumVrijemeOcitavanja);
		this.setTemperatura(temperatura);
		this.setVlaznostVazduha(vlaznostVazduha);
		this.setPritisak(pritisak);
	}
	public MeteoPodatak() {
		this(null,null,0,0,0);
	}
	
	public String getNazivMjerneStanice() {
		return nazivMjerneStanice;
	}
	public void setNazivMjerneStanice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}
	public String getDatumVrijemeOcitavanja() {
		return datumVrijemeOcitavanja;
	}
	public void setDatumVrijemeOcitavanja(String datumVrijemeOcitavanja) {
		this.datumVrijemeOcitavanja = datumVrijemeOcitavanja;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getVlaznostVazduha() {
		return vlaznostVazduha;
	}
	public void setVlaznostVazduha(float vlaznostVazduha) {
		this.vlaznostVazduha = vlaznostVazduha;
	}
	public float getPritisak() {
		return pritisak;
	}
	public void setPritisak(float pritisak) {
		this.pritisak = pritisak;
	}
	@Override
	public String toString() {
		return "MeteoPodatak [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVrijemeOcitavanja="
				+ datumVrijemeOcitavanja + ", temperatura=" + temperatura + ", vlaznostVazduha=" + vlaznostVazduha
				+ ", pritisak=" + pritisak + "]";
	}
	public  static ArrayList<MeteoPodatak> izdvojPodatkeStanice(ArrayList<MeteoPodatak> niz, String nazivStanice){
		ArrayList<MeteoPodatak> izdvojeno = new ArrayList<MeteoPodatak>();
		
		for(MeteoPodatak x :niz) {
			if(x.getNazivMjerneStanice().equals(nazivStanice)) {
				izdvojeno.add(x);
			}
		}return izdvojeno;
	}

	public  static float odrediMaksTempDan(ArrayList<MeteoPodatak> niz, String datum,String nazivStanice){
		
		float maxTemp = 0;
		ArrayList<MeteoPodatak> izdvojeno = new ArrayList<MeteoPodatak>();
		
		for(MeteoPodatak x :niz) {
			if(x.getNazivMjerneStanice().equals(nazivStanice)&& x.getDatumVrijemeOcitavanja().startsWith(datum)) {
				izdvojeno.add(x);
			}
			maxTemp = izdvojeno.get(0).getTemperatura();
			for(MeteoPodatak n:izdvojeno) {
				if(n.getTemperatura() > maxTemp) {
					maxTemp = n.getTemperatura();
				}
			}
		}
		return maxTemp;
	}

	
}
