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

