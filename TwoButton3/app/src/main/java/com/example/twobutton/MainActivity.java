package com.example.twobutton;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton,logoutbutton,btn;
    private TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginbutton = (Button) findViewById(R.id.loginbtnId);
        logoutbutton = (Button) findViewById(R.id.logoutbtnId);
        


    }

    public void whenclicked(View v)
    {
        if(v.getId()==R.id.loginbtnId)
        {
            myText.setText("Login Successful!");
        }
        else if (v.getId()==R.id.logoutbtnId)
        {
            myText.setText("Don't Logout!!");
        }
    }
}
