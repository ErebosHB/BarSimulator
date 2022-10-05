package Klasssen;

public class Guest extends Person{
    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public void platzSuche(Bar bar){

        if (bar.getPersonenBar().contains(getNachname())){
            if (bar.getMaxBuehne()> bar.getBuehne().getGuestlist().size()){
                bar.getBuehne().getGuestlist().add(new Guest(getVorname(),getNachname()));
            }
            else if (bar.getMaxTheke()> bar.getTheke().getGuestlist().size()){
                bar.getTheke().getGuestlist().add(new Guest(getVorname(),getNachname()));

            }
            else {
                bar.getTuer().getGuestlist().add(new Guest(getVorname(),getNachname()));
            }
        }
    }


    public void doSomething(Bar bar){

        double ran = Math.random();
        if (ran>0.8){
            if (bar.getPersonenBar().contains(getNachname()));

        }
    }
    @Override
    public String toString() {
        return "\nVorname: "+getVorname()+
                "\nNachname: "+getNachname();
    }
}
