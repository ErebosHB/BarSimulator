package Klasssen;

import java.util.ArrayList;

public class Area {
    private String name;
    private int rating;
    private int size;
    private ArrayList<Guest> guestlist;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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
                "Rating:\n " + rating +"\t"+
                "Size:\n" + size +"\t"+
                "Guestlist:\n"+ guestlist;
    }
}
