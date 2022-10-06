package Klasssen;

import java.util.ArrayList;

public class Area {
    private String name;

    private Bar bar;
    private ArrayList<Guest> guestlist;


    public Area(String name){
        this.name = name;
        guestlist = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getGuestlist() {
        return guestlist;
    }

    public void setGuestlist(ArrayList guestlist) {
        this.guestlist = guestlist;
    }



    @Override
    public String toString() {
        String text = "\nBereich: "+getName();
        text+="\nGäste: "+getGuestlist();
        return text;
    }
}
