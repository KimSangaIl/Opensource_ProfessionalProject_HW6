package com.example.doit_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtID, edtPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("로그인하기");

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        edtID = (EditText) findViewById(R.id.edtID);
        edtPW = (EditText) findViewById(R.id.edtPW);

        edtID.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkID()){
                    startActivityForResult(new Intent(MainActivity.this, MainMenu.class), 100);
                }
                else {
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean checkID() {
        String ID = edtID.getText().toString();
        String PW = edtPW.getText().toString();

        if (ID.length() < 1 || PW.length() < 1) {
            return false;
        }
        else {
            return true;
        }
    }


}