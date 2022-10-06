package Klasssen;

import java.util.ArrayList;

public abstract class Person {
    private String vorname;
    private String nachname;

    private Bar barPerson;

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

    public Bar getBarPerson() {
        return barPerson;
    }

    public void setBarPerson(Bar barPerson) {
        this.barPerson = barPerson;
    }

    public ArrayList enter(Bar bar){
        if (bar.getMaxBar() > bar.getPersonenBar().size()){
            bar.getPersonenBar().add(new Guest(getVorname(),getNachname()));
        }
        return bar.getPersonenBar();
    }

    public void leave(Bar bar){
        for (int i = 0;i < bar.getPersonenBar().size();i++) {
            if (bar.getPersonenBar().get(i).getNachname().equals(getNachname())){
                bar.getPersonenBar().remove(i);
            }
        }
    }



}
