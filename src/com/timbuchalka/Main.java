package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	/* The goal is to create a single room in a house using composition
	think about what should be included in the room
	maybe physical parts of the house but furniture as well
	Add at least one method to access an object via getter and then
	that object public method as you saw in the previous project
	then add at least one method to hide the object i.e. not using a getter
	but to access the object used in composition within the main class
	 */
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
