package Klasssen;

import java.util.ArrayList;

public class Guest extends Person {

    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public void platzSuche(Bar bar) {
        if (bar.getMaxBar() > bar.getPersonenBar().size()) {
            bar.getPersonenBar().add(new Guest(getVorname(), getNachname()));
            for (int i = 0; i < bar.getPersonenBar().size(); i++) {
                if (bar.getPersonenBar().get(i).getNachname().contains(getNachname())) {
                    if (bar.getMaxBuehne() > bar.getBuehne().getGuestlist().size()) {
                        bar.getBuehne().getGuestlist().add(bar.getPersonenBar().get(i));
                    } else if (bar.getMaxTheke() > bar.getTheke().getGuestlist().size()) {
                        bar.getTheke().getGuestlist().add(new Guest(getVorname(), getNachname()));

                    } else {
                        bar.getTuer().getGuestlist().add(new Guest(getVorname(), getNachname()));
                    }
                }
            }



    }

    public void doSomething(Guest guest) {
        double ran = Math.random();
        //if (ran > 0.1) {
        if ()




        //}


    }


    @Override
    public String toString() {
        return "\nVorname: " + getVorname() +
                "\nNachname: " + getNachname();

    }
}
