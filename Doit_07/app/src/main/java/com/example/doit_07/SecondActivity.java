package com.example.doit_07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("메인 메뉴");

        Button btnCustom = (Button) findViewById(R.id.btnCustomer);
        Button btnSales = (Button) findViewById(R.id.btnSales);
        Button btnGoods = (Button) findViewById(R.id.btnGoods);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SecondActivity.this, MainActivity.class), 1);
                Toast.makeText(getApplicationContext(), "고객 관리", Toast.LENGTH_SHORT).show();
            }
        });

        btnSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SecondActivity.this, MainActivity.class), 2);
                Toast.makeText(getApplicationContext(), "매출 관리", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SecondActivity.this, MainActivity.class), 3);
                Toast.makeText(getApplicationContext(), "상품 관리", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
