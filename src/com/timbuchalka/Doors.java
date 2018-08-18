package com.timbuchalka;

public class Doors {
    private String material;
    private boolean hasWindows;

    public Doors(String material, boolean hasWindows) {
        this.material = material;
        this.hasWindows = hasWindows;
    }

    public void close() {
        System.out.println("Doors: closing the door");
    }

    public void open(){
        System.out.println("Doors: opening the door");
    }
}
