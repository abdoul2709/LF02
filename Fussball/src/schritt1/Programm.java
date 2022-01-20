package schritt1;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Abdoul", 21, 10);


        System.out.println(trainer.getName());
        System.out.println(trainer.getAlter());
        System.out.println(trainer.getErfahrung());

        System.out.println(trainer);

        Spieler spieler = new Spieler("Karim", 40, 50, 10, 10, 10);


        System.out.println(spieler);

        }
    }


 