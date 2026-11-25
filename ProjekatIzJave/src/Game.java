import java.util.ArrayList;

public class Game {


public void findByType(String s,ArrayList<Enemy> enemy ) {
	boolean pronadjen = false;
	for(Enemy x:enemy) {
		if(x.getTip().contains(s)) {
			System.out.println(x);
			pronadjen = true;
		}
	}
	if(!pronadjen) {
		System.out.println("Nema poklapanja");
	}
}

public static void dodajEnemy(ArrayList<Enemy> niz, Enemy e) {
    niz.add(e);
    dodajDogadjaj("Protivnik " + e.getTip() + " je usao u igru");
}

static ArrayList<String> eventLog = new ArrayList<>();

public boolean checkCollision(Player a, Enemy b) {
    if (a.getX() + a.getWidth() > b.getX() && a.getX() < b.getX() + b.getWidth()) {
        if (a.getY() + a.getHeight() > b.getY() && a.getY() < b.getY() + b.getHeight()) {
            return true;
        }
    }
    return false;
}

public static void dodajDogadjaj(String s) {
    eventLog.add(s);
}

public void prikaziEventLog() {
    for (String x : eventLog) {
        System.out.println(x);
    }
}

public static void decreaseHealth(Player a, Enemy b) {
	if(a.getHealth() <= b.getDamage()) {
		a.setHealth(0);
	}else {
		a.setHealth(a.getHealth()-b.getDamage());
	}
	dodajDogadjaj("player " + a.getIme() + " je izgubio " + b.getDamage() + " zivotnih poena i ostao je na " + a.getHealth());
}

public static void main(String[] args) {
	ArrayList<Enemy> enemy = new ArrayList<>();
	Player p1 = new Player("Mitar",2,4,2,4,80);
	Player p2 = new Player("Marija",4,5,1,2,99);
	enemy.add(new Enemy("Svetozar",7,8,2,1,10));
	enemy.add(new Enemy("Goblin",2,6,2,1,20));
	Enemy e3 = new Enemy("java", 68,58,2,1,99);
	dodajEnemy(enemy,e3);
	decreaseHealth(p1,enemy.get(0));
	Game game = new Game();//??????????
	game.prikaziEventLog();
}

}
