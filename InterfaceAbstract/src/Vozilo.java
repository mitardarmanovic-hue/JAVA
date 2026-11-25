public abstract class Vozilo {


private String id;
private int maxBrzina;

public Vozilo(String id, int maxBrzina) {

    this.id = id;

    this.maxBrzina = maxBrzina;

}

public Vozilo() {

    this("", 0);

}

public String getId() {

    return id;

}

public void setId(String id) {

    this.id = id;

}

public int getMaxBrzina() {

    return maxBrzina;

}

public void setMaxBrzina(int maxBrzina) {

    this.maxBrzina = maxBrzina;

}

public abstract double izracunajVrijemeDostave(double udaljenost);

public void info() {

    System.out.println("Vozilo [id=" + id + ", maxBrzina=" + maxBrzina + "]");

}

}
