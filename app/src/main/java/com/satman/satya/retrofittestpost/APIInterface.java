package com.satman.satya.retrofittestpost;

import com.satman.satya.retrofittestpost.MyPojo.UserList;
import com.satman.satya.retrofittestpost.pojo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by satya on 27-11-2017.
 */

public interface APIInterface {

    @POST("/api/users")
    Call<User> createUser(@Body User user);



    @FormUrlEncoded
    @POST("/RestserviceAPI/employeelogin?")
    Call<UserList> doCreateUserWithField(@Field("employeeuniqueid") String name, @Field("password") String job);







}


