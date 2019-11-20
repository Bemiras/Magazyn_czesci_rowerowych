package com.example.sklep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v4.view.ViewPager;



public class AktywnoscGlowna extends AppCompatActivity{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc_glowna);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
    public void buttonClickFunction(View v)
    {
        Intent intent = new Intent(getApplicationContext(), AktywnoscArtykuly.class);
        startActivity(intent);
    }
}
