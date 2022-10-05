package Klasssen;

import java.util.ArrayList;

public class Programm {
    private Bar bar;
    private Area buehne;
    private Area theke;
    private Area tuer;
    private Guest guest;


    public static void musikerAufbuehne(Bar bar) {
        if (bar.getLiveBand().size() >= 5) {
            System.out.println("fehlermeldung");
        }
    }

    public void zuweisung(Guest guest) {
        if (buehne.getGuestlist().size() <= buehne.getSize()) {

        }


    }
}
