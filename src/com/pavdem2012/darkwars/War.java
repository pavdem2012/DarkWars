package com.pavdem2012.darkwars;
/**
 * Создайте несколько классов персонажей: например, воин, лучник и маг.
 * Каждый из них должен быть родительским для нескольких других классов допустим, воин будет базовым классом для рыцаря и берсеркера.
 * У всех персонажей должен быть метод Attack (), при вызове которого у разных персонажей будут выводиться различные сообщения. Например, если атаковать будет маг, то мы должны увидеть сообщение, что он запустил огненный шар.
 */
public class War {

    public static void main(String[] args) {
        /**
         * вызов атаки Воин
         */        
        Warrior warrior = new Warrior();
        warrior.Attack();

        /**
         * вызов атаки Рыцарь 
         */
        
        Knight knight = new Knight();
        knight.Attack();

        /**
         * вызов атаки Берсерк 
         */        
        Berserk berserk  = new Berserk();
        berserk.Attack();

        /**
         * вызов атаки Лучник 
         */
        Archer archer  = new Archer();
        archer.Attack();

        /**
         * вызов атаки Арбалетчик 
         */
        Сrossbowman crossbowman  = new Сrossbowman();
        crossbowman.Attack();

        /**
         * вызов атаки Снайпер лучник 
         */
        SniperArcher sniperArcher  = new SniperArcher();
        sniperArcher.Attack();

        /**
         * вызов атаки Маг
         */
        Wizard wizard = new Wizard();
        wizard.Attack();

        /**
         * вызов атаки Маг воды
         */
        WaterMage waterMage = new WaterMage();
        waterMage.Attack();

        /**
         * вызов атаки Маг земли
         */
        LandMage landMage = new LandMage();
        landMage .Attack();
        
    }
}