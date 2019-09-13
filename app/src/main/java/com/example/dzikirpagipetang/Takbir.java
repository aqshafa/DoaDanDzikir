package com.example.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Takbir extends AppCompatActivity {

    TextView tvDigit;
    Button btnPress, btnSelesai, btnReset;
    private int tambahAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takbir);
        tvDigit = findViewById(R.id.tv_digit1);
        btnSelesai = findViewById(R.id.btn_selesai);
        btnPress = findViewById(R.id.btn_press1);
        btnReset = findViewById(R.id.btn_reset2);
        getSupportActionBar().setTitle("Takbir");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = 0;
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Takbir.this, DzikirSetelahSholat.class));
                finish();
            }
        });

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDigit.setText(String.valueOf(tambahAngka));
                if (tambahAngka >= 33){
                    Toast.makeText(Takbir.this,"Succes di tekan", Toast.LENGTH_SHORT).show();
                    btnSelesai.setVisibility(View.VISIBLE);
                }else{
                    tambahAngka = tambahAngka+1;
                    btnSelesai.setVisibility(View.GONE);
                }
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });
    }
}
