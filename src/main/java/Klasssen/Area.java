package Klasssen;

import java.util.ArrayList;

public abstract class Area {
    private String name;
    private int size;
    private ArrayList<Guest> guestlist;


    public Area(String name, ArrayList guestlist){
        this.name = name;
        guestlist = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public ArrayList getGuestlist() {
        return guestlist;
    }

    public void setGuestlist(ArrayList guestlist) {
        this.guestlist = guestlist;
    }



    @Override
    public String toString() {
        return "Area:\n"+ name + '\t' +
                "Size:\n" + size +"\t"+
                "Guestlist:\n"+ guestlist;
    }
}
