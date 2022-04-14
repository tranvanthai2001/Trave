package com.example.traveling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChiTietActivity extends AppCompatActivity {

    Button dat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        dat = findViewById(R.id.dat);
        dat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChiTietActivity.this,"Bạn đã đặt thành công", Toast.LENGTH_SHORT).show();
            }
        });

    }
}