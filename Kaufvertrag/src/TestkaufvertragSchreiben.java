import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class TestkaufvertragSchreiben {

    public static void main(String[] args) throws FileNotFoundException {

        Vertragspartner kaeufer = new Vertragspartner("Abdoul", "Conde");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Ueberseetor", "20", "28217", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Ahmed", "Abu");
        verkaeufer.setAusweisNr("987654321");
        verkaeufer.setAdresse(new Adresse("Metta-Sattler-Strasse", "15", "28217", "Bremen"));




        String Verkaufsvertrag = "Kaufvertrag/Verkaufvertrag.csv";
        PrintWriter writer = new PrintWriter(Verkaufsvertrag);
        writer.println("Vertragspartner;" + "Name;" + "Straße;" + "PLZ;" + "Ort;");
        writer.println("Verkäufer;" + verkaeufer.getNachname() + ", " + verkaeufer.getVorname() + ";" + verkaeufer.getAdresse().getStrasse() +" " + verkaeufer.getAdresse().getHausNr() + ";" + verkaeufer.getAdresse().getPlz() + ";" + verkaeufer.getAdresse().getOrt() + ";" );
        writer.println("Käufer;" + kaeufer.getNachname() + ", " + kaeufer.getVorname() + ";" + kaeufer.getAdresse().getStrasse() +" " + kaeufer.getAdresse().getHausNr() + ";" + kaeufer.getAdresse().getPlz() + ";" + kaeufer.getAdresse().getOrt() + ";" );

        writer.close();


    }
}
