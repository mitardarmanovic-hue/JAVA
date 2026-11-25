public class Player {

private String ime;
private int x;
private int y;
private int width;
private int height;
private int health;

public Player(String ime, int x, int y, int width, int height, int health) {
	this.setIme(ime);
	this.setX(x);
	this.setY(y);
	this.setWidth(width);
	this.setHeight(height);
	this.setHealth(health);
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	if(ime == null || ime.trim().equals("")) {
		System.out.println("Ime ne smije biti prazno");
	}else if(ime.trim().charAt(0) < 'A' || ime.trim().charAt(0) > 'Z') {
		System.out.println("Prvo slovo mora biti veliko");
	}else {
		this.ime.replace("  "," ");
		this.ime = ime.trim();
	}
	for(int i = 0;i< ime.length();i++ ) {
		if(ime.charAt(i)== " ") {
			ime.charAt(i+1)
		}
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

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	if(health<0 || health>100) {
		this.health = 1;// ako si probao da ga napravis vise od 100 kazna bice 1, ono ne budi taj lik brt
	}else {
		this.health = health;
	}
}

@Override
public String toString() {
	return "Player [ime=" + ime + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", health="
			+ health + "]";
}


}
