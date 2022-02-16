public class Programm2 {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Ubaida", "GG");

        Kunde kunde1 = new Kunde("Ahmed", "Abu", mitarbeiter1 );

        Sparkonto sparkonto1 = new Sparkonto(kunde1, 0);

        sparkonto1.einzahlen(1000);
        System.out.println(sparkonto1.getKontoStand());
        System.out.println(sparkonto1);
    }


}
