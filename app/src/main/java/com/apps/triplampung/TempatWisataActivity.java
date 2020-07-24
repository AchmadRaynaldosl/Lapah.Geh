package com.apps.triplampung;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Build;
import android.os.Bundle;

import com.apps.triplampung.Adapter.WisataAdapter;
import com.apps.triplampung.AppData.ListWisataData;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.WisataEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TempatWisataActivity extends AppCompatActivity {
    Toolbar toolbar;
    ArrayList<WisataEntity> wisataEntity = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_wisata);

        toolbar = findViewById(R.id.toolbarWisata);
        toolbar.setTitle("Tempat Wisata");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        ListWisataData.prepareData(getApplicationContext());

        wisataEntity.addAll(Arrays.asList(appDatabase.appDao().showWisata()));

        RecyclerView recyclerView = findViewById(R.id.listWisata);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.Adapter wisataAdapter = new WisataAdapter(getApplicationContext(), wisataEntity);
        recyclerView.setAdapter(wisataAdapter);
    }
}