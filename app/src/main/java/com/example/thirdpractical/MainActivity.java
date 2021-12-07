package com.example.thirdpractical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSecondActivity = findViewById(R.id.btnSecondActivity);
        btnSecondActivity.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(activity2Intent);
        });
    }
}