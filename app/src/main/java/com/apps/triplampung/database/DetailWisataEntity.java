package com.apps.triplampung.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_detail_wisata")
public class DetailWisataEntity {

    @PrimaryKey
    @ColumnInfo(name = "img_puncakmas")
    private int img_puncakmas;
    @ColumnInfo(name = "img_pahwang")
    private int img_pahwang;

    public int getImg_puncakmas() {
        return img_puncakmas;
    }

    public void setImg_puncakmas(int img_puncakmas) {
        this.img_puncakmas = img_puncakmas;
    }

    public int getImg_pahwang() {
        return img_pahwang;
    }

    public void setImg_pahwang(int img_pahwang) {
        this.img_pahwang = img_pahwang;
    }
}
