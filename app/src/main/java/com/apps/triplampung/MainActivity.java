package com.apps.triplampung;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apps.triplampung.Preference.Preferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = findViewById(R.id.exit);
        CardView cardWisata = findViewById(R.id.card_wisata);
        CardView cardGallery = findViewById(R.id.card_gallery);

        cardWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TempatWisataActivity.class));
            }
        });

        cardGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalleryWisataActivity.class));
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder.setTitle("Keluar");

        dialogBuilder.setMessage("Keluar dari aplikasi?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Preferences.setLogOut(getBaseContext());
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alertDialog = dialogBuilder.create();

        alertDialog.show();
    }
}