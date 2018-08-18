package com.timbuchalka;

public class Room {
    private Doors doors;
    private Dimensions dimensions;
    private Color color;
    private Lights lights;

    public Room(Doors doors, Dimensions dimensions, Color color, Lights lights) {
        this.doors = doors;
        this.dimensions = dimensions;
        this.color = color;
        this.lights = lights;
    }

    public void turnLightsOff() {
        getLights().turnOff();
        System.out.println("Room: turning the ligts off");
    }

    public void turnLightsOn() {
        getLights().turnOn();
        System.out.println("Room: turning the lights on");
    }

    public void closeDoors() {
        getDoors().close();
        System.out.println("Room: closing the doors");
    }

    public void openDoors() {
        getDoors().open();
        System.out.println("Room: opening the doors");
    }

    private Doors getDoors() {
        return doors;
    }

    private void setDoors(Doors doors) {
        this.doors = doors;
    }

    private Dimensions getDimensions() {
        return dimensions;
    }

    private void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    private Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    private Lights getLights() {
        return lights;
    }

    private void setLights(Lights lights) {
        this.lights = lights;
    }
}
