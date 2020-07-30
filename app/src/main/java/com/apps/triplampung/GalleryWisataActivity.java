package com.apps.triplampung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.res.Configuration;
import android.os.Bundle;

import com.apps.triplampung.Adapter.GalleryAdapter;
import com.apps.triplampung.AppData.GalleryData;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.GalleryEntity;

import java.util.ArrayList;
import java.util.List;

public class GalleryWisataActivity extends AppCompatActivity {

    List<GalleryEntity> listGallery;
    RecyclerView recyclerView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_wisata);

        toolbar = findViewById(R.id.toolbarGallery1);
        toolbar.setTitle("Gallery Wisata");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        GalleryData.prepareData(getApplicationContext());

        listGallery = appDatabase.appDao().showImageGallery();

        recyclerView = findViewById(R.id.recyclerview_gallery);
        if (getBaseContext().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),4));
        }

        recyclerView.setAdapter(new GalleryAdapter(getApplicationContext(), listGallery));
    }
}