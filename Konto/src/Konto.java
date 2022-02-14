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

    public void einzahlen(double betrag) {
        kontoStand += betrag;
    }

    public boolean auszahlen(double betrag) {
        if (kontoStand - betrag >= 0 - kreditLimit) {

        }
        return true;
    }

    @Override
        public String toString() {
            String text = "Inaber = " + inaber;
            text += "\n\tKontostand = " + getKontoStand();
            text += "\n\tKreditlimit = " + getKreditLimit();
            text += "\nZinsguthaben = " + zinsGuthaben;

            return text;
        }
    }