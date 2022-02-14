package schritt5;

public class Gameplay {

    private static int spielzeit;
    private static int maxnachspielzeit;
    private static int maxdauerbisaktion;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {

        int mannschaftswert = Math.max(1, mannschaft.getGesamtmotivation() * mannschaft.getGesamtstaerke() * mannschaft.getTrainer().getErfahrung());

        return mannschaftswert;
    }
}


