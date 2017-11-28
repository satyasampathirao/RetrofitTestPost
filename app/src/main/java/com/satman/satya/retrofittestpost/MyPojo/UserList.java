package com.satman.satya.retrofittestpost.MyPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by satya on 28-11-2017.
 */

public class UserList {

    @SerializedName("Employeelogin")
    @Expose
    public Employeelogin employeelogin;


    @Override
    public String toString() {
        return "UserList{" +
                "employeelogin=" + employeelogin +
                '}';
    }
}
