package com.example.k.uas_coba.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.k.uas_coba.Adapters.wahana_adapter;
import com.example.k.uas_coba.Models.WahanaModel;
import com.example.k.uas_coba.Models.WahanaRespon;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.example.k.uas_coba.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class Wahana extends AppCompatActivity
{
    private List<WahanaModel> mWahanaModel = new ArrayList<>();
    private RecyclerView.LayoutManager laymanager;

    ImageView img_Wahana, img_Beranda;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana);

        initRecyclerview();

        img_Wahana = (ImageView) findViewById(R.id.itemWahana_imgWahana);

        img_Beranda = findViewById(R.id.beranda_wahana);

        img_Beranda.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), Beranda.class);
                startActivity(i);
            }
        });
    }

    private void  initRecyclerview()
    {
        laymanager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        final RecyclerView mRecyclerView = findViewById(R.id.wahana_recyclerview);
        mRecyclerView.setLayoutManager(laymanager);

        mRecyclerView.setHasFixedSize(true);

        ApiInterface apiService=ApiClient.getClient().create(ApiInterface.class);
        retrofit2.Call<WahanaRespon> call = apiService.getWahana();

        call.enqueue(new Callback<WahanaRespon>()
        {
            @Override
            public void onResponse(retrofit2.Call<WahanaRespon> call, Response<WahanaRespon> response)
            {
                mWahanaModel = response.body().getWahanaModelList();

                Log.e("Pesan",response.body().getStatus());

                mRecyclerView.setAdapter(new wahana_adapter(mWahanaModel,getApplicationContext()));
            }

            @Override
            public void onFailure(retrofit2.Call<WahanaRespon> call, Throwable t)
            {
                Log.e("Error",t.toString());
            }
        });
    }
}
