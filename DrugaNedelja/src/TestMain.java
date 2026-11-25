import java.util.ArrayList;

	public static void main(String[] args) {

		ArrayList<Auto> niz = new ArrayList<>();
		niz.add(new Auto("BMW",2016,150,false,85,false));
		niz.add(new Auto("OPEL",1990,186,false,85,true));
		niz.add(new Auto("AUDI",2000,56,true,115,true));
		niz.add(new Auto("BMW",1986,226,false,285,false));
		niz.add(new Auto("BMW",2020,106,true,185,true));

		System.out.println(Auto.trebaReg(niz));
		System.out.println(Auto.iznosReg(niz));
	}


