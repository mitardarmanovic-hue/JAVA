public class Student {


private String ime;
private String Prezime;
private int brIndeksa;
private int ocjena1;
private int ocjena2;
private int ocjena3;

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public String getPrezime() {
	return Prezime;
}

public void setPrezime(String prezime) {
	Prezime = prezime;
}

public int getBrIndeksa() {
	return brIndeksa;
}

public void setBrIndeksa(int brIndeksa) {
	this.brIndeksa = brIndeksa;
}

public int getOcjena1() {
	return ocjena1;
}

public void setOcjena1(int ocjena1) {
	if(ocjena1 < 5 || ocjena1 > 10) {
		this.ocjena1 = 5;
	}
	else {
		this.ocjena1 = ocjena1;
	}
}

public int getOcjena2() {
	return ocjena2;
}

public void setOcjena2(int ocjena2) {
	if(ocjena2 < 5 || ocjena2 > 10) {
		this.ocjena2 = 5;
	}
	else {
		this.ocjena2 = ocjena2;
	}
}

public int getOcjena3() {
	return ocjena3;
}

public void setOcjena3(int ocjena3) {
	if(ocjena3 < 5 || ocjena3 > 10) {
		this.ocjena3 = 5;
	}
	else {
		this.ocjena3 = ocjena3;
	}
}

public Student(String ime, String prezime, int brIndeksa, int ocjena1, int ocjena2, int ocjena3) {
	this.setIme(ime);
	this.setPrezime(prezime);
	this.setBrIndeksa(brIndeksa);
	this.setOcjena1(ocjena1);
	this.setOcjena2(ocjena2);
	this.setOcjena3(ocjena3);
}
public double ProsjekStudenta() {
	double x = (this.getOcjena1() + this.getOcjena2() + this.getOcjena3()) / 3.0;
	if(x >= 9) {
		return x;
	}else {
		return x;
	}
}

@Override
public String toString() {
	return "Student [ime=" + ime + ", Prezime=" + Prezime + ", brIndeksa=" + brIndeksa + 
			"ProsjekStudenta je "+ ProsjekStudenta();
}


}
