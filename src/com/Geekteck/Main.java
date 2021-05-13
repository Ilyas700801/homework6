package com.Geekteck;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);


        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponName("Kalash");
        bossWeapon.setWeaponType("avtomat");


        boss.setWeapon(bossWeapon);

        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(650);
        skeleton.setDamage(45);
        skeleton.setQuantityOfArrows(5);

        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setWeaponType("bow");
        skeletonWeapon.setWeaponName("jaa");

        skeleton.setWeapon(skeletonWeapon);

        System.out.println(skeleton.printInfo());


    }
}
