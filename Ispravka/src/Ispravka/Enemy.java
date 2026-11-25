package Ispravka;

public class Enemy {

	private int x;
	private int y;
	private int sirina;
	private int visina;
	private String ime;
	
	public Enemy (int x, int y, int sirina, int visina, String ime) {
		this.ime= ime;
		this.sirina= sirina;
		this.visina= visina;
		this.x=x;
		this.y=y;
		
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
		this.y = y;
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
		this.ime = ime;
	}

}
