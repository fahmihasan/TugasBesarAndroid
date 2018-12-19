package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FasilitasRespon
{
    @SerializedName("status") private String status;
    @SerializedName("result") private List<FasilitasModel> fasilitasModelList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<FasilitasModel> getFasilitasModelList() {
        return fasilitasModelList;
    }

    public void setFasilitasModelList(List<FasilitasModel> fasilitasModelList) {this.fasilitasModelList = fasilitasModelList;}
}
