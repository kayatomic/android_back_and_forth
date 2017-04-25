package com.dealfaro.luca.backandforthstudio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    // Go to first activity
    public void goFirstActivity (View V) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Go to second activity
    public void goSecondActivity (View V) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
