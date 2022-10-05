package Klasssen;

public abstract class Person {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;

    }

    public void enter(Bar bar){
        if (bar.getMaxBar() > bar.getPersonenBar().size()){
            bar.getPersonenBar().add(new Guest(getVorname(),getNachname()));
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



}
