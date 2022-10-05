package Klasssen;

public class Musician extends Person{

    private String instrument;
    public Musician(String vorname, String nachname, String instrument) {
        super(vorname, nachname);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

   public void doSomething(){
       System.out.println("Der Musiker spielt: "+ getInstrument());
   }

    @Override
    public String toString() {
        String text = "Musiker";
        text +="Vorname:\n"+ getVorname();
        text+="Nachname:\n"+getNachname();
        text+="Instrument:\n"+getInstrument();
        return text;
    }
}
