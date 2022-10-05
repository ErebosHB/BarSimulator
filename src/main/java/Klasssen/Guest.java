package Klasssen;

public class Guest extends Person {
    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public void platzSuche(Bar bar) {

        if (bar.getMaxBar() > bar.getPersonenBar().size()) {
            bar.getPersonenBar().add(new Guest(getVorname(), getNachname()));
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

    public void leave(Bar bar){
        for (int i = 0;i < bar.getPersonenBar().size();i++) {
            if (bar.getPersonenBar().get(i).getNachname().equals(getNachname())){
                bar.getPersonenBar().remove(i);
                for (int y = 0;y < bar.getBuehne().getGuestlist().size(); y++){
                    if (bar.getBuehne().getGuestlist().get(y).equals(getNachname())){
                        bar.getBuehne().getGuestlist().remove(y);
                    }
                }
                for (int x = 0; x < bar.getTheke().getGuestlist().size(); x++){
                    if (bar.getTheke().getGuestlist().get(x).equals(getNachname())){
                        bar.getTheke().getGuestlist().remove(x);
                    }
                }
                for (int z = 0; z < bar.getTuer().getGuestlist().size();z++){
                    bar.getTuer().getGuestlist().remove(z);
                }
            }
        }
    }


    public void doSomething(Bar bar) {

        double ran = Math.random();
        if (ran > 0.8) {
            if (bar.getPersonenBar().contains(getNachname())) ;

        }
    }

    @Override
    public String toString() {
        return "\nVorname: " + getVorname() +
                "\nNachname: " + getNachname();
    }
}
