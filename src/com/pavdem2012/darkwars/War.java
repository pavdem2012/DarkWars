package com.pavdem2012.darkwars;
/**
 * Создайте несколько классов персонажей: например, воин, лучник и маг.
 * Каждый из них должен быть родительским для нескольких других классов допустим, воин будет базовым классом для рыцаря и берсеркера.
 * У всех персонажей должен быть метод Attack (), при вызове которого у разных персонажей будут выводиться различные сообщения. Например, если атаковать будет маг, то мы должны увидеть сообщение, что он запустил огненный шар.
 */
public class War {

    public static void main(String[] args) {
        /*
         * вызов атаки Воин
         */        
        Warrior warrior = new Warrior();
        warrior.attack();

        /*
         * вызов атаки Рыцарь 
         */
        
        Knight knight = new Knight();
        knight.attack();

        /*
         * вызов атаки Берсерк 
         */        
        Berserk berserk  = new Berserk();
        berserk.attack();

        /*
         * вызов атаки Лучник 
         */
        Archer archer  = new Archer();
        archer.attack();

        /*
         * вызов атаки Арбалетчик 
         */
        Сrossbowman crossbowman  = new Сrossbowman();
        crossbowman.attack();

        /*
         * вызов атаки Снайпер лучник 
         */
        SniperArcher sniperArcher  = new SniperArcher();
        sniperArcher.attack();

        /*
         * вызов атаки Маг
         */
        Wizard wizard = new Wizard();
        wizard.attack();

        /*
         * вызов атаки Маг воды
         */
        WaterMage waterMage = new WaterMage();
        waterMage.attack();

        /*
         * вызов атаки Маг земли
         */
        LandMage landMage = new LandMage();
        landMage .attack();
        
    }
}