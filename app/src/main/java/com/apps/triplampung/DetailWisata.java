package com.apps.triplampung;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.apps.triplampung.Adapter.PahwangAdapter;
import com.apps.triplampung.Adapter.PuncakMasAdapter;
import com.apps.triplampung.AppData.ImageWisataData;
import com.apps.triplampung.AppData.PahwangData;
import com.apps.triplampung.database.AppDatabase;
import com.apps.triplampung.database.DetailWisataEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DetailWisata extends AppCompatActivity {
    String title, info_wisata,lokasi;
    int id;
    RecyclerView recyclerView;
    TextView txtInfo, txtLokasi;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        title = Objects.requireNonNull(getIntent().getExtras()).getString("title");
        id = Objects.requireNonNull(getIntent().getExtras()).getInt("id");
        info_wisata = Objects.requireNonNull(getIntent().getExtras().getString("info_wisata"));
        lokasi = getIntent().getExtras().getString("lokasi");

        recyclerView = findViewById(R.id.recycler_view_detail);
        txtInfo = findViewById(R.id.txtInfo);
        txtLokasi = findViewById(R.id.txtLokasi);

        Toolbar toolbar = findViewById(R.id.toolbar_detail);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();

        if (id == 0){
            txtInfo.setText(info_wisata);
            txtLokasi.setText(lokasi);

            ImageWisataData.prepareData(getApplicationContext(),id);

            List<DetailWisataEntity> list1 = appDatabase.appDao().showImage();

            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setAdapter(new PuncakMasAdapter(getApplicationContext(), list1));

        } else if (id == 1){
            txtInfo.setText(info_wisata);
            txtLokasi.setText(lokasi);

            ImageWisataData.prepareData(getApplicationContext(),id);

            List<DetailWisataEntity> list2 = appDatabase.appDao().showImage();

            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setAdapter(new PahwangAdapter(getApplicationContext(), list2));

            } else if (id == 2){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);

            } else if (id == 3){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);

            }else if (id == 4){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);

            }else if (id == 5){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);
            }else if (id == 6){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);
            }else if (id == 7){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);
            }else if (id == 8){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);
            }else if (id == 9){
                txtInfo.setText(info_wisata);
                txtLokasi.setText(lokasi);
            }


    }
}