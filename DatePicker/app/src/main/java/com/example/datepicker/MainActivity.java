package com.example.datepicker;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.currentdateid);
        button = findViewById(R.id.dateSelectBTNid);
        datePicker = findViewById(R.id.datepickerid);
        textView.setText("Current Date : "+currentDate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Current Date : "+currentDate());
                Toast.makeText(MainActivity.this, "Date Changed Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
        return  stringBuilder.toString();
    }
}