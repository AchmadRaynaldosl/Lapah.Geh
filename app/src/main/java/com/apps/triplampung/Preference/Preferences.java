package com.apps.triplampung.Preference;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {
    private static String SESSION = "com.apps.TripLampung";
    private static String LOGIN_STATUS = "LOGIN_STATUS";

    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;

    public static void setFirstLogin(boolean firstLogin, Context context){
        preferences = context.getSharedPreferences(SESSION, Context.MODE_PRIVATE);
        editor = preferences.edit();
        editor.putBoolean(LOGIN_STATUS, firstLogin);
        editor.apply();
    }

    public static boolean getStatusLogin(Context context){
        preferences = context.getSharedPreferences(SESSION, Context.MODE_PRIVATE);
        return preferences.getBoolean(LOGIN_STATUS, false);
    }

    public static void setLogOut(Context context){
        preferences = context.getSharedPreferences(SESSION, Context.MODE_PRIVATE);
        editor = preferences.edit();
        editor.remove(LOGIN_STATUS);
        editor.apply();
    }
}
