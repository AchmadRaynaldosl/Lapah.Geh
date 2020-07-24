package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.R;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;

public class PahwangData {

    private static int[] image_pahwang = {
            R.drawable.pahwang1,
            R.drawable.pahwang2,
            R.drawable.pahwang3
    };

    public static void prepareData(Context context){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        DetailWisataEntity detailWisataEntity = new DetailWisataEntity();
        for (int i = 0; i < image_pahwang.length; i++){
            detailWisataEntity.setImg_pahwang(image_pahwang[i]);
            appDatabase.appDao().addDetailPahwang(detailWisataEntity);
        }
    }
}
