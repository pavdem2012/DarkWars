package com.pavdem2012.darkwars;

public class Knight extends Warrior {
    String property  = "Благородный ";
    String name  = "рыцарь";
    String act  = " ударил";
    String than  = " копьем";
    public void Attack() {
        System.out.println(property + name + act + than);
    }
    public Knight() {

    }

}
