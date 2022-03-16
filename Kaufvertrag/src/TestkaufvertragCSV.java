import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestkaufvertragCSV {
    public static void main(String[] args) throws IOException {
        String Kaufvertrag = "Kaufvertrag/Verkaufvertrag.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(Kaufvertrag));

        String zeile;
        while ((zeile = bufferedReader.readLine()) != null) {
            String str = zeile;

            String[] strArray = str.split(";");

            System.out.println(Arrays.toString((strArray)));
        }
    }
}