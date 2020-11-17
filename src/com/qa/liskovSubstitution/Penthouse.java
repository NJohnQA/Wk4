package com.qa.liskovSubstitution;

public class Penthouse {
    private int sqFoot;
    private int numBedrms;

    public Penthouse() {
        this.setnumBedrms(4);
    }

    public int getsqFoot() {
        return sqFoot;
    }

    public void setsqFoot(int sqft) {
        this.sqFoot = sqft;
    }

    public int getnumBedrms() {
        return numBedrms;
    }

    public void setnumBedrms(int numRooms) {
        this.numBedrms = numRooms;
    }
}
