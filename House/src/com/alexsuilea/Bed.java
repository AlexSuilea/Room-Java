package com.alexsuilea;

public class Bed {
    private int bedLegs;
    private Dimension dimension;
    private int pillow;
    private int blanket;

    public Bed(int bedLegs, Dimension dimension, int pillow, int blanket) {
        this.bedLegs = bedLegs;
        this.dimension = dimension;
        this.pillow = pillow;
        this.blanket = blanket;
    }

    public int getBedLegs() {
        return bedLegs;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getPillow() {
        return pillow;
    }

    public int getBlanket() {
        return blanket;
    }

    public void display(){
        System.out.println("..a bed with a dimension of " + getDimension().getHeight() + "cm height and " +
                getDimension().getWidth() + "cm width, with " +getPillow()+ " pillow/pillows and with " +getBlanket()+
                " blanket/blankets.\nIt's also have " +getBedLegs() +" legs.");
    }

}
