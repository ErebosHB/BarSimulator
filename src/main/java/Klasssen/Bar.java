package Klasssen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bar {
    private String barName;
    private final int maxBuehne;
    private final int maxTheke;
    private final int maxTuer;

    private Area buehne;
    private Area theke;
    private Area tuer;
    private int maxBar;

    private ArrayList<Guest> personen;
    private ArrayList<String> kellner;
    private ArrayList<Musician> liveBand;

    public Bar(String barName, Area buehne, Area theke, Area tuer, int maxBuehne, int maxTheke, int maxTuer) {
        personen = new ArrayList<>();
        liveBand = new ArrayList<>();
        this.barName = barName;
        this.buehne = buehne;
        this.theke = theke;
        this.tuer = tuer;
        this.maxBuehne = maxBuehne;
        this.maxTheke = maxTheke;
        this.maxTuer = maxTuer;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public Area getBuehne() {
        return buehne;
    }

    public Area getTheke() {
        return theke;
    }

    public Area getTuer() {
        return tuer;
    }

    public int getMaxBuehne() {
        return maxBuehne;
    }

    public int getMaxTheke() {
        return maxTheke;
    }

    public int getMaxTuer() {
        return maxTuer;
    }

    public int getMaxBar() {
        maxBar = maxBuehne + maxTheke + maxTuer;
        return maxBar;
    }

    public ArrayList<Guest> getPersonen() {
        return personen;
    }

    public Person getPersonByLastName(String lastName) {
        return personen.stream().filter(e -> e.getNachname().equals(lastName)).findFirst().get();
    }

    public void setPersonen(ArrayList<Guest> personen) {
        this.personen = personen;
    }

    public ArrayList<Musician> getLiveBand() {
        return liveBand;
    }

    public void setLiveBand(ArrayList<Musician> liveBand) {
        if (liveBand.size() >= 5) {
            System.out.println("Es ist nicht genug Platz auf der B??hne f??r die Band");
        }
        this.liveBand = liveBand;
    }

    public ArrayList<String> getKellner() {
        return kellner;
    }

    public int anzahlKellner() {
        int anzkellner = maxBar / 5;
        if (anzkellner <= 3) {
            anzkellner = 3;
        }
        return anzkellner;
    }


    @Override
    public String toString() {
        return "\nBar:\t" + barName + "\t\t" +
                "\nPl??tze:\t" + maxBar +
                "\nG??ste in der Bar:\t" + personen.size() +
                "\n\nPl??tze:\t" + maxBuehne +
                getBuehne() +
                "\n\nPl??tze:\t" + maxTheke +
                getTheke() +
                "\n\nPl??tze:\t" + maxTuer +
                getTuer() +
                "\n\nAnzahl kellner:\t" + anzahlKellner() +
                "\nAnzahl Band-Mitglieder:\t" + liveBand.size() + "\n" + liveBand;
    }
}
