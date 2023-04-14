package com.example.doit_08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        setTitle("메인 메뉴");

        Button btnCustom = (Button) findViewById(R.id.btnCustomer);
        Button btnSales = (Button) findViewById(R.id.btnSales);
        Button btnGoods = (Button) findViewById(R.id.btnGoods);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainMenu.this, Customer.class), 110);
                Toast.makeText(getApplicationContext(), "메인메뉴 -> 고객 관리", Toast.LENGTH_SHORT).show();
            }
        });

        btnSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainMenu.this, Sales.class), 120);
                Toast.makeText(getApplicationContext(), "메인메뉴 -> 매출 관리", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainMenu.this, Goods.class), 130);
                Toast.makeText(getApplicationContext(), "메인메뉴 -> 상품 관리", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
