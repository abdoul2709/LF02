public class Program {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        System.out.println(apfel.getGewicht());
        System.out.println(apfel);

    }
}
