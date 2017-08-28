package com.kementan.pusdatin.meetingroomapp.models;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PUSDATIN15 on 8/24/2017.
 */

public class ResultUser {
    @SerializedName("error")
    private Boolean error;

    @SerializedName("message")
    private String message;

    @SerializedName("user")
    private User user;

    public ResultUser(Boolean error, String message, User user) {
        this.error = error;
        this.message = message;
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
