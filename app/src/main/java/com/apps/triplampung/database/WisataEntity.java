package com.apps.triplampung.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_wisata")
public class WisataEntity {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id_wisata")
    private int id_wisata;
    @ColumnInfo(name = "wisata")
    private String wisata;
    @ColumnInfo(name = "info_wisata")
    private String info_wisata;
    @ColumnInfo(name = "lokasi_wisata")
    private String lokasi_wisata;

    public String getLokasi_wisata() {
        return lokasi_wisata;
    }

    public void setLokasi_wisata(String lokasi_wisata) {
        this.lokasi_wisata = lokasi_wisata;
    }

    public String getInfo_wisata() {
        return info_wisata;
    }

    public void setInfo_wisata(String info_wisata) {
        this.info_wisata = info_wisata;;
    }

    public int getId_wisata() {
        return id_wisata;
    }

    public void setId_wisata(int id_wisata) {
        this.id_wisata = id_wisata;
    }

    public String getWisata() {
        return wisata;
    }

    public void setWisata(String wisata) {
        this.wisata = wisata;
    }
}

