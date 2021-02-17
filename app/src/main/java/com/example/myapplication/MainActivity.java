package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewName = findViewById(R.id.textViewName);
        final TextView textViewInfo = findViewById(R.id.textViewInfo);
        final ImageButton button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textViewName.setText("Владислав Собко ");
                textViewInfo.setText("ІПЗс-19-1, Інженерія програмного забезпечення");
            }
        });
    }
}
