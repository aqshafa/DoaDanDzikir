package com.example.dzikirpagipetang;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPagi, btnPetang, btnDoa, btnSholat, btnAbout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPagi = findViewById(R.id.dzikirpagi);
        btnPetang = findViewById(R.id.dzikirpetang);
        btnDoa = findViewById(R.id.doaharian);
        btnSholat = findViewById(R.id.dzikirsetelahsholat);
        btnAbout = findViewById(R.id.about);

        btnPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailDzikir.class);
                intent.putExtra("KEY", "pagi");
                startActivity(intent);
            }
        });

        btnPetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailDzikir.class);
                intent.putExtra("KEY", "petang");
                startActivity(intent);
            }
        });

        btnSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DzikirSetelahSholat.class);
                startActivity(intent);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailDoa.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });



    }

}
