package schritt4;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        //MANNSCHAFT1

        Torwart torwart1 = new Torwart("Ahmed", 36, 2, 10, 10);

        schritt1.Trainer trainer1 = new schritt1.Trainer("Abdoul", 21, 10);

        ArrayList spielerlisteGroeplingen = new ArrayList<>();

        schritt1.Spieler spieler1 = new schritt1.Spieler("Karim", 40, 50, 10, 10, 10);

        spielerlisteGroeplingen.add(spieler1);

         spieler1 = new schritt1.Spieler("Chris", 23, 25, 10, 8, 10);

        spielerlisteGroeplingen.add(spieler1);

         Mannschaft mannschaftGroepelingen = new Mannschaft("mannschaftGroepelingen", trainer1, torwart1,spielerlisteGroeplingen);


        System.out.println(mannschaftGroepelingen);

    //MANNSCHAFT2


        Torwart torwart2 = new Torwart("Ubaida", 25, 15, 2, 10);

        schritt1.Trainer trainer2 = new Trainer("Lucas", 35, 10);

        ArrayList spielerlisteWerder = new ArrayList<>();

        schritt1.Spieler spieler2 = new schritt1.Spieler("Mika", 18, 20, 5, 5, 3);

        spielerlisteWerder.add(spieler2);

        spieler2 = new Spieler("Aaron", 21, 19, 10, 4, 10);

        spielerlisteWerder.add(spieler2);

        Mannschaft mannschaftWerder  = new Mannschaft("mannschaftWerder", trainer2, torwart2,spielerlisteWerder);


        System.out.println(mannschaftWerder);


        }
    }