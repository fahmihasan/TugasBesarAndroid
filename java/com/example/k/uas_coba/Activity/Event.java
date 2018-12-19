package com.example.k.uas_coba.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.k.uas_coba.Adapters.event_adapter;
import com.example.k.uas_coba.Models.*;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.example.k.uas_coba.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class Event extends AppCompatActivity {

    private List<EventModel> mEvent = new ArrayList<>();
    private RecyclerView.LayoutManager laymanager;

    ImageView img_event,beranda;
    Button btnBeranda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        initRecyclerview();

        img_event = (ImageView) findViewById(R.id.img_itemEvent);

        beranda=findViewById(R.id.beranda_event);

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Beranda.class);
                startActivity(i);
            }
        });
    }

    private void initRecyclerview() {
        laymanager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        final RecyclerView recyclerViewww = findViewById(R.id.event_recyclerview);
        recyclerViewww.setLayoutManager(laymanager);

        recyclerViewww.setHasFixedSize(true);

        ApiInterface apiService= ApiClient.getClient().create(ApiInterface.class);
        retrofit2.Call<EventRespon> call = apiService.getEvent();

        call.enqueue(new Callback<EventRespon>() {
            @Override
            public void onResponse(retrofit2.Call<EventRespon> call, Response<EventRespon> response) {
                mEvent= response.body().getEventModelList();

                Log.e("Pesan",response.body().getStatus());

                recyclerViewww.setAdapter(new event_adapter(mEvent,getApplicationContext()));

            }

            @Override
            public void onFailure(retrofit2.Call<EventRespon> call, Throwable t) {
                Log.e("Error",t.toString());
            }
        });
    }
}
