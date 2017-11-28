package com.satman.satya.retrofittestpost.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by satya on 27-11-2017.
 */

public class User {


    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }



}
