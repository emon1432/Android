package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.welcomeTextId);
        imageView =findViewById(R.id.flagImageId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String text = bundle.getString("text");
            textView.setText(text);
            int image = bundle.getInt("images");
            imageView.setImageResource(image);
        }
    }
}