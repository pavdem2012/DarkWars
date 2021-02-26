package com.pavdem2012.darkwars;

public class Сrossbowman extends Archer {
    String property  = "Простой ";
    String name  = "арбалетчик";
    String act  = " пустил";
    String than  = " стрелу";

    @Override
    public void attack() {
        System.out.println( property+ name + act + than);
    }
}