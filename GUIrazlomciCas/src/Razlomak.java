
public class Razlomak {
	private  int imenilac;
	private int brojilac;
	public Razlomak() throws Exception {
		this(0,1);
	}
	
	public Razlomak(int brojilac, int imenilac) throws Exception {
		super();
		this.setImenilac(imenilac);
		this.setBrojilac(brojilac);
	}
	public int getImenilac() {
		return imenilac;
	}
	public void setImenilac(int imenilac) throws Exception {
		if(imenilac ==  0)
			throw new Exception ("imenilac je 0");
		this.imenilac = imenilac;
	}
	public int getBrojilac() {
		return brojilac;
	}
	public void setBrojilac(int brojilac) {
		this.brojilac = brojilac;
	}

	@Override
	public String toString() {
		if(this.getBrojilac()>= 0 && this.getImenilac() >= 0) 
			return String.format("%d/%d", this.getBrojilac(),this.getImenilac());	
			
		if(this.getBrojilac()< 0 && this.getImenilac() >= 0) 
			return String.format("%d/%d", this.getBrojilac(),this.getImenilac());
			
			if(this.getBrojilac()>= 0 && this.getImenilac() >= 0) 
				return String.format("%d/%d", this.getBrojilac(),this.getImenilac());
				
				if(this.getBrojilac()>= 0 && this.getImenilac() <= 0) 
					return String.format("%d/%d", this.getBrojilac(),-this.getImenilac());
				
					if(this.getBrojilac()>= 0 && this.getImenilac() >= 0) 
						return String.format("%d/%d", this.getBrojilac(),this.getImenilac());
					
						return String.format("%d/%d", -this.getBrojilac(),-this.getImenilac());
	}
	public static Razlomak Saberi(Razlomak a, Razlomak b) throws Exception {
		Razlomak r = new Razlomak(a.getBrojilac()* b.getImenilac()
				+a.getImenilac()*b.getBrojilac(), a.getImenilac()*b.getBrojilac());
		r.Skrati();
		return r;
	}
	public static Razlomak oduzmi (Razlomak a, Razlomak b) throws Exception {
		Razlomak r = new Razlomak(a.getBrojilac()* b.getImenilac()
				-a.getImenilac()*b.getBrojilac(), a.getImenilac()*b.getBrojilac());
		r.Skrati();
		return r;
	}
	public static Razlomak Dijeli (Razlomak a, Razlomak b) throws Exception {
		Razlomak r = new Razlomak(a.getBrojilac()* b.getImenilac(),a.getImenilac()*b.getBrojilac());	
		r.Skrati();
		return r;
	}
	public static Razlomak Pomnozi (Razlomak a, Razlomak b) throws Exception {
		Razlomak r = new Razlomak(a.getBrojilac()* b.getBrojilac(),a.getImenilac()*b.getImenilac());	
		r.Skrati();
		return r;
	}
				
public void Skrati() {
	for(int i= 2;i <= Math.min(Math.abs(this.getImenilac()), Math.abs(this.getBrojilac()));i++) {
		while(this.getBrojilac() % i== 0 && this.getImenilac()% i==0) {
			this.imenilac /= i;
			this.brojilac /=i;
			
		}
	}
}
}




