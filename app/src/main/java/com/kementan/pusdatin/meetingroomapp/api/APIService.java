package com.kementan.pusdatin.meetingroomapp.api;

import com.kementan.pusdatin.meetingroomapp.models.ResultUser;
import com.kementan.pusdatin.meetingroomapp.models.Rooms;
import com.kementan.pusdatin.meetingroomapp.models.User;
import com.kementan.pusdatin.meetingroomapp.models.Users;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by PUSDATIN15 on 8/24/2017.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("register")
    Call<ResultUser> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("jabatan") String jabatan);


    @FormUrlEncoded
    @POST("login")
    Call<ResultUser> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );


    @GET("rooms")
    Call<Rooms> getRooms();

    @FormUrlEncoded
    @POST("update/{id}")
    Call<ResultUser> updateUser(
            @Path("id") int id,
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("jabatan") String jabatan
    );

    @FormUrlEncoded
    @POST("update_password/{id}")
    Call<ResultUser> updatePassword(
            @Path("id") int id,
            @Field("oldpassword") String oldpassword,
            @Field("newpassword") String newpassword
    );
}
