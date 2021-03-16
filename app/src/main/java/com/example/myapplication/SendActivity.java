package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        final EditText userNameInput = findViewById(R.id.userNameInput);
        final EditText userAgeInput = findViewById(R.id.userAgeInput);
        final Button sendDataButton = findViewById(R.id.sendDataButton);
        sendDataButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SendActivity.this, GetDataActivity.class);
                intent.putExtra("userName", userNameInput.getText().toString());
                intent.putExtra("userAge", userAgeInput.getText().toString());
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.lab1_page:
                Intent intent = new Intent(SendActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.lab2_page:
                Intent intent2 = new Intent(SendActivity.this, SendActivity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }
}
