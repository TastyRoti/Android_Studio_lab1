package com.example.lab1;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnClick (View view){
        TextView txtHello = findViewById(R.id.textView);
        txtHello.setText("Glory to Heroes!");
    }

    public void OnBtn2Click (View view){
        TextView txtHello = findViewById(R.id.textView);
        txtHello.setTextColor(Color.RED);
    }
     // end
}