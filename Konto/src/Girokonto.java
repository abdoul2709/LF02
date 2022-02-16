public class Girokonto extends Konto {

    private double zinsKredit;

    public Girokonto(Kunde inaber, double zinsGuthaben, double zinsKredit) {

        super(inaber, zinsGuthaben, zinsKredit);

    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean überweisen(double betrag, Girokonto girokonto) {
        if (auszahlen(betrag)) {
            auszahlen(betrag);
            girokonto.einzahlen(betrag);
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Zinskredit: " + getZinsKredit() + "------------------------------------";

    }
}
