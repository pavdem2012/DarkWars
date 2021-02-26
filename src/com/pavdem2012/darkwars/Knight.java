package com.pavdem2012.darkwars;

public class Knight extends Warrior {
    String property  = "Благородный ";
    String name  = "рыцарь";
    String act  = " ударил";
    String than  = " копьем";

    @Override
    public void attack() {
        System.out.println(property + name + act + than);
    }
}