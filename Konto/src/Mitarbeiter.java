public class Mitarbeiter extends Person {

    public Mitarbeiter( String vorname, String nachname) {

        super(vorname, nachname);
    }
    @Override
    public String toString() {
        String text = "Vorname = " + getVorname();
        text += "\n\tNachname = " + getNachname();

        return text;
    }
}
