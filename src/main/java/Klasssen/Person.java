package Klasssen;

public abstract class Person {
    private String vorname;
    private String nachname;
    private Bar bar;

    public Person(String vorname, String nachname) {
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

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void enter(Bar bar) {
        if (bar.getMaxBar() > bar.getPersonen().size()) {
            bar.getPersonen().add(new Guest(getVorname(), getNachname()));
            setBar(bar);

        }

    }

    public void leave() {
        for (int i = 0; i < getBar().getPersonen().size(); i++) {
            if (getBar().getPersonen().get(i).getNachname().equals(getNachname())){
                getBar().getPersonen().remove(i);
                break;
            }
        }
    }
}
