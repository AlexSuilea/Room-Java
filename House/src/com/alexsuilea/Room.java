package com.alexsuilea;

public class Room {
    private OfficeDesk officeDesck;
    private Bed bed;
    private Wardrobe wardrobe;

    public Room(OfficeDesk officeDesck, Bed bed, Wardrobe wardrobe) {
        this.officeDesck = officeDesck;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public OfficeDesk getOfficeDesck() {
        return officeDesck;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void openTheDoor(){
        System.out.println("Welcome to my room. You will find here..");
        getOfficeDesck().display();
        getBed().display();
        getWardrobe().display();
    }
}
