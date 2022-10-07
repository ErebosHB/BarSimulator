package Programm;


import Klasssen.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Area area1 = new Area("Bühne");
        area1.setGuestlist(new ArrayList<>());
        Area area2 = new Area("Theke");
        area2.setGuestlist(new ArrayList<>());
        Area area3 = new Area("Tür");
        area3.setGuestlist(new ArrayList<>());

        Bar bar = new Bar("Kneipe",area1,area2,area3,3,3,3);
        bar.setLiveBand(new ArrayList<>());

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


        guest1.platzSuche(bar);
        guest2.platzSuche(bar);
        guest3.platzSuche(bar);
        guest4.platzSuche(bar);
        guest5.platzSuche(bar);
        guest6.platzSuche(bar);
        guest7.platzSuche(bar);
        guest8.platzSuche(bar);
        guest9.platzSuche(bar);
        guest10.platzSuche(bar);
        musician1.enterMusiker(bar);
        musician2.enterMusiker(bar);
        musician3.enterMusiker(bar);
        musician4.enterMusiker(bar);


        System.out.println(bar);
        System.out.println("---------------");
//        for (int x = 0; x < bar.getPersonen().size();x++){
//            bar.getPersonen().get(x).platzSuche(bar);
//        }
        guest1.doSomething();
        guest2.doSomething();
        guest3.doSomething();
        guest4.doSomething();
        guest5.doSomething();
        guest6.doSomething();
        guest7.doSomething();
        guest8.doSomething();
        guest9.doSomething();
        for (int i = 0; i < bar.getLiveBand().size();i++){
            bar.getLiveBand().get(i).doSomething();
        }
        System.out.println(bar);














    }
}
