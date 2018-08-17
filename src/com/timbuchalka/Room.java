package com.timbuchalka;

public class Room {
    private Doors doors;
    private Dimensions dimensions;
    private Color color;

    public Room(Doors doors, Dimensions dimensions, Color color) {
        this.doors = doors;
        this.dimensions = dimensions;
        this.color = color;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
