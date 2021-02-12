package com.example.davisietapiproject;

// object class
public class TheObject {
    public String objectType;

    // constructor
    public TheObject(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    @Override
    public String toString() {
        return "TheObject{" +
                "objectType='" + objectType + '\'' +
                '}';
    }
}
