package com.example.k.uas_coba.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.k.uas_coba.Models.LoginRespon;
import com.example.k.uas_coba.Models.User;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.example.k.uas_coba.Rest.ApiInterface;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Daftar extends AppCompatActivity {

    Button btnMasuk;
    EditText editNama, editEmail, editPassword, editUsername, editNo;
    Button buttonDaftar;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        btnMasuk=findViewById(R.id.daftar_btnMasuk);
        buttonDaftar=findViewById(R.id.daftar_btnDaftar);

        editEmail=findViewById(R.id.daftar_edtEmail);
        editNo=findViewById(R.id.daftar_edtHandphone);
        editNama=findViewById(R.id.daftar_edtNama);
        editUsername=findViewById(R.id.daftar_edtUsername);
        editPassword=findViewById(R.id.daftar_edtPassword);

        mApiInterface = ApiClient.getClient().create(ApiInterface.class);


        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<User> newUser = mApiInterface.postUser(editNama.getText().toString(), editPassword.getText().toString(), editEmail.getText().toString(), editUsername.getText().toString(), editNo.getText().toString());
                if(editEmail.getText().equals(null) && editPassword.getText().length()==0 && editNama.getText().length()==0 && editNo.getText().length()==0 && editUsername.getText().length()==0){
                    Toast.makeText(getApplicationContext(), "Tidak Boleh Ada Kolom Kosong, Harap Diisi!!!!!!", Toast.LENGTH_SHORT).show();
                }else{
                    newUser.enqueue(new Callback<User>() {
                        public void onResponse(Call<User> call, Response<User> response) {
                            Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(), Masuk.class);
                            startActivity(i);
                        }

                        @Override
                        public void onFailure(Call<User> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Beranda.class);
                startActivity(i);
            }
        });
    }
}