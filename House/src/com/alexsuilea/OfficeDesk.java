package com.alexsuilea;

public class OfficeDesk {
    private Dimension dimension;
    private int drawers;
    private int legs;
    private Chair chair;

    public OfficeDesk(Dimension dimension, int drawers, int legs, Chair chair) {
        this.dimension = dimension;
        this.drawers = drawers;
        this.legs = legs;
        this.chair = chair;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getDrawers() {
        return drawers;
    }

    public int getLegs() {
        return legs;
    }

    public Chair getChair() {
        return chair;
    }

    public void display(){
        System.out.println("..a office desk with a dimension of " + getDimension().getHeight() + "cm height and " +
                getDimension().getWidth() + "cm width, with " +getDrawers()+ " drawers and with " +getLegs()+
                " legs.\nIt's also contains a nice chair with "+getChair().getChairLegs()+ " legs and a dimension of "
                +getChair().getDimension().getHeight()+ "cm height and "+ getChair().getDimension().getWidth()+ "cm width.");
    }
}