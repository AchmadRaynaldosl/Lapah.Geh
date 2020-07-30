package com.apps.triplampung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ShowFotoWisata extends AppCompatActivity {

    ImageView img_wisata;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_foto_wisata);

        toolbar = findViewById(R.id.toolbarGallery2);
        toolbar.setTitle("Gallery Wisata");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int image = getIntent().getExtras().getInt("image");

        img_wisata = findViewById(R.id.img_wisata);

        Picasso.with(getApplicationContext())
                .load(image)
                .into(img_wisata);
    }
}