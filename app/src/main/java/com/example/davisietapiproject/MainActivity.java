package com.example.davisietapiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements UsersAdapter.ClickedItem{

    Toolbar toolbar;
    RecyclerView recyclerView;

    UsersAdapter usersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        usersAdapter = new UsersAdapter(this::ClickedUser);

        getAllUsers();

    }

    public void getAllUsers(){
        Call<List<UserResponse>> userlist = ApiClient.getUserService().getAllUsers();

        userlist.enqueue(new Callback<List<UserResponse>>() {

            @Override
            public void onResponse(Call<List<UserResponse>> call, Response<List<UserResponse>> response) {

                if(response.isSuccessful()){
                    Log.e("success", response.body().toString());
                    List<UserResponse> userResponse = response.body();

                    usersAdapter.setData(userResponse);

                    recyclerView.setAdapter(usersAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<UserResponse>> call, Throwable t) {
                Log.e("failure", t.getLocalizedMessage());

            }
        });

    }

    @Override
    public void ClickedUser(UserResponse userResponse) {

        Log.e("clicked user", userResponse.toString());
    }
}