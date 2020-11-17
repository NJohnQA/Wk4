package com.qa.liskovSubstitution;

public class BedroomAdder {
    public void addBedroom(Penthouse penthouse) {
        penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
    }
}
