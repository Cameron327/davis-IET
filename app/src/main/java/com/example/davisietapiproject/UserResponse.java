package com.example.davisietapiproject;

public class UserResponse {
    private String title;
    private String displayName;

    public String getTitle() {
        return title;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "title='" + title + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
