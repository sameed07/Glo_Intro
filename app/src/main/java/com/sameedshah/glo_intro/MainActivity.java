package com.sameedshah.glo_intro;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    SliderAdapter sliderAdapter;
    LinearLayout linearLayout;
    TextView[] mDots;
    Button btnNext,btnBack;
    int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.mViewPager);
        linearLayout = findViewById(R.id.dotLayout);

        btnNext = findViewById(R.id.btnNext);
        btnBack = findViewById(R.id.btnBack);

        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
       // addDotsIndecator(0);

    }
}
