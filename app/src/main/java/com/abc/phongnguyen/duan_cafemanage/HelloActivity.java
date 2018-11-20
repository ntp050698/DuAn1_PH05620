package com.abc.phongnguyen.duan_cafemanage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class HelloActivity extends AppCompatActivity {
    TextView tvutv;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hello);
            tvutv = findViewById(R.id.tvutv);

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // chuyển màn hình tại đây
                    Intent intent = new Intent(HelloActivity.this, choosed.class);
                    startActivity(intent);
                    // kết thúc màn hình chào
                    finish();
                }
            },2500);
        }
    }
