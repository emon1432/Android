package com.example.twobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginbtn;
    private Button logoutbtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button) findViewById(R.id.loginbtnId);
        logoutbtn = (Button) findViewById(R.id.logoutbtnId);
        textView = (TextView) findViewById(R.id.msgId);


        loginbtn.setOnClickListener(this);
        logoutbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginbtnId)
        {
            textView.setText("Login button is clicked.");
        }
        if(v.getId()==R.id.logoutbtnId)
        {
            textView.setText("Logout button is clicked.");
        }
    }
}
