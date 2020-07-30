package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.R;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;

public class ImageWisataData {

    private static int[] image_puncakmas = {
            R.drawable.puncakmas1,
            R.drawable.puncakmas2,
            R.drawable.puncakmas3,
            R.drawable.puncakmas4
    };

    private static int[] image_pahwang = {
            R.drawable.pahwang1,
            R.drawable.pahwang2,
            R.drawable.pahwang3,
            R.drawable.pahwang4
    };

    public static void prepareData(Context context, int id){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        DetailWisataEntity detailWisataEntity = new DetailWisataEntity();
        if (id == 0){
            for (int i = 0; i < image_puncakmas.length; i++) {
                detailWisataEntity.setImg_puncakmas(image_puncakmas[i]);
                appDatabase.appDao().addDetailPuncakMas(detailWisataEntity);
            }
        }else if (id == 1){
            for (int i = 0; i < image_pahwang.length; i++){
                detailWisataEntity.setImg_pahwang(image_pahwang[i]);
                appDatabase.appDao().addDetailPahwang(detailWisataEntity);
            }
        }
    }
}