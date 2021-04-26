package com.example.myfirstapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.phone_et);
        password = findViewById(R.id.password_et);
        login = findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            int counter =0;
            @Override
            public void onClick(View view) {

                String e = email.getText().toString();
                String p = password.getText().toString();
                if(e.equals("Mariam")&&p.equals("12345")){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);

                }
            else {
            counter ++;
            if(counter==5){
            login.setEnabled(false);
                Toast.makeText(MainActivity.this, "Invalied", Toast.LENGTH_SHORT).show();
            }
            }


            }
        });

    }


        
    }
