package schritt4;

public class Ergebnis {

    private int toreHeim;
    private int toreGast;

    public Ergebnis( int toreHeim, int toreGast) {

        this.toreHeim = toreHeim;
        this.toreGast = toreGast;

    }
    public int getToreHeim() {
        return toreHeim;
    }

    public int getToreGast() {
        return toreGast;
    }

    public void setToreHeim(int toreHeim) {
        this.toreHeim = toreHeim;
    }

    public void setToreGast(int toreGast) {
        this.toreGast = toreGast;
    }

    @Override
    public String toString() {
        String text = "toreHeim = " + toreHeim;
        text += "\n\ttoreGast = " + toreGast;


        return text;
    }
}

