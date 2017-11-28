package com.satman.satya.retrofittestpost;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.satman.satya.retrofittestpost.MyPojo.UserList;
import com.satman.satya.retrofittestpost.pojo.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    //reference for code : https://www.journaldev.com/13639/retrofit-android-example-tutorial
    //site to convert json to pojo:   http://www.jsonschema2pojo.org/
    TextView tvtest2;
    APIInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvtest2 = (TextView) findViewById(R.id.tvtest2);
        apiInterface = APIClient.getClient().create(APIInterface.class);



        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();
        pDialog.setCancelable(false);

        Call<UserList> call3 = apiInterface.doCreateUserWithField("sa1111","1111");
        call3.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

                pDialog.cancel();

                UserList userList = response.body();

                int scode = userList.employeelogin.statusCode;
                String stext = userList.employeelogin.statusText;
                Toast.makeText(getApplicationContext(), "Status code :"+scode+"\n status text :"+stext,Toast.LENGTH_SHORT).show();
               /* Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List<UserList.Datum> datumList = userList.data;
                Toast.makeText(getApplicationContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

                for (UserList.Datum datum : datumList) {
                    Toast.makeText(getApplicationContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
                }*/


                tvtest2.append("\n"+userList.toString());

            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                call.cancel();
                pDialog.cancel();

            }
        });








        /**
         Create new user
         **/
       /* User user = new User("morpheus", "leader");
        Call<User> call1 = apiInterface.createUser(user);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user1 = response.body();

                Toast.makeText(getApplicationContext(), user1.name + " " + user1.job + " " + user1.id + " " + user1.createdAt, Toast.LENGTH_SHORT).show();

                tvtest2.setText(user1.name + " " + user1.job + " " + user1.id + " " + user1.createdAt);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
            }
        });*/










        /**
         POST name and job Url encoded.
         **/
       /* Call<User> call3 = apiInterface.doCreateUserWithField("morpheus","leader");
        call3.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User userList = response.body();
                String id = userList.id;
                String createddate = userList.createdAt;
                Integer totalPages = userList.totalPages;
                List<UserList.Datum> datumList = userList.data;
                Toast.makeText(getApplicationContext(), "Id :"+id+"\n created date :"+createddate, Toast.LENGTH_SHORT).show();

                for (UserList.Datum datum : datumList) {
                    Toast.makeText(getApplicationContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
                    tvtest2.setText("id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar);
                }

                tvtest2.append("\n\n Id :"+id+"\n created date :"+createddate);


            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
            }
        });*/
















    }
}
