package schritt3;

public class Spieler {

    private String name;
    private int alter;
    private int tore;
    private int staerke;
    private int torschuss;
    private int motivation;

    public Spieler(String name, int alter, int tore, int staerke, int torschuss, int motivation)  {
        this.name = name;
        this.alter = alter;
        this.tore = tore;
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;


    }

    //getter

    public String getName() {
        return name;
    }


    public int getAlter() {

        return alter;
    }

    public int getTore() {

        return tore;
    }

    public int getStaerke() {

        return staerke;
    }

    public int getTorschuss() {

        return torschuss;
    }

    public int getMotivation() {

        return motivation;
    }


    //setter


    public void setName(String name) {

        this.name = name;
    }

    public void setAlter(int alter) {

        this.alter = alter;
    }

    public void setTore(int tore) {

        this.tore = tore ;
    }

    public void setStaerke(int staerke) {

        this.staerke = staerke;
    }

    public void setTorschuss(int torschuss) {

        this.torschuss = torschuss;
    }

    public void setMotivation(int motivation) {

        this.motivation = motivation;
    }


    @Override
    public String toString() {
        String text = "Name = " + name;
        text += "\n\tAlter = " + alter;
        text += "\n\tTore = " + tore;
        text += "\n\tStärke = " + staerke;
        text += "\n\tTorschuss = " + torschuss;
        text += "\n\tMotivation = " + motivation;


        return text;
    }
}
