package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private LinearLayout bangladesh,india,usa,pakistan,canada,australia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladesh = findViewById(R.id.bangladeshId);
        india = findViewById(R.id.indiaId);
        usa = findViewById(R.id.usaid);
        pakistan = findViewById(R.id.pakistanId);
        canada = findViewById(R.id.canadaId);
        australia = findViewById(R.id.australiaId);

        bangladesh.setOnClickListener(this);
        india.setOnClickListener(this);
        usa.setOnClickListener(this);
        pakistan.setOnClickListener(this);
        canada.setOnClickListener(this);
        australia.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String s = null;
        int image = 0;
        if(v.getId()==R.id.bangladeshId)
        {
            s=getString(R.string.bangladesh_text);
            image = R.drawable.bangladesh;
        }
        else if(v.getId()==R.id.indiaId)
        {
            s=getString(R.string.india_text);
            image = R.drawable.india;
        }
        else if(v.getId()==R.id.usaid)
        {
            s=getString(R.string.usa_text);
            image = R.drawable.usa;
        }
        else if(v.getId()==R.id.pakistanId)
        {
            s=getString(R.string.pakistan_text);
            image = R.drawable.pakistan;
        }
        else if(v.getId()==R.id.canadaId)
        {
            s=getString(R.string.canada_text);
            image = R.drawable.canada;
        }
        else if(v.getId()==R.id.australiaId)
        {
            s=getString(R.string.australia_text);
            image = R.drawable.australia;
        }
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("text",s);
        intent.putExtra("images",image);
        startActivity(intent);
    }
}