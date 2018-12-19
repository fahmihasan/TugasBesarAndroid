package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

public class WahanaModel
{
    @SerializedName("id_wahana") private Integer id_wahana;
    @SerializedName("nama_wahana") private String nama_wahana;
    @SerializedName("jadwal_wahana") private String jadwal_wahana;
    @SerializedName("deskripsi_wahana") private String deskripsi_wahana;
    @SerializedName("poin_wahana") private String poin_wahana;
    @SerializedName("latitude_wahana") private Double latitude_wahana;
    @SerializedName("longitude_wahana") private Double longitude_wahana;
    @SerializedName("foto_wahana") private String foto_wahana;

    public WahanaModel(Integer id_wahana, String nama_wahana, String deskripsi_wahana, String jadwal_wahana, String poin_wahana, Double latitude_wahana, Double longitude_wahana, String foto_wahana)
    {
        this.id_wahana = id_wahana;
        this.nama_wahana=nama_wahana;
        this.jadwal_wahana = jadwal_wahana;
        this.deskripsi_wahana=deskripsi_wahana;
        this.poin_wahana = poin_wahana;
        this.latitude_wahana = latitude_wahana;
        this.longitude_wahana = longitude_wahana;
        this.foto_wahana = foto_wahana;
    }

    public Integer getId_wahana() {
        return id_wahana;
    }

    public void setId_wahana(Integer id_wahana) {
        this.id_wahana = id_wahana;
    }


    public String getNama_wahana() {
        return nama_wahana;
    }

    public void setNama_wahana(String nama_wahana) {
        this.nama_wahana = nama_wahana;
    }


    public String getJadwal_wahana() {
        return jadwal_wahana;
    }

    public void setJadwal_wahana(String jadwal_wahana) {
        this.jadwal_wahana = jadwal_wahana;
    }


    public String getDeskripsi_wahana() {
        return deskripsi_wahana;
    }

    public void setDeskripsi_wahana(String deskripsi_wahana) {
        this.deskripsi_wahana = deskripsi_wahana;
    }


    public String getPoin_wahana() {
        return poin_wahana;
    }

    public void setPoin_wahana(String poin_wahana) {
        this.poin_wahana = poin_wahana;
    }


    public Double getLatitude_wahana() {
        return latitude_wahana;
    }

    public void setLatitude_wahana(Double latitude_wahana) {
        this.latitude_wahana = latitude_wahana;
    }


    public Double getLongitude_wahana() {
        return longitude_wahana;
    }

    public void setLongitude_wahana(Double longitude_wahana) {
        this.longitude_wahana = longitude_wahana;
    }


    public String getFoto_wahana() {
        return foto_wahana;
    }

    public void setFoto_wahana(String foto_wahana) {
        this.foto_wahana = foto_wahana;
    }
}