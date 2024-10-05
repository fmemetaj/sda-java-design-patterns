package org.javatirane42.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Weapon weaponExample = new Weapon.Builder()
                .withName("weapon")
                .withType("ak47")
                .withDamage(50)
                .withDurability(10L)
                .build();

        System.out.println(weaponExample);
    }
}
