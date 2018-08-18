package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // optional initialization --> Doors doors = new Doors("Wooden");
        Room livingRoom = new Room(new Doors("Wooden", true), new Dimensions(4, 5, 2), new Color("Blue/Yellow"), new Lights(1000, 7, "Warm"));
        House myHouse = new House(livingRoom, "Semi-detached", new Dimensions(20, 10, 15), true);

        livingRoom.openDoors();
        System.out.println("*********");
        livingRoom.closeDoors();
        System.out.println("*********");
        myHouse.getRoom().openDoors();
        System.out.println("*********");
        myHouse.getRoom().closeDoors();
        System.out.println("*********");
        myHouse.getRoom().turnLightsOn();
        System.out.println("*********");
        myHouse.getRoom().turnLightsOff();
        System.out.println("*********");
    }
}
