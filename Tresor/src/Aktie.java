public class Aktie {

    private String unternehmen;
    private double nennwert;

    public Aktie (String unternehmen, double nennwert) {
        this.unternehmen = unternehmen;
        this.nennwert = nennwert;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public double getNennwert() {
        return nennwert;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    @Override
    public String toString() {
        String text = "Unternehmen = " + unternehmen;
        text += "\n\tNennwert = " + nennwert;

        return text;
    }
}
