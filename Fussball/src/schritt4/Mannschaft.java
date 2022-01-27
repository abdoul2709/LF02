package schritt4;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;


    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {

        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {

        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList<Spieler> getSpielerListe() {

        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public double getmotivation() {

        return getmotivation();
    }

    @Override
    public String toString() {
        String text = "Name = " + name;
        text += "\n\tTrainer = " + trainer;
        text += "\n\tTorwart = " + torwart;
        text += "\nSpielerliste = " + spielerListe;

        return text;
    }
}
