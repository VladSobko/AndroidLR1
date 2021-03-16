package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.lab1_page:
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.lab2_page:
                Intent intent2 = new Intent(AboutActivity.this, SendActivity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }
}
