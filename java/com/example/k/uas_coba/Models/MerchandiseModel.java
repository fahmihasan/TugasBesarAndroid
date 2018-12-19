package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

public class MerchandiseModel
{
    @SerializedName("id_merchandise") private Integer id_merchandise;
    @SerializedName("nama_merchandise") private String nama_merchandise;
    @SerializedName("deskripsi_merchandise") private String deskripsi_merchandise;
    @SerializedName("harga_merchandise") private String harga_merchandise;
    @SerializedName("poin_merchandise") private String poin_merchandise;
    @SerializedName("foto_merchandise") private String foto_merchandise;

    public MerchandiseModel(Integer id_merchandise, String nama_merchandise, String deskripsi_merchandise, String harga_merchandise, String poin_merchandise, String foto_merchandise)
    {
        this.id_merchandise = id_merchandise;
        this.nama_merchandise = nama_merchandise;
        this.deskripsi_merchandise = deskripsi_merchandise;
        this.harga_merchandise = harga_merchandise;
        this.poin_merchandise = poin_merchandise;
        this.foto_merchandise = foto_merchandise;
    }

    public Integer getId_merchandise() {
        return id_merchandise;
    }

    public void setId_merchandise(Integer id_merchandise) {
        this.id_merchandise = id_merchandise;
    }


    public String getNama_merchandise() {
        return nama_merchandise;
    }

    public void setNama_merchandise(String nama_merchandise) {
        this.nama_merchandise = nama_merchandise;
    }


    public String getDeskripsi_merchandise() {
        return deskripsi_merchandise;
    }

    public void setDeskripsi_merchandise(String deskripsi_merchandise) {
        this.deskripsi_merchandise = deskripsi_merchandise;
    }


    public String getHarga_merchandise() {
        return harga_merchandise;
    }

    public void setHarga_merchandise(String harga_merchandise) {
        this.harga_merchandise = harga_merchandise;
    }


    public String getPoin_merchandise() {
        return poin_merchandise;
    }

    public void setPoin_merchandise(String poin_merchandise) {
        this.poin_merchandise = poin_merchandise;
    }


    public String getFoto_merchandise() {
        return foto_merchandise;
    }

    public void setFoto_merchandise(String foto_merchandise) {
        this.foto_merchandise = foto_merchandise;
    }
}
