package com.example.thirdpractical;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnFirstActivity = findViewById(R.id.btnFirstActivity);
        btnFirstActivity.setOnClickListener(v -> {
            Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(activity2Intent);

            int backStackCount = getSupportFragmentManager().getBackStackEntryCount();

            for (int i = 0; i < backStackCount; i++) {
                int backStackId = getSupportFragmentManager().getBackStackEntryAt(i).getId();
                getSupportFragmentManager().popBackStack(backStackId,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
        });
    }
}