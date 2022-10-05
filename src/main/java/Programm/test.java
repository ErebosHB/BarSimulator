package Programm;

import Klasssen.*;

public class test {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Tom","Vogel");
        Musician musician1 = new Musician("Felix","Kaiser","Trompete");
        Area area1 = new Area("Buehne");
        Area area2 = new Area("Theke");
        Area area3 = new Area("Tür");
        Bar bar = new Bar("Kneipe",area1,area2,area3,3,3,3);
        guest1.enter(bar);
        musician1.leave(bar);
        System.out.println(bar.getPersonenBar());

        System.out.println(bar.getBuehne().getGuestlist());
        System.out.println(bar.getTheke().getGuestlist());
        System.out.println(bar.getTuer().getGuestlist());





        }





    }


