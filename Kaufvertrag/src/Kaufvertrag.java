public class Kaufvertrag {

    private Vertragspartner verkaeufer;
    private Vertragspartner kauefer;
    private Ware ware;
    private String zahlungsModalitaeten;

    public Kaufvertrag (Vertragspartner verkaeufer, Vertragspartner kauefer, Ware ware) {

        this.verkaeufer = verkaeufer;
        this.kauefer = kauefer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKauefer() {
        return kauefer;
    }

    public void setKauefer(Vertragspartner kauefer) {
        this.kauefer = kauefer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }
    @Override
    public String toString() {
        String text = "Verkaeufer = " + verkaeufer;
        text += "\n\tKauefer = " + kauefer;
        text += "\n\tWare = " + ware;
        text += "\n\tZahlungsModalitaeten = " + zahlungsModalitaeten;


        return text;
    }
}
