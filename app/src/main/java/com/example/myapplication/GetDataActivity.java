package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class GetDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        TextView txtInfo = (TextView)findViewById(R.id.textViewUserInfo);
        String user =  getIntent().getStringExtra("userName");;
        String age =  getIntent().getStringExtra("userAge");
        txtInfo.setText(user + " - " + age);
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
                Intent intent = new Intent(GetDataActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.lab2_page:
                Intent intent2 = new Intent(GetDataActivity.this, SendActivity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }
}
