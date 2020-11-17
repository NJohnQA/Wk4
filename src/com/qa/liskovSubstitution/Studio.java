package com.qa.liskovSubstitution;

public class Studio {
	private int sqFoot;
	private int numBedrms;

    public Studio() {
    	this.setnumBedrms(1);
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
