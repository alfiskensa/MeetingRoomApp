package com.kementan.pusdatin.meetingroomapp.models;

/**
 * Created by PUSDATIN15 on 8/28/2017.
 */

public class Room {
    private String kd_ruangan;
    private String nama_ruangan;
    private String kapasitas;

    public Room(String kd_ruangan, String nama_ruangan, String kapasitas){
        this.setKd_ruangan(kd_ruangan);
        this.setNama_ruangan(nama_ruangan);
        this.setKapasitas(kapasitas);
    }


    public String getKd_ruangan() {
        return kd_ruangan;
    }

    public void setKd_ruangan(String kd_ruangan) {
        this.kd_ruangan = kd_ruangan;
    }

    public String getNama_ruangan() {
        return nama_ruangan;
    }

    public void setNama_ruangan(String nama_ruangan) {
        this.nama_ruangan = nama_ruangan;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }
}


