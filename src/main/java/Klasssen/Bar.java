package Klasssen;

import java.util.ArrayList;

public class Bar {
    private String barName;
    private final int maxBuehne;
    private final int maxTheke;
    private final int maxTuer;

    Area buehne;
    Area theke;
    Area tuer;
    private int maxBar;

    private ArrayList<Person> personenBar;
    private ArrayList<String> kellner;
    private ArrayList<Musician> liveBand;

    public Bar(String barName,Area buehne, Area theke, Area tuer, int maxBuehne,int maxTheke, int maxTuer){
        personenBar = new ArrayList<>();
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
        maxBar = maxBuehne+maxTheke+maxTuer;
        return maxBar;
    }

    public ArrayList<Person> getPersonenBar() {
        return personenBar;
    }

    public void setPersonenBar(ArrayList<Person> personenBar) {
        this.personenBar = personenBar;
    }

    public ArrayList<Musician> getLiveBand() {
        return liveBand;
    }

    public void setLiveBand(ArrayList<Musician> liveBand) {
        this.liveBand = liveBand;
    }

    public ArrayList<String> getKellner() {
        if (kellner.size()>=5){
            System.out.println("Es ist nicht genug Platz auf der Bühne für die Band");
        }
        return kellner;
    }

    public int anzahlKellner(){
        int anzkellner = maxBar/5;
        if (anzkellner<=3){
            anzkellner = 3;
        }
        return anzkellner;
    }



    @Override
    public String toString() {
        return "\nBar:\t" + barName + "\t\t" +
                "\nPlätze auf der Bühne:\t" + maxBuehne +
                "\nPlätze an der Theke:\t" + maxTheke +
                "\nPlätze an der Tür:\t" + maxTuer +
                "\nPlätze in der Bar:\t" + getMaxBar() +
                "\nGäste in der Bar:\t" + personenBar +
                "\nAnzahl kellner:\t" + anzahlKellner() +
                "\nAnzahl Band-Mitglieder:\t" + liveBand;
    }
}
