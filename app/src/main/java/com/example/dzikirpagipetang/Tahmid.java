package com.example.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tahmid extends AppCompatActivity {

    TextView tvDigit;
    Button btnPress, btnTakbir, btnReset;
    private int tambahAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmid);
        tvDigit = findViewById(R.id.tv_digit1);
        btnTakbir = findViewById(R.id.btn_takbir);
        btnPress = findViewById(R.id.btn_press1);
        btnReset = findViewById(R.id.btn_reset2);
        getSupportActionBar().setTitle("Tahmid");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = 0;
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });

        btnTakbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tahmid.this,Takbir.class));
                finish();
            }
        });

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDigit.setText(String.valueOf(tambahAngka));
                if (tambahAngka >= 33){
                    Toast.makeText(Tahmid.this,"Succes di tekan", Toast.LENGTH_SHORT).show();
                    btnTakbir.setVisibility(View.VISIBLE);
                }else{
                    tambahAngka = tambahAngka+1;
                    btnTakbir.setVisibility(View.GONE);
                }
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });

    }
}
