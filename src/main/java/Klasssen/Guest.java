package Klasssen;



public class Guest extends Person {

    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Bar platzSuche(Bar bar) {
        if (bar.getMaxBar() > bar.getPersonen().size()) {
            enter(bar);
            for (int i = 0; i <bar.getPersonen().size(); i++){
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
        return  getBar();
    }

    public void doSomething(){
        double ran = Math.random();
            if (ran > 0.5){
                    leave();
                if (getBar().getBuehne().getGuestlist().contains(this)){
                    getBar().getBuehne().getGuestlist().remove(this);
                } else if (getBar().getTheke().getGuestlist().contains(this)) {
                    getBar().getTheke().getGuestlist().remove(this);
                }
                else {
                    getBar().getTuer().getGuestlist().remove(this);
                }
            }
    }


    public void bewegen(){
        int number = 2;

        switch (number){
                case 1:
                    if (getBar() == null){
                        platzSuche(getBar());
                    }
                case 2:
                    if (getBar() != null){
                        doSomething();

                    }
                    else {
                        bewegen();
                    }

            }


    }

    @Override
    public String toString() {
        return "\n\nVorname: "+getVorname()+
                "\nNachname: "+getNachname();

    }
}
