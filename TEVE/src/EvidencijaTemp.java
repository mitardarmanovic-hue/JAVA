import java.util.ArrayList;


public class EvidencijaTemp {

	
private ArrayList<Integer> nizTemp;

public ArrayList<Integer> getNizTemp() {
	return nizTemp;
}

public void setNizTemp(ArrayList<Integer> nizTemp) {
	this.nizTemp = nizTemp;
}

public EvidencijaTemp(ArrayList<Integer> nizTemp) {
	
	this.setNizTemp(nizTemp);
}

@Override
public String toString() {
	return "EvidencijaTemp [nizTemp=" + nizTemp + "]";
}
public void provjera(Integer x) {
	if(this.getNizTemp().contains(x)) {
		int p=this.getNizTemp().indexOf(x);
		System.out.printf("nalazi se na poziciji %d",p);
	}else {
		System.out.println("te temp nema u nizu");
		
	}
}


public void makne(Integer x) {
	ArrayList<Integer> promjienjeniNiz = new ArrayList<>();
	for(int i =0;i<this.getNizTemp().size();i++) {
		if(this.getNizTemp().get(i).equals(x)) {
			
		}else {
			promjienjeniNiz.add(this.getNizTemp().get(i));
		}
	}
	for(Integer p:promjienjeniNiz) {
		System.out.println(p);
	}
	}
public int prosjek() {
	int suma=0;
	for(int i =0;i<this.getNizTemp().size();i++) {
	suma= suma + this.getNizTemp().get(i);	
	}
	int rez = suma/5;
	return rez;
}

	
}


