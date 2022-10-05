package Klasssen;

import java.util.ArrayList;

public class Bar {

    private String barName;
    private int anzahlBuehne;
    private int anzahlTheke;
    private int anzahlTuer;
    private int sizeBar;

    private ArrayList guestsBar;
    private ArrayList kellner;
    private ArrayList liveBand;

    public Bar(String barName,int anzahlArea1,int anzahlArea2, int anzahlArea3){
        this.barName = barName;
        this.anzahlBuehne = anzahlBuehne;
        this.anzahlTheke = anzahlArea2;
        this.anzahlTuer = anzahlArea3;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public int getAnzahlBuehne() {
        return anzahlBuehne;
    }

    public int getAnzahlTheke() {
        return anzahlTheke;
    }

    public int getAnzahlTuer() {
        return anzahlTuer;
    }

    public int getSizeBar() {
        return sizeBar;
    }

    public void setSizeBar(int sizeBar) {
        this.sizeBar = sizeBar;
    }

    public ArrayList getGuestsBar() {
        return guestsBar;
    }

    public void setGuestsBar(ArrayList guestsBar) {
        this.guestsBar = guestsBar;
    }

    public ArrayList getKellner() {
        return kellner;
    }

    public ArrayList getLiveBand() {
        return liveBand;
    }

    @Override
    public String toString() {
        return "Bar:\n" + barName + "\n\n" +
                "Plätze auf der Bühne:\n" + anzahlBuehne +
                "Plätze an der Theke:\n" + anzahlTheke +
                "Plätze an der Tür:\n" + anzahlTuer +
                "Plätze in der Bar:\n" + sizeBar +
                "Gäste in der Bar:\n" + guestsBar +
                "Anzahl kellner:\n" + kellner +
                "Anzahl Band-Mitgliede:\nr" + liveBand;
    }
}
