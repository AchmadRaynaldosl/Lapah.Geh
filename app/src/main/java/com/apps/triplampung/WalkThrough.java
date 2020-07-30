package com.apps.triplampung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.apps.triplampung.Adapter.WalkthroughAdapter;
import com.apps.triplampung.Preference.Preferences;
import com.apps.triplampung.model.WalkthroughModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class WalkThrough extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Button btnLanjut,btnMulai;
    private Animation btnMulaiAnimation;
    private WalkthroughAdapter walkthroughAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Preferences.getStatusLogin(getBaseContext())){
            Preferences.setFirstLogin(true, getBaseContext());
            startActivity(new Intent(WalkThrough.this, MainActivity.class));
            finish();
        }

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_walkthrough);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        btnLanjut = findViewById(R.id.btnLanjut);
        btnMulai = findViewById(R.id.btnMulai);
        btnMulaiAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animation);

        final List<WalkthroughModel> listItem = new ArrayList<>();
        listItem.add(new WalkthroughModel("Mengenal Wisata Lampung","",R.drawable.pesawat));
        listItem.add(new WalkthroughModel("page2","",R.drawable.wisata));

        walkthroughAdapter = new WalkthroughAdapter(this, listItem);
        viewPager.setAdapter(walkthroughAdapter);

        tabLayout.setupWithViewPager(viewPager);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = 0;
                position = viewPager.getCurrentItem();
                if (position < listItem.size()){
                    position++;
                    viewPager.setCurrentItem(position);
                }

                if (position == listItem.size() - 1){
                    btnLanjut.setVisibility(View.INVISIBLE);
                    tabLayout.setVisibility(View.INVISIBLE);
                    btnMulai.setVisibility(View.VISIBLE);

                    btnMulai.setAnimation(btnMulaiAnimation);
                }
            }
        });

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferences.setFirstLogin(true, getBaseContext());
                startActivity(new Intent(WalkThrough.this, MainActivity.class));
                finish();
            }
        });
    }
}