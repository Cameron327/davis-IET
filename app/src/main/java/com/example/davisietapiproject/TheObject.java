package com.example.davisietapiproject;

public class TheObject {
    public String objectType;

    public TheObject(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Override
    public String toString() {
        return "TheObject{" +
                "objectType='" + objectType + '\'' +
                '}';
    }
}
