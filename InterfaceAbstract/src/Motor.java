public class Motor extends Vozilo implements Ekonomicnost {

private static final double POTROSNJA_PO_KM = 0.04;

public Motor(String id, int maxBrzina) {
    super(id, maxBrzina);
}

@Override
public double potrosnjaPoKm() {
    return POTROSNJA_PO_KM;
}

@Override
public double izracunajVrijemeDostave(double udaljenost) {
    if (getMaxBrzina() <= 0) {
        return 0;
    }

    return udaljenost / getMaxBrzina();
}


}
