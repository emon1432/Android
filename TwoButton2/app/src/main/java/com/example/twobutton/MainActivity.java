package com.example.twobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton,logoutbutton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginbutton = (Button) findViewById(R.id.loginbtnId);
        logoutbutton = (Button) findViewById(R.id.logoutbtnId);
        textView = (TextView) findViewById(R.id.msgId);


        tipatipi tipo = new tipatipi();

        loginbutton.setOnClickListener(tipo);
        logoutbutton.setOnClickListener(tipo);


    }

    class tipatipi implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.loginbtnId)
            {
                textView.setText("Login button tipo kn?");
            }
            else if(v.getId()==R.id.logoutbtnId)
            {
                textView.setText("Logout button tipo na!");
            }
        }
    }


}
