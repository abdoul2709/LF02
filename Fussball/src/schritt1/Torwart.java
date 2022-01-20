package schritt1;

import schritt1.Spieler;

public class Torwart extends Spieler {

    private int reaktion;


    public Torwart(String name, int alter, int staerke, int motivation, int reaktion) {
        super("Ahmed", 20, 0, 10, 0, 10);

        this.reaktion = reaktion;
    }
}
