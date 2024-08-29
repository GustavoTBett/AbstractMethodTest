package org.gustavotbett;

public class Equipment {
    protected Name name;

    public Equipment(SetFactory factory) {
        this.name = factory.getName();
    }

    public String getName() {
        return name.getName();
    }
}
