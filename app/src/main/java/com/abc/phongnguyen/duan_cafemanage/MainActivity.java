package com.abc.phongnguyen.duan_cafemanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edName;
    private EditText edPass;
    private Button btnLogin;
    String strUser, strPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Login");

        edName = (EditText) findViewById(R.id.edName);
        edPass = (EditText) findViewById(R.id.edPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void CheckLogin(View view) {
        strUser = edName.getText().toString();
        strPass = edPass.getText().toString();
        if (strUser.isEmpty() || strPass.isEmpty()) {
            Toast.makeText(getApplicationContext(), "The login name and password is not empty", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_SHORT).show();
            finish();
        }

        if (strUser.equalsIgnoreCase("admin") && strPass.equalsIgnoreCase("1234")) {
            startActivity(new Intent(MainActivity.this, MenuActivity.class));
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Username and password incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}
