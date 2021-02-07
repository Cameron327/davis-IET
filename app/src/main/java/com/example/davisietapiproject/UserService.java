package com.example.davisietapiproject;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("api/v1/activity/public?s=0?l=25")
    Call<List<UserResponse>> getAllUsers();

}
