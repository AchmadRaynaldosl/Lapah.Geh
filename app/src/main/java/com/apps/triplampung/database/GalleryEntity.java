package com.apps.triplampung.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_gallery")
public class GalleryEntity {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "image_gallery")
    private int image_gallery;

    public int getImage_gallery(){
        return image_gallery;
    }

    public void setImage_gallery(int image_gallery) {
        this.image_gallery = image_gallery;
    }
}
