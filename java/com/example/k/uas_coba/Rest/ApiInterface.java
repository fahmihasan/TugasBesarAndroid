package com.example.k.uas_coba.Rest;

import com.example.k.uas_coba.Models.EventModel;
import com.example.k.uas_coba.Models.EventRespon;
import com.example.k.uas_coba.Models.LoginRespon;
import com.example.k.uas_coba.Models.User;
import com.example.k.uas_coba.Models.WahanaRespon;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("Wahana_Rest/wahana")
    Call<WahanaRespon> getWahana();

    @GET("Event_Rest/event")
    Call<EventRespon> getEvent();

    @FormUrlEncoded
    @POST("Login_Rest/login")
    Call<LoginRespon> getLogin(@Field("username") String username,
                               @Field("password") String password);

    @FormUrlEncoded
    @POST("Register_Rest")
    Call<User> postUser (
            @Field("email_user") String email_user,
            @Field("nama_user") String nama_user,
            @Field("password") String password,
            @Field("username") String username,
            @Field("handphone_user") String handphone_user);

}


