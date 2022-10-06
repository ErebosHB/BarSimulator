package Klasssen;

public class Guest extends Person {
    private Bar barG;

    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
        this.barG = barG;
    }

    public Bar getBarG() {
        return barG;
    }
    public void setBarG(Bar barG) {
        this.barG = barG;
    }

    public void platzSuche(Bar bar) {

        if (bar.getMaxBar() > bar.getPersonenBar().size()) {
            bar.getPersonenBar().add(new Guest(getVorname(), getNachname()));
            setBarG(bar);
            for (int i = 0; i < bar.getPersonenBar().size();i++){
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
    }

    public void doSomething(){

        double ran = Math.random();
        if (ran >= 0.8) {
            for (int i = 0;i < getBarG().getPersonenBar().size();i++) {
                if (getBarG().getPersonenBar().get(i).getNachname().equals(getNachname())){
                    getBarG().getPersonenBar().remove(i);
                    setBarG(null);
                    if (getBarG().getBarName().equalsIgnoreCase(barG.getBuehne().getName())){
                        for (int y = 0;y < getBarG().getBuehne().getGuestlist().size(); y++){
                            if (getBarG().getBuehne().getGuestlist().get(y).equals(getNachname())){
                                getBarG().getBuehne().getGuestlist().remove(y);
                            }
                    }
                    } else if (getBarG().getBarName().equalsIgnoreCase(barG.getTheke().getName())) {
                        for (int x = 0; x < getBarG().getTheke().getGuestlist().size(); x++){
                            if (getBarG().getTheke().getGuestlist().get(x).equals(getNachname())){
                                getBarG().getTheke().getGuestlist().remove(x);
                            }
                    }

                    }
                    else {
                        for (int z = 0; z < getBarG().getTuer().getGuestlist().size();z++){
                            if (getBarG().getTuer().getGuestlist().get(z).equals(getNachname()))
                                getBarG().getTuer().getGuestlist().remove(z);
                        }
                    }

                }
            }

        }



    }








    @Override
    public String toString() {
        return "\nVorname: " + getVorname() +
                "\nNachname: " + getNachname();

    }
}
