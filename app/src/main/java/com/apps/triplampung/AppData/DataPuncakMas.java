package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.R;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;

public class DataPuncakMas {

    private static int[] image_puncakmas = {
            R.drawable.puncakmas1,
            R.drawable.puncakmas2,
            R.drawable.puncakmas3,
            R.drawable.puncakmas4
    };

    public static void prepareData(Context context){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        DetailWisataEntity detailWisataEntity = new DetailWisataEntity();
        for (int i = 0; i < image_puncakmas.length; i++){
            detailWisataEntity.setImg_puncakmas(image_puncakmas[i]);
            appDatabase.appDao().addDetailPuncakMas(detailWisataEntity);
        }
    }
}
