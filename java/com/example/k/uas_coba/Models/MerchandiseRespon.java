package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MerchandiseRespon
{
    @SerializedName("status") private String status;
    @SerializedName("result") private List<MerchandiseModel> merchandiseModelList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MerchandiseModel> getMerchandiseModelList() {
        return merchandiseModelList;
    }

    public void setMerchandiseModelList(List<MerchandiseModel> merchandiseModelList) {this.merchandiseModelList = merchandiseModelList;}
}
