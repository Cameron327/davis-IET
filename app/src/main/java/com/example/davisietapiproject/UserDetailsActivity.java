package com.example.davisietapiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {

    TextView username, displayName, objectType, published;
    UserResponse userResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        username = findViewById(R.id.username);
        displayName = findViewById(R.id.displayName);
        objectType = findViewById(R.id.objectType);
        published = findViewById(R.id.published);


    }
}