package com.pavdem2012.darkwars;

public class SniperArcher extends Archer {
    String property = "Снайпер ";
    String name = "лучник";
    String act = " пустил";
    String than = " стрелу";

    @Override
    public void attack() {
        System.out.println(property + name + act + than);
    }
}