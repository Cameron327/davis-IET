package com.example.davisietapiproject;

import java.io.Serializable;

// object class
public class TheObject implements Serializable {
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
