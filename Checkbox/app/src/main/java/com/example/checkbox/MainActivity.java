package com.example.checkbox;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private CheckBox item1,item2,item3;
    private Button btn;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1 = findViewById(R.id.item1_id);
        item2 = findViewById(R.id.item2_id);
        item3 = findViewById(R.id.item3_id);
        btn = findViewById(R.id.button);
        show = findViewById(R.id.show_result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                String s;
                if (item1.isChecked()){
                    s = item1.getText().toString();
                    stringBuilder.append(s+" is ordered.\n");
                }
                if (item2.isChecked()){
                    s = item2.getText().toString();
                    stringBuilder.append(s+" is ordered.\n");
                }
                if (item3.isChecked()){
                    s = item3.getText().toString();
                    stringBuilder.append(s+" is ordered.\n");
                }
                show.setText(stringBuilder);
            }
        });
    }
}