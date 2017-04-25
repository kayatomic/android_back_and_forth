package com.dealfaro.luca.backandforthstudio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final public String MYPREFS = "myprefs";
    static final public String PREF_STRING_1 = "string_1";

    AppInfo appInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appInfo = AppInfo.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        SharedPreferences settings = getSharedPreferences(MainActivity.MYPREFS, 0);
//        String myText = settings.getString(MainActivity.PREF_STRING_1, "");
//        EditText edv = (EditText) findViewById(R.id.editText);
//        edv.setText(myText);

        EditText edv2 = (EditText) findViewById(R.id.editText);
        if (appInfo.string1 != null) {
            edv2.setText(appInfo.string1);
        }

        TextView tv1 = (TextView) findViewById(R.id.stringView1);
        tv1.setText(appInfo.string2);

        TextView tv2 = (TextView) findViewById(R.id.stringView2);
        tv2.setText(appInfo.string3);

    }

    public void saveString(View V) {
//        // Grab the text, and store it in a preference.
//        EditText edv = (EditText) findViewById(R.id.editText);
//        String text1 = edv.getText().toString();
//        SharedPreferences settings = getSharedPreferences(MYPREFS, 0);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putString(PREF_STRING_1, text1);
//        editor.commit();

        // The second string we store it in the singleton class.
        EditText edv2 = (EditText) findViewById(R.id.editText);
        String text2 = edv2.getText().toString();
        appInfo.setColor("str1", text2);
    }

    // Go to second activity
    public void goSecondActivity (View V) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    // Go to third activity
    public void goThirdActivity (View V) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
