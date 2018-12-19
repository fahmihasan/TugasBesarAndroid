package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

public class EventModel
{
    @SerializedName("id_event") private Integer id_event;
    @SerializedName("nama_event") private String nama_event;
    @SerializedName("deskripsi_event") private String deskripsi_event;
    @SerializedName("jadwal_event") private String jadwal_event;
    @SerializedName("poin_event") private String poin_event;
    @SerializedName("foto_event") private String foto_event;

    public EventModel(Integer id_event, String nama_event, String deskripsi_event, String jadwal_event, String poin_event, String foto_event)
    {
        this.id_event = id_event;
        this.nama_event = nama_event;
        this.deskripsi_event = deskripsi_event;
        this.jadwal_event = jadwal_event;
        this.poin_event = poin_event;
        this.foto_event = foto_event;
    }

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }


    public String getNama_event() {
        return nama_event;
    }

    public void setNama_event(String nama_event) {
        this.nama_event = nama_event;
    }


    public String getDeskripsi_event() {
        return deskripsi_event;
    }

    public void setDeskripsi_event(String deskripsi_event) {
        this.deskripsi_event = deskripsi_event;
    }


    public String getJadwal_event() {
        return jadwal_event;
    }

    public void setJadwal_event(String jadwal_event) {
        this.jadwal_event = jadwal_event;
    }


    public String getPoin_event() {
        return poin_event;
    }

    public void setPoin_event(String poin_event) {
        this.poin_event = poin_event;
    }


    public String getFoto_event() {
        return foto_event;
    }

    public void setFoto_event(String foto_event) {
        this.foto_event = foto_event;
    }
}
