package Klasssen;

public class Guest extends Person{
    public Guest(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public void enterGuest(Bar bar){

    }

    @Override
    public String toString() {
        String text = "Gast\t";
        text += "Vorname:\n" +getVorname();
        text += "Nachname:\n"+getNachname();
        return text;
    }
}
