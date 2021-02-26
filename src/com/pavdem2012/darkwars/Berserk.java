package com.pavdem2012.darkwars;

public class Berserk extends Warrior {
    String property  = "Яростный ";
    String name  = "берсерк";
    String act  = " ударил";
    String than  = " топором";

    @Override
    public void attack() {
        System.out.println(property + name + act + than);
    }
}