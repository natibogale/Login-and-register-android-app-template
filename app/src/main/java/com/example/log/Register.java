package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button b1;
    Button b2;
    EditText ed1;
    EditText ed2;
    EditText ed4;
    EditText ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);





        b1 = (Button)findViewById(R.id.login2);
        ed1 = (EditText) findViewById(R.id.inputEmail10);
        ed2 = (EditText)findViewById(R.id.inputPassword);
        ed3 = (EditText)findViewById(R.id.inputPassword8);
        ed4 = (EditText)findViewById(R.id.inputEmail);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("") || ed2.getText().toString().equals("")  || ed3.getText().toString().equals("") || ed4.getText().toString().equals("")) {

                    Toast.makeText(getApplicationContext(),"Please Fill all fields",Toast.LENGTH_SHORT).show();

                }
                else if( !ed2.getText().toString().equals(ed3.getText().toString()) )
                {
                    Toast.makeText(getApplicationContext(),"Passwords are not similar.",Toast.LENGTH_SHORT).show();
                }
                else{
                    String uname = ed4.getText().toString();
                    Toast.makeText(getApplicationContext(), "Thanks for registering " + uname +"\n You can login with your credentials" ,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));

                }
            }
        });
    }

    public void toLogin(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
