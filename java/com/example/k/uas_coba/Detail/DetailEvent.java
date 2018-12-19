package com.example.k.uas_coba.Detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k.uas_coba.R;
import com.example.k.uas_coba.Rest.ApiClient;
import com.squareup.picasso.Picasso;

public class DetailEvent extends AppCompatActivity {
    ImageView imgEvent;
    TextView txtNama, txtDeskripsi, txtJadwal, txtPoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event);

        Intent i = getIntent();

        imgEvent = findViewById(R.id.detailevent_imgevent);
        txtNama = findViewById(R.id.detailevent_nama);
        txtDeskripsi = findViewById(R.id.detailevent_deskripsi);
        txtJadwal = findViewById(R.id.detailevent_jadwal);
        txtPoin = findViewById(R.id.detailevent_poin);

        Picasso.with(getApplicationContext()).load(ApiClient.BASE_IMG+i.getStringExtra("foto_event")).into(imgEvent);
        txtNama.setText(i.getStringExtra("nama_event"));
        txtDeskripsi.setText(i.getStringExtra("deskripsi_event"));
        txtPoin.setText(i.getStringExtra("poin_event"));
        txtJadwal.setText(i.getStringExtra("jadwal_event"));
    }
}
