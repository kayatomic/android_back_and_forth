package com.dealfaro.luca.backandforthstudio;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by luca on 18/1/2016.
 */
public class AppInfo {

    private static AppInfo instance = null;
    private static final String STRING1 = "str1";
    private static final String STRING2 = "str2";
    private static final String STRING3 = "str3";

    protected AppInfo() {
        // Exists only to defeat instantiation.
    }

    // Here are some values we want to keep global.
    //public String sharedString;
    public String string1, string2, string3;

    private Context my_context;

    public static AppInfo getInstance(Context context) {
        if(instance == null) {
            instance = new AppInfo();
            instance.my_context = context;
            SharedPreferences settings = context.getSharedPreferences(MainActivity.MYPREFS, 0);
            instance.string1 = settings.getString(STRING1, null);
            instance.string2 = settings.getString(STRING2, null);
            instance.string3 = settings.getString(STRING3, null);
        } else {
            instance.my_context = context;
            SharedPreferences settings = context.getSharedPreferences(MainActivity.MYPREFS, 0);
            instance.string1 = settings.getString(STRING1, null);
            instance.string2 = settings.getString(STRING2, null);
            instance.string3 = settings.getString(STRING3, null);
        }
        return instance;
    }

    public void setColor(String key, String value) {
        SharedPreferences settings = my_context.getSharedPreferences(MainActivity.MYPREFS, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }

}
