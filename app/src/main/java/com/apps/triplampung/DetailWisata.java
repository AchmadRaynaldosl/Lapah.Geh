package com.apps.triplampung;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Build;
import android.os.Bundle;

import com.apps.triplampung.Adapter.PuncakMasAdapter;
import com.apps.triplampung.AppData.DataPuncakMas;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class DetailWisata extends AppCompatActivity {
    String title;
    int id;
    ArrayList<DetailWisataEntity> detailWisataEntities = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        title = Objects.requireNonNull(getIntent().getExtras()).getString("title");
        id = Objects.requireNonNull(getIntent().getExtras()).getInt("id");

        Toolbar toolbar = findViewById(R.id.toolbar_detail);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        if (id == 0){
            DataPuncakMas.prepareData(getApplicationContext());

            detailWisataEntities.addAll(Arrays.asList(appDatabase.appDao().showDetailPuncakMas()));

            RecyclerView recyclerView = findViewById(R.id.recycler_view_detail);
            RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);

            RecyclerView.Adapter adapter = new PuncakMasAdapter(getApplicationContext(), detailWisataEntities);
            recyclerView.setAdapter(adapter);
        }
    }
}