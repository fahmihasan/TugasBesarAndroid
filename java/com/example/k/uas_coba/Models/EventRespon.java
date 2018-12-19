package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventRespon {
    @SerializedName("status") private String status;
    @SerializedName("result") private List<EventModel> eventModelList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EventModel> getEventModelList() {
        return eventModelList;
    }

    public void setEventModelList(List<EventModel> eventModelList) {this.eventModelList = eventModelList;}
}
