package schritt5;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int staerke;
    private int gesamtstaerke;
    private int motivation;
    private int gesamtmotivation;





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

    public int getGesamtmotivation() {

        for (Spieler s : spielerListe ) {
            motivation += s.getMotivation();
        }
        motivation += torwart.getMotivation();

        gesamtmotivation = motivation / (spielerListe.size() +1);

        return getGesamtmotivation();
    }

    public int getGesamtstaerke() {

        for (Spieler s : spielerListe ) {
            staerke += s.getStaerke();
        }
        staerke += torwart.getStaerke();

        gesamtstaerke = staerke / (spielerListe.size() +1);

        return getGesamtstaerke();
    }


    @Override
    public String toString() {
        String text = "Name = " + name;
        text += "\n\tTrainer = " + trainer;
        text += "\n\tTorwart = " + torwart;
        text += "\nSpielerliste = " + spielerListe;
        text += "\nGesamtstarerke = " + gesamtstaerke;
        text += "\nGesamtmotivation = " + gesamtmotivation;


        return text;
    }
}
