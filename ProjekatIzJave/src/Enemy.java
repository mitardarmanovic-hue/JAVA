public class Enemy {


/*Kreirati klasu Enemy sa atributima: type (tip neprijatelja, tip String), x, y (pozicija neprijatelja, integer), width, height (dimenzije,
integer), damage (vrijednost napada, integer, između 0 i 100). Naziv tipa neprijatelja ne smije biti prazan, i potrebno je koristiti
metode nad stringovima (trim, toLowerCase, contains...) u okviru kasnijih pretraga.
*/

private String tip;
private int x;
private int y;
private int width;
private int height;
private int damage;

public String getTip() {
	return tip;
}

public void setTip(String tip) {
	if(tip == null || tip.trim().equals("")) {
		this.tip = "uknown";
	}else {
		this.tip = tip.trim();
	}
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

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	if(damage<0 || damage>100) {
		this.damage = 1;
	}else {
		this.damage = damage;
	}
}

public Enemy(String tip, int x, int y, int width, int height, int damage) {
	this.setTip(tip);
	this.setX(x);
	this.setY(y);
	this.setWidth(width);
	this.setHeight(height);
	this.setDamage(damage);
}

@Override
public String toString() {
	return "Enemy [tip=" + tip + " x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", damage="
			+ damage + "]";
}


}
