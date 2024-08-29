package org.gustavotbett.armor;

import org.gustavotbett.Name;
import org.gustavotbett.SetFactory;

public class ArmorSetFactory implements SetFactory {

    @Override
    public Name getName() {
        return new ArmorName();
    }
}
