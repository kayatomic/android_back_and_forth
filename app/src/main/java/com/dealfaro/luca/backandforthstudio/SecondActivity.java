package com.dealfaro.luca.backandforthstudio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.dealfaro.luca.backandforthstudio.MainActivity.MYPREFS;
import static com.dealfaro.luca.backandforthstudio.MainActivity.PREF_STRING_1;

public class SecondActivity extends AppCompatActivity {

    AppInfo appInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
        TextView tv2 = (TextView) findViewById(R.id.stringView1);
        tv2.setText(appInfo.sharedString);

    }

    // Go to first activity
    public void goFirstActivity (View V) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Go to third activity
    public void goThirdActivity (View V) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


    public void clickBack(View V) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        // finish();
    }

}
