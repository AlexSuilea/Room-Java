package com.alexsuilea;

public class Wardrobe {
    private Dimension dimension;
    private int numberOfDoors;
    private int wardrobeLegs;
    private Mirror mirror;

    public Wardrobe(Dimension dimension, int numberOfDoors, int wardrobeLegs, Mirror mirror) {
        this.dimension = dimension;
        this.numberOfDoors = numberOfDoors;
        this.wardrobeLegs = wardrobeLegs;
        this.mirror = mirror;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getWardrobeLegs() {
        return wardrobeLegs;
    }

    public Mirror getMirror() {
        return mirror;
    }

    public void display(){
        System.out.println("..a wardrobe with a dimension of " + getDimension().getHeight() + "cm height and " +
                getDimension().getWidth() + "cm width, with " +getNumberOfDoors()+ " doors and with " +getWardrobeLegs()+
                " legs.\nIt's also contains a nice mirror with a dimension of " +getMirror().getDimension().getHeight()+
                "cm height and "+ getMirror().getDimension().getWidth()+ "cm width.");
    }
}
