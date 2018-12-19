package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WahanaRespon
{
    @SerializedName("status") private String status;
    @SerializedName("result") private List<WahanaModel> wahanaModelList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<WahanaModel> getWahanaModelList() {
        return wahanaModelList;
    }

    public void setWahanaModelList(List<WahanaModel> wahanaModelList) { this.wahanaModelList = wahanaModelList; }
}
