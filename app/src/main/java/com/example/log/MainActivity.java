package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    EditText ed1;
     EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.login2);
         ed1 = (EditText) findViewById(R.id.inputEmail);
        ed2 = (EditText)findViewById(R.id.inputPassword);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("root") &&
                        ed2.getText().toString().equals("root")) {
                    String name = ed1.getText().toString();
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),"Welcome "+name,Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
    public void toRegister(View view) {
        startActivity(new Intent(getApplicationContext(),Register.class));
    }


}