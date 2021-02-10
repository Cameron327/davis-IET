package com.example.davisietapiproject;

// model class for actor data
public class TheActor {
    public String displayName;

    //constructor
    public TheActor(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "TheActor{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
