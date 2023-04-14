package com.example.doit_08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Customer extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);
        setTitle("고객 관리");

        Button btnBackMenu = (Button) findViewById(R.id.btnBackMenu);
        Button btnBackLogin = (Button) findViewById(R.id.btnBackLogin);

        btnBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Customer.this, MainMenu.class), 111);
                Toast.makeText(getApplicationContext(), "고객 관리 -> 메인 메뉴", Toast.LENGTH_SHORT).show();
            }
        });

        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Customer.this, MainActivity.class), 112);
                Toast.makeText(getApplicationContext(), "고객 관리 -> 로그인", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
