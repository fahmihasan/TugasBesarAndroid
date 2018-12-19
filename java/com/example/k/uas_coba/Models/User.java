package com.example.k.uas_coba.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by k on 11/12/2018.
 */

public class User {
    @SerializedName("id_user") private Integer id_user;
    @SerializedName("username") private String username;
    @SerializedName("password") private String password;
    @SerializedName("level") private Integer level;
    @SerializedName("nama_user") private String nama_user;
    @SerializedName("email_user") private String email_user;
    @SerializedName("handphone_user") private String handphone_user;
    @SerializedName("poin_user") private String poin_user;
    @SerializedName("foto_user") private String foto_user;

    public User(Integer id_user, String username, String password, Integer level, String nama_user, String email_user, String handphone_user, String poin_user, String foto_user) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.level = level;
        this.nama_user = nama_user;
        this.email_user = email_user;
        this.handphone_user = handphone_user;
        this.poin_user = poin_user;
        this.foto_user = foto_user;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getHandphone_user() {
        return handphone_user;
    }

    public void setHandphone_user(String handphone_user) {
        this.handphone_user = handphone_user;
    }

    public String getPoin_user() {
        return poin_user;
    }

    public void setPoin_user(String poin_user) {
        this.poin_user = poin_user;
    }

    public String getFoto_user() {
        return foto_user;
    }

    public void setFoto_user(String foto_user) {
        this.foto_user = foto_user;
    }
}
