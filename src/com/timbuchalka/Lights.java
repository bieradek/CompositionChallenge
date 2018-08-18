package com.timbuchalka;

public class Lights {
    private int lumens;
    private int watts;
    private String tint; // cold or warm

    public Lights(int lumens, int watts, String tint) {
        this.lumens = lumens;
        this.watts = watts;
        this.tint = tint;
    }

    public void turnOn() {
        System.out.println("Lights: turning on");
    }

    public void turnOff() {
        System.out.println("Lights: turning off");
    }
}
