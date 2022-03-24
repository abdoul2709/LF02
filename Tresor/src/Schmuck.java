public class Schmuck  {
    private String bezeichnung;
    public  Schmuck (String bezeichnung) {
        this.bezeichnung = bezeichnung;

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    @Override
    public String toString() {
        String text = "Bezeichnung = " + bezeichnung;

        return text;
    }
}
