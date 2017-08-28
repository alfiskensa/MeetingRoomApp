package com.kementan.pusdatin.meetingroomapp.models;

/**
 * Created by PUSDATIN15 on 8/28/2017.
 */

public class RoomResponse {
    private boolean error;
    private String message;

    public RoomResponse(){}

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
