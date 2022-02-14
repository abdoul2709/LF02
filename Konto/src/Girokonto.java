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
        if (zinsKredit - betrag >= 0 - getZinsGuthaben() ) {

        }
        return true;
    }
    @Override
    public String toString() {
        String text = "Zinskredit = " + getZinsKredit();

        return text;
    }
}
