package com.abc.phongnguyen.duan_cafemanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class choosed extends AppCompatActivity {
    Button btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosed);
        btnthoat = (Button) findViewById(R.id.btnthoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void login2(View view) {
        Intent intent = new Intent(choosed.this, MainActivity.class);
        startActivity(intent);
    }

    public void intro(View view) {
        Intent intent = new Intent(choosed.this, IntroActivity.class);
        startActivity(intent);
    }

    }

