package com.example.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih extends AppCompatActivity {

    String idDetail;

    public static final String KEY_MOVIE = "KEY";

    TextView tvDigit;
    Button btnPress, btnTahmid, btnReset;
    private int tambahAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        idDetail = getIntent().getStringExtra(KEY_MOVIE);

        tvDigit = findViewById(R.id.tv_digit1);
        btnTahmid = findViewById(R.id.btn_tahmid);
        btnPress = findViewById(R.id.btn_press1);
        btnReset = findViewById(R.id.btn_reset2);
        getSupportActionBar().setTitle("Tasbih");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = 0;
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });


        btnTahmid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih.this,Tahmid.class));
                finish();
            }
        });

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDigit.setText(String.valueOf(tambahAngka));
                if (tambahAngka >= 33){
                    Toast.makeText(Tasbih.this,"Succes di tekan", Toast.LENGTH_SHORT).show();
                    btnTahmid.setVisibility(View.VISIBLE);
                }else{
                    tambahAngka = tambahAngka+1;
                    btnTahmid.setVisibility(View.GONE);
                }
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });
    }
}
