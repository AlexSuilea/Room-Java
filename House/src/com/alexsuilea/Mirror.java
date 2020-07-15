package com.alexsuilea;

public class Mirror {
    private boolean glossy;
    private Dimension dimension;

    public Mirror(boolean glossy, Dimension dimension) {
        this.glossy = glossy;
        this.dimension = dimension;
    }

    public boolean isGlossy() {
        return glossy;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
