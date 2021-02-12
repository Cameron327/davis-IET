package com.example.davisietapiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

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

        Intent intent = getIntent();
        if (intent.getExtras() != null){
            userResponse = (UserResponse) intent.getSerializableExtra("data");
            String usernamedata = userResponse.getTitle();
            String userdisplayName = userResponse.getDisplayName();
            String userobjectType = userResponse.getObjectType();
            String userpublished = userResponse.getPublished();
            
            username.setText(usernamedata);
            displayName.setText(userdisplayName);
            objectType.setText(userobjectType);
            published.setText(userpublished);
        }

    }
}