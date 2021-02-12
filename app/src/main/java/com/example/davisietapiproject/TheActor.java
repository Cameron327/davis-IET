package com.example.davisietapiproject;

import java.io.Serializable;

// model class for actor data
public class TheActor implements Serializable {
    public String displayName;

    //constructor
    public TheActor(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return "TheActor{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
