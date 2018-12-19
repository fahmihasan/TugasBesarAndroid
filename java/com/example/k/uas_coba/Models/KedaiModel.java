package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

public class KedaiModel
{
    @SerializedName("id_kedai") private Integer id_kedai;
    @SerializedName("nama_kedai") private String nama_kedai;
    @SerializedName("deskripsi_kedai") private String deskripsi_kedai;
    @SerializedName("latitude_kedai") private Double latitude_kedai;
    @SerializedName("longitude_kedai") private Double longitude_kedai;
    @SerializedName("foto_kedai") private String foto_kedai;

    public KedaiModel(Integer id_kedai, String nama_kedai, String deskripsi_kedai, Double latitude_kedai, Double longitude_kedai, String foto_kedai)
    {
        this.id_kedai = id_kedai;
        this.nama_kedai = nama_kedai;
        this.deskripsi_kedai = deskripsi_kedai;
        this.latitude_kedai = latitude_kedai;
        this.longitude_kedai = longitude_kedai;
        this.foto_kedai = foto_kedai;
    }

    public Integer getId_kedai() {
        return id_kedai;
    }

    public void setId_kedai(Integer id_kedai) {
        this.id_kedai = id_kedai;
    }


    public String getNama_kedai() {
        return nama_kedai;
    }

    public void setNama_kedai(String nama_kedai) {
        this.nama_kedai = nama_kedai;
    }


    public String getDeskripsi_kedai() {
        return deskripsi_kedai;
    }

    public void setDeskripsi_kedai(String deskripsi_kedai) {
        this.deskripsi_kedai = deskripsi_kedai;
    }


    public Double getLatitude_kedai() {
        return latitude_kedai;
    }

    public void setLatitude_kedai(Double latitude_kedai) {
        this.latitude_kedai = latitude_kedai;
    }


    public Double getLongitude_kedai() {
        return longitude_kedai;
    }

    public void setLongitude_kedai(Double longitude_kedai) {
        this.longitude_kedai = longitude_kedai;
    }


    public String getFoto_kedai() {
        return foto_kedai;
    }

    public void setFoto_kedai(String foto_kedai) {
        this.foto_kedai = foto_kedai;
    }
}
