package com.satman.satya.retrofittestpost.MyPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by satya on 28-11-2017.
 */

public class Employeelogin {

    @SerializedName("StatusCode")
    @Expose
    public Integer statusCode;
    @SerializedName("StatusText")
    @Expose
    public String statusText;
    @SerializedName("Data")
    @Expose
    public Data data;


    @Override
    public String toString() {
        return "Employeelogin{" +
                "statusCode=" + statusCode +
                ", statusText='" + statusText + '\'' +
                ", data=" + data +
                '}';
    }
}
