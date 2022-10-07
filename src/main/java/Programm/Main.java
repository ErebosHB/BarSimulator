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

        Bar bar = new Bar("Kneipe", area1, area2, area3, 3, 3, 3);
        bar.setLiveBand(new ArrayList<>());
        ArrayList<Guest> lebende = new ArrayList<>();
        bar.setPersonen(new ArrayList<>());

        Guest guest1 = new Guest("Tom", "Bulke");
        lebende.add(guest1);
        Guest guest2 = new Guest("Tom", "Vogel");
        lebende.add(guest2);
        Guest guest3 = new Guest("Tom", "Maier");
        lebende.add(guest3);
        Guest guest4 = new Guest("Tom", "Strom");
        lebende.add(guest4);
        Guest guest5 = new Guest("Tom", "Kaiser");
        lebende.add(guest5);
        Guest guest6 = new Guest("Tom", "James");
        lebende.add(guest6);
        Guest guest7 = new Guest("Tom", "Elfers");
        lebende.add(guest7);
        Guest guest8 = new Guest("Tom", "Müller");
        lebende.add(guest8);
        Guest guest9 = new Guest("Tom", "Haasis");
        lebende.add(guest9);
        Guest guest10 = new Guest("Tom", "Burkhard");
        lebende.add(guest10);

        Musician musician1 = new Musician("Felix", "Kaiser", "Trompete");
        Musician musician2 = new Musician("Tom", "Kaiser", "Gitarre");
        Musician musician3 = new Musician("Max", "Kaiser", "Keyboard");
        Musician musician4 = new Musician("Anton", "Kaiser", "Schlagzeug");

        while (true) {
//            for (int x = 0; x < lebende.size(); x++){
//                lebende.get(x).platzSuche(bar);
//            }

            musician1.enterMusiker(bar);
            musician2.enterMusiker(bar);
            musician3.enterMusiker(bar);
            musician4.enterMusiker(bar);


            System.out.println(bar);
            for (int i = 0; i < bar.getLiveBand().size(); i++) {
                bar.getLiveBand().get(i).doSomething();
            }
            System.out.println("---------------");

            System.out.println(bar);
            waitFor();


        }

    }
    private static void waitFor () {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}








