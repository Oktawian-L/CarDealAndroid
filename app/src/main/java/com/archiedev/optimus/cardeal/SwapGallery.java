package com.archiedev.optimus.cardeal;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SwapGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap_gallery);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
    }
}
