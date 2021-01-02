package com.example.customfont;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text3Id);
        typeface = typeface.createFromAsset(getAssets(),"alex_brush/AlexBrush_Regular.ttf");
        textView.setTypeface(typeface);
    }
}