package com.pavdem2012.darkwars;

public class WaterMage extends Wizard {
    String property  = "воды ";
    String name  = "Маг ";
    String act  = "швырнул";
    String than  = " водяной шар";

    @Override
    public void attack() {
        System.out.println(name + property + act + than);
    }
}