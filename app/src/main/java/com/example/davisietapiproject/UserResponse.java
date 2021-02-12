package com.example.davisietapiproject;

import android.content.ClipData;

import java.io.Serializable;
import java.util.Map;

public class UserResponse implements Serializable {
    private String title;
    private String published;

    // we need to make object of these classes
    private TheActor actor;
    private TheObject object;

    public UserResponse(String title, String published, TheActor theActor, TheObject theObject) {
        this.title = title;
        this.published = published;
        this.actor = actor;
        this.object = object;
    }

    public String getTitle() {
        return title;
    }

    public TheActor getTheActor() {
        return actor;
    }

    public TheObject getTheObject() {
        return object;
    }

    public String getPublished() {
        return published;
    }

    public String getDisplayName() {
        return actor.displayName;
    }

    public String getObjectType() {
        return object.objectType;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "title='" + title + '\'' +
                ", published='" + published + '\'' +
                ", actor=" + actor +
                ", object=" + object +
                '}';
    }

    public boolean isIs_Active() {
        return true;
    }

}
