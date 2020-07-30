package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.R;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;
import com.apps.triplampung.database.GalleryEntity;

public class GalleryData {

    private static int[] image_gallery = {
            R.drawable.puncakmas1,
            R.drawable.puncakmas2,
            R.drawable.puncakmas3,
            R.drawable.puncakmas4,
            R.drawable.pahwang1,
            R.drawable.pahwang2,
            R.drawable.pahwang3,
            R.drawable.gigihiu1,
            R.drawable.gigihiu2,
            R.drawable.gigihiu3,
            R.drawable.gigihiu4,
            R.drawable.taman1,
            R.drawable.taman2,
            R.drawable.taman3,
            R.drawable.tanjung1,
            R.drawable.tanjung2,
            R.drawable.tanjung3,
            R.drawable.tanjung4,

    };

    public static void prepareData(Context context){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        GalleryEntity galleryEntity = new GalleryEntity();
        for (int i = 0; i < image_gallery.length; i++){
            galleryEntity.setImage_gallery(image_gallery[i]);
            appDatabase.appDao().addImageGallery(galleryEntity);
        }
    }
}
