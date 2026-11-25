public class Biciklo extends Vozilo implements Ekonomicnost {


private static final float FaktorBrzine = 0.5f;

public Biciklo(String id, int maxBrzina) {
    super(id, maxBrzina);
}

@Override
public double potrosnjaPoKm() {
    return 0;
}

@Override
public double izracunajVrijemeDostave(double udaljenost) {
    if (getMaxBrzina() <= 0) {
        return 0;
    }

    return udaljenost / (getMaxBrzina() * FaktorBrzine);
}


}
