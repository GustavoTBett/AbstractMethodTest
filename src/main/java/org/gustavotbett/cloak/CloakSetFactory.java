package org.gustavotbett.cloak;

import org.gustavotbett.Name;
import org.gustavotbett.SetFactory;

public class CloakSetFactory implements SetFactory {
    @Override
    public Name getName() {
        return new CloakName();
    }
}
