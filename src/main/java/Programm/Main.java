package Programm;


import Klasssen.Bar;
import Klasssen.Guest;
import Klasssen.Musician;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Tom","Bulke");
        Guest guest2 = new Guest("Tom","Vogel");
        Guest guest3 = new Guest("Tom","Maier");
        Guest guest4 = new Guest("Tom","Strom");
        Guest guest5 = new Guest("Tom","Kaiser");
        Guest guest6 = new Guest("Tom","James");
        Guest guest7 = new Guest("Tom","Elfers");
        Guest guest8 = new Guest("Tom","Müller");
        Guest guest9 = new Guest("Tom","Haasis");
        Guest guest10 = new Guest("Tom","Burkhard");

        Musician musician1 = new Musician("Felix","Kaiser","Trompete");
        Musician musician2 = new Musician("Tom","Kaiser","Gitarre");
        Musician musician3 = new Musician("Max","Kaiser","Keyboard");
        Musician musician4 = new Musician("Anton","Kaiser","Schlagzeug");

        Bar bar = new Bar("Kneipe",3,3,3);
        bar.setSizeBar(9);

        private void enter(bar){

        }




    }
}
