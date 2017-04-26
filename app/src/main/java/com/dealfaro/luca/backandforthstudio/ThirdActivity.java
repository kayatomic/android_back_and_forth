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
        EditText edv2 = (EditText) findViewById(R.id.editText);
        if (appInfo.string3 != null) {
            edv2.setText(appInfo.string3);
        }

        TextView tv1 = (TextView) findViewById(R.id.stringView1);
        tv1.setText(appInfo.string1);

        TextView tv2 = (TextView) findViewById(R.id.stringView2);
        tv2.setText(appInfo.string2);

    }

    public void saveString(View V) {
        // The second string we store it in the singleton class.
        EditText edv2 = (EditText) findViewById(R.id.editText);
        String text2 = edv2.getText().toString();
        appInfo.setColor("str3", text2);
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

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
