
public class DrugiZadatakPriprema {

	public static void main(String[] args) {
		String s="c123s015g028t068r002p017h53b10020*cs";
		String izl =dajPodatke(s);
		System.out.println(izl);
	}

	public static String dajPodatke(String s) {
		String izl ="";
		//obradi Temp i mz d odma sve u lower pretvorit
		int iT= s.indexOf('t');
		System.out.println(s.substring(iT+1, iT+4));
		float tt = Float.parseFloat(s.substring(iT+1,iT+4));// razjasni ovo posle, parseFloat pretvara string u brojeve
		float temp = ((tt-32)*5/9);
		
		int iH= s.indexOf('h');
		System.out.println(s.substring(iH+1, iH+3));
		float vlaznost = Float.parseFloat(s.substring(iH+1,iH+3));
		
		int ip= s.indexOf('b');
		System.out.println(s.substring(ip+1,ip+6));
		float pritisak = Float.parseFloat(s.substring(ip+1,ip+6))*0.1f;
		
		izl = String.format("{\"temp\": %.1f,\"vlaznost\": %.1f %%, \"pritisak\":%.1f}",temp,vlaznost,pritisak);
		return izl;
		
	}
}
