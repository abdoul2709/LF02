public class Mitarbeiter extends Person {

    public Mitarbeiter( String vorname, String nachname) {

        super(vorname, nachname);
    }
    @Override
    public String toString() {
        String text = "\nvorname: " + getVorname();
        text += "\nvachname: " + getNachname();

        return text;
    }
}
