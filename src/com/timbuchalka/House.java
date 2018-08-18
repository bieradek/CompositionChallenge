package com.timbuchalka;

public class House {
    private Room room;
    private String type;
    private Dimensions houseDimensions;
    private boolean secured;

    public House(Room room, String type, Dimensions houseDimensions, boolean secured) {
        this.room = room;
        this.type = type;
        this.houseDimensions = houseDimensions;
        this.secured = secured;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dimensions getHouseDimensions() {
        return houseDimensions;
    }

    public void setHouseDimensions(Dimensions houseDimensions) {
        this.houseDimensions = houseDimensions;
    }

    public boolean isSecured() {
        return secured;
    }

    public void setSecured(boolean secured) {
        this.secured = secured;
    }
}