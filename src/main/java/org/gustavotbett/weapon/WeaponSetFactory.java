package org.gustavotbett.weapon;

import org.gustavotbett.Name;
import org.gustavotbett.SetFactory;

public class WeaponSetFactory implements SetFactory {
    @Override
    public Name getName() {
        return new WeaponName();
    }
}
