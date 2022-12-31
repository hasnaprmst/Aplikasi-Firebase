package com.example.aplikasifirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aplikasifirebase.TambahMhsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //create procedure pindah to TambahMhsActivity
    public void pindah(View v) {
        Intent intent = new Intent(MainActivity.this, TambahMhsActivity.class);
        startActivity(intent);
    }
    public void pindah1(View v) {
        Intent intent = new Intent(MainActivity.this, ListMhsActivity.class);
        startActivity(intent);
    }

}