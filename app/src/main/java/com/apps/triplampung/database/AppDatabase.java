package com.apps.triplampung.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {WisataEntity.class, DetailWisataEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AppDao appDao();
}