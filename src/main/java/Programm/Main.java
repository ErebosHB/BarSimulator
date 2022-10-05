package Programm;


import Klasssen.Area;
import Klasssen.Bar;
import Klasssen.Guest;
import Klasssen.Musician;

import java.util.ArrayList;

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

        Area area1 = new Area("Bühne");
        area1.setGuestlist(new ArrayList<>());
        Area area2 = new Area("Theke");
        area2.setGuestlist(new ArrayList<>());
        Area area3 = new Area("Tür");
        area3.setGuestlist(new ArrayList<>());

        Bar bar = new Bar("Kneipe",area1,area2,area3,3,3,3);
        guest1.platzSuche(bar);
        guest2.platzSuche(bar);
        guest3.platzSuche(bar);
        guest4.platzSuche(bar);

        System.out.println(area1.getGuestlist());
        System.out.println(area2.getGuestlist());

        guest4.leave(bar);

        System.out.println(area1.getGuestlist());
        System.out.println(area2.getGuestlist());







    }
}
