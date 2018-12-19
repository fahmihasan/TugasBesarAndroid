package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KedaiRespon
{
    @SerializedName("status") private String status;
    @SerializedName("result") private List<KedaiModel> kedaiModelList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<KedaiModel> getKedaiModelList() {
        return kedaiModelList;
    }

    public void setKedaiModelList(List<KedaiModel> kedaiModelList) {this.kedaiModelList = kedaiModelList;}
}
