public abstract class Person {

    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Person (String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        String text = "Vorname = " + vorname;
        text += "\n\tNachname = " + nachname;
        text += "\n\tAdresse = " + adresse;

        return text;
    }
}
