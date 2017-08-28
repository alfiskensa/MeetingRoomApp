package com.kementan.pusdatin.meetingroomapp.models;

/**
 * Created by PUSDATIN15 on 8/24/2017.
 */

public class User {
    private int id;
    private String name;
    private String email;
    private String jabatan;
    private String password;

    public User(String name, String email, String password, String jabatan) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.jabatan = jabatan;
    }

    public User(int id, String name, String email, String jabatan){
        this.id = id;
        this.name = name;
        this.email = email;
        this.jabatan = jabatan;
    }

    public User(int id, String name, String email, String password,  String jabatan) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.jabatan = jabatan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getJabatan() {
        return jabatan;
    }
}
