package com.udg.edu.me;
import java.time.LocalDate;
import java.util.ArrayList;

public class VoziloTest {

	public static void main(String[] args) {
		
		LocalDate Date =  LocalDate.now();
		System.out.println(Date);
		
		Automobil.setOsnovicaZaRegistraciju((float)1.5);

		Automobil BMW = new Automobil("BMW","E46",1500,2002,4,5);
		
		//System.out.println(BMW);
		//System.out.println(BMW.CijenaRegistracije());
		
		ArrayList <Vozilo> VozniPark = new ArrayList <Vozilo>();
		
		VozniPark.add(new Automobil("BMW","E46",1500,2002,4,5));
		VozniPark.add (new Automobil("mitshubishi","outlander", 2000,2010,4,5));
		VozniPark.add (new Motocikl("Suzuki","XXXX",3000,2020,0));
		VozniPark.add (new Kamion("MAN","999", 6000,2016,10));
		
		float UkupnaCijena = 0;
		for(Vozilo a: VozniPark)
			UkupnaCijena += a.CijenaRegistracije();
			System.out.printf("UKupno za registraciju %.2f EUR", UkupnaCijena);
	
	}

}
