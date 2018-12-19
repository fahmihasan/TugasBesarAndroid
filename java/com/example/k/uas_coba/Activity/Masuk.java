package com.example.k.uas_coba.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.k.uas_coba.Models.LoginRespon;
import com.example.k.uas_coba.Models.User;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.example.k.uas_coba.Rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Masuk extends AppCompatActivity
{
    Button btnMasuk, btnDaftar;


    EditText edtPassword, edtUsername;
//
    ApiInterface mApiInterface;
//
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        btnMasuk=findViewById(R.id.masuk_btnMasuk);
        btnDaftar=findViewById(R.id.masuk_btnDaftar);
        edtUsername=(EditText) findViewById(R.id.masuk_edtUsername);
        edtPassword=(EditText) findViewById(R.id.masuk_edtPassword);

//        btnMasuk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), Beranda.class);
//                startActivity(i);
//                }
//            });


        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mApiInterface= ApiClient.getClient().create(ApiInterface.class);
                Call<LoginRespon> getLogin=mApiInterface.getLogin(edtUsername.getText().toString(),edtPassword.getText().toString());
                getLogin.enqueue(new Callback<LoginRespon>() {
                    @Override
                    public void onResponse(retrofit2.Call<LoginRespon> call, Response<LoginRespon> response) {
//                        Log.e("Stats",response.body().getStatus());
                        String status = response.body().getStatus();
                        if (status.equals("success")){
                            User user = response.body().getUser();
                            Intent i = new Intent(getApplicationContext(), Beranda.class);
                            Toast.makeText(getApplicationContext(), "User :"+user.getUsername(), Toast.LENGTH_LONG).show();
                            startActivity(i);
                        }
                    }

                    @Override
                    public void onFailure(retrofit2.Call<LoginRespon> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"Server Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Daftar.class);
                startActivity(i);
            }
        });

    }
}
