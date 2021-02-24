package com.pavdem2012.darkwars;

public class LandMage extends Wizard {
    String property  = "земли ";
    String name  = "Маг ";
    String act  = "швырнул";
    String than  = " земляной шар";

    public void Attack() {
        System.out.println(name + property + act + than);
    }

    public LandMage() {
    }
}