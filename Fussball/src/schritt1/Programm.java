package schritt1;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Abdoul", 21, 10);


        System.out.println(trainer);

        Spieler spieler = new Spieler("Karim", 40, 50, 10, 10, 10);


        System.out.println(spieler);

        Torwart torwart = new Torwart("Ahmed", 36, 2, 10, 10);

        System.out.println(torwart);

        }
    }


