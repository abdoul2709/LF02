public abstract class Konto {

    private Kunde inaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inaber, double kreditLimit, double zinsGuthaben) {
        this.inaber = inaber;
        this.kontoStand = 0;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;

    }

    public Kunde getInaber() {
        return inaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public boolean einzahlen(double betrag) {
        kontoStand += betrag;
        return false;
    }

    public boolean auszahlen(double betrag) {
        if (kontoStand - betrag >= 0 - kreditLimit) {

            return true;
        }
        else {
            return false;
        }
    }

    @Override
        public String toString() {
            String text = "\n[Inaber]" + inaber;
            text += "\n\nKontostand: " + getKontoStand();
            text += "\nKreditlimit: " + getKreditLimit();
            text += "\nZinsguthaben: " + zinsGuthaben + "\n";

            return text;
        }
    }