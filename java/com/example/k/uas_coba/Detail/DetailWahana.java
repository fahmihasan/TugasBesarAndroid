package com.example.k.uas_coba.Detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k.uas_coba.Map.MapsWahana;
import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.squareup.picasso.Picasso;

public class DetailWahana extends AppCompatActivity
{
    ImageView img_Wahana;
    TextView txt_NamaWahana, txt_Deskripsi, txt_Jadwal, txt_Poin;
    Button btn_Map, btn_Poin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wahana);

        Intent i = getIntent();

        img_Wahana = findViewById(R.id.detailwahana_imgwahana);
        txt_NamaWahana = findViewById(R.id.detailwahana_namawahana);
        txt_Deskripsi = findViewById(R.id.detailwahana_deskripsi);
        txt_Jadwal = findViewById(R.id.detailwahana_jadwal);
        txt_Poin = findViewById(R.id.detailwahana_poin);
        btn_Map = findViewById(R.id.detailwahana_viewmap);

        Picasso.with(getApplicationContext()).load(ApiClient.BASE_IMG+i.getStringExtra("foto_wahana")).into(img_Wahana);
        txt_NamaWahana.setText(i.getStringExtra("nama_wahana"));
        txt_Deskripsi.setText(i.getStringExtra("deskripsi_wahana"));
        txt_Jadwal.setText(i.getStringExtra("jadwal_wahana"));
        txt_Poin.setText(i.getStringExtra("poin_wahana"));

        btn_Map.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), MapsWahana.class);
                startActivity(i);
            }
        });

    }
}
