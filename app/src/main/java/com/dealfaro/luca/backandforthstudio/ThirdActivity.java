package com.dealfaro.luca.backandforthstudio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    AppInfo appInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        appInfo = AppInfo.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        // Writes the string from main activity.
//        SharedPreferences settings = getSharedPreferences(MYPREFS, 0);
//        String myText = settings.getString(PREF_STRING_1, "");
//        TextView tv = (TextView) findViewById(R.id.stringView1);
//        tv.setText(myText);

        // Writes the String from the singleton object
        TextView stringView1 = (TextView) findViewById(R.id.stringView1);
        stringView1.setText(appInfo.sharedString);

        TextView stringView2 = (TextView) findViewById(R.id.stringView2);
        stringView2.setText(appInfo.sharedString);

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
