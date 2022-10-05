package Programm;

import Klasssen.*;

public class test {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Tom","Vogel");
        Musician musician1 = new Musician("Felix","Kaiser","Trompete");
        Bar bar = new Bar("Kneipe",3,3,3);
        guest1.enter(bar);
        musician1.leave(bar);


        System.out.println(bar.getBuehne().getGuestlist());
        }





    }


