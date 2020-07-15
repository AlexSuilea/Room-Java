package com.alexsuilea;

public class Chair {
    private int chairLegs;
    private Dimension dimension;

    public Chair(int chairLegs, Dimension dimension) {
        this.chairLegs = chairLegs;
        this.dimension = dimension;
    }

    public int getChairLegs() {
        return chairLegs;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
