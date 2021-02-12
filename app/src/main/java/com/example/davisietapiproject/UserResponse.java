package com.example.davisietapiproject;

import android.content.ClipData;

import java.util.Map;

public class UserResponse {
    private String title;

    // we need to make object of class actor
    private TheActor actor;

    public UserResponse(String title, TheActor theActor) {
        this.title = title;
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public TheActor getTheActor() {
        return actor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTheActor(TheActor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "title='" + title + '\'' +
                ", actor=" + actor.displayName +
                '}';
    }

    public boolean isIs_Active() {
        return true;
    }

}
