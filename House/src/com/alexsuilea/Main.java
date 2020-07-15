package com.alexsuilea;

public class Main {

    public static void main(String[] args) {
        Chair chair = new Chair(4, new Dimension(100, 80));
        OfficeDesk officeDesk =  new OfficeDesk(new Dimension(150, 120), 3, 4, chair);
        Bed bed = new Bed(4, new Dimension(60,220), 2, 1);
        Mirror mirror = new Mirror(true, new Dimension(100, 80));
        Wardrobe wardrobe = new Wardrobe(new Dimension(200,300), 4, 6, mirror);

        Room room = new Room(officeDesk, bed, wardrobe);
        room.openTheDoor();
    }
}