package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

public class FasilitasModel
{
    @SerializedName("id_fasilitas") private Integer id_fasilitas;
    @SerializedName("nama_fasilitas") private String nama_fasilitas;
    @SerializedName("deskripsi_fasilitas") private String deskripsi_fasilitas;
    @SerializedName("latitude_fasilitas") private Double latitude_fasilitas;
    @SerializedName("longitude_fasilitas") private Double longitude_fasilitas;
    @SerializedName("foto_fasilitas") private String foto_fasilitas;

    public FasilitasModel(Integer id_fasilitas, String nama_fasilitas, String deskripsi_fasilitas, Double latitude_fasilitas, Double longitude_fasilitas, String foto_fasilitas)
    {
        this.id_fasilitas = id_fasilitas;
        this.nama_fasilitas = nama_fasilitas;
        this.deskripsi_fasilitas = deskripsi_fasilitas;
        this.latitude_fasilitas = latitude_fasilitas;
        this.longitude_fasilitas = longitude_fasilitas;
        this.foto_fasilitas = foto_fasilitas;
    }

    public Integer getId_fasilitas() {
        return id_fasilitas;
    }

    public void setId_fasilitas(Integer id_fasilitas) {
        this.id_fasilitas = id_fasilitas;
    }


    public String getNama_fasilitas() {
        return nama_fasilitas;
    }

    public void setNama_fasilitas(String nama_fasilitas) {
        this.nama_fasilitas = nama_fasilitas;
    }


    public String getDeskripsi_fasilitas() {
        return deskripsi_fasilitas;
    }

    public void setDeskripsi_fasilitas(String deskripsi_fasilitas) {
        this.deskripsi_fasilitas = deskripsi_fasilitas;
    }


    public Double getLatitude_fasilitas() {
        return latitude_fasilitas;
    }

    public void setLatitude_fasilitas(Double latitude_fasilitas) {
        this.latitude_fasilitas = latitude_fasilitas;
    }


    public Double getLongitude_fasilitas() {
        return longitude_fasilitas;
    }

    public void setLongitude_fasilitas(Double longitude_fasilitas) {
        this.longitude_fasilitas = longitude_fasilitas;
    }


    public String getFoto_fasilitas() {
        return foto_fasilitas;
    }

    public void setFoto_fasilitas(String foto_fasilitas) {
        this.foto_fasilitas = foto_fasilitas;
    }
}
