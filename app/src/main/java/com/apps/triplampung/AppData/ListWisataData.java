package com.apps.triplampung.AppData;

import android.content.Context;

import androidx.room.Room;

import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.WisataEntity;

public class ListWisataData {

    private static final String[] wisata = {
            "Puncak Mas",
            "Pahawang",
            "Lembah Hijau",
            "Pantai Gigi Hiu"
    };

    public static void prepareData(Context context){
        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        WisataEntity wisataEntity = new WisataEntity();
        for (int i = 0; i < wisata.length; i++){
            wisataEntity.setId_wisata(i);
            appDatabase.appDao().addIdWisata(wisataEntity);
            wisataEntity.setWisata(wisata[i]);
            appDatabase.appDao().addWisata(wisataEntity);
        }
    }
}
