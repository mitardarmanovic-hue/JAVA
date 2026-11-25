package Ispravka;

public class Player {

	private int x;
	private int y;
	private int sirina;
	private int visina;
	private String ime;
	
	public Player(int x, int y,int sirina, int visina, String ime) {
		this.ime= ime;
		this.x= x;
		this.y=y;
		this.sirina=sirina;
		this.visina=visina;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(this.y < 0) {
		y=0;
		}else {
		this.y = y;
		}
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if(this.ime == "") {
			System.out.println("morate isputniti ime");
		}else {
			this.ime = ime;
			
		}
			}
	
	
	
	
}
