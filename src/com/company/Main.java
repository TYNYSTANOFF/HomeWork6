package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.weapon.setType("Огнестрел");
        boss.weapon.setName("AK-47");
    boss.setHealth(300);
boss.setDamage(25);

        System.out.println("Boss's" + boss.printInfo());


        System.out.println("--------------------");


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(880);
        skeleton1.setDamage(90);
        skeleton1.setArrowSum(10);
        skeleton1.weapon.setType("Метательное");
        skeleton1.weapon.setName("Лук");
        System.out.println("Skeleton1 " + skeleton1.printInfo());

        System.out.println("--------------------");


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(950);
        skeleton2.setDamage(75);
        skeleton2.setArrowSum(15);
        skeleton2.weapon.setType("Метательное");
        skeleton2.weapon.setName("Лук");
        System.out.println("Skeleton2 " + skeleton2.printInfo());

    }
}
