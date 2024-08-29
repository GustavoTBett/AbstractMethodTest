package org.gustavotbett;

import org.gustavotbett.armor.ArmorSetFactory;
import org.gustavotbett.cloak.CloakSetFactory;
import org.gustavotbett.weapon.WeaponSetFactory;

public class Main {
    public static void main(String[] args) {
        ArmorSetFactory armorSetFactory = new ArmorSetFactory();
        WeaponSetFactory weaponSetFactory = new WeaponSetFactory();
        CloakSetFactory cloakSetFactory = new CloakSetFactory();

        Equipment armor = new Equipment(armorSetFactory);

        System.out.println(armor.getName());

        Equipment weapon = new Equipment(weaponSetFactory);

        System.out.println(weapon.getName());

        Equipment cloak = new Equipment(cloakSetFactory);

        System.out.println(cloak.getName());
    }
}