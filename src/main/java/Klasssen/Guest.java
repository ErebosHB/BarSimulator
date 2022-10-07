package Klasssen;


public class Guest extends Person {

    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Bar platzSuche(Bar bar) {
        if (bar.getMaxBar() > bar.getPersonen().size()) {
            enter(bar);
            for (int i = 0; i < bar.getPersonen().size(); i++) {
                if (bar.getPersonen().get(i).getNachname().equals(getNachname())) {
                    if (bar.getMaxBuehne() > bar.getBuehne().getGuestlist().size()) {
                        bar.getBuehne().getGuestlist().add(this);
                    } else if (bar.getMaxTheke() > bar.getTheke().getGuestlist().size()) {
                        bar.getTheke().getGuestlist().add(this);

                    } else {
                        bar.getTuer().getGuestlist().add(this);
                    }
                }
            }


        }
        return getBar();
    }

    public void doSomething(Bar bar) {

        if(this.getBar() == null){
            platzSuche(bar);
        }
        else {
            double ran = Math.random();
            if (ran > 0.5) {
                leave();
                if (getBar().getBuehne().getGuestlist().contains(this)) {
                    getBar().getBuehne().getGuestlist().remove(this);
                    this.setBar(null);
                } else if (getBar().getTheke().getGuestlist().contains(this)) {
                    getBar().getTheke().getGuestlist().remove(this);
                    this.setBar(null);
                } else {
                    getBar().getTuer().getGuestlist().remove(this);
                    this.setBar(null);
                }
        }

        }
    }




    @Override
    public String toString() {
        return "\n\nVorname: " + getVorname() +
                "\nNachname: " + getNachname();

    }
}
