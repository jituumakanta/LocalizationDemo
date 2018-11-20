package com.model.localizationdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Locale;

import static com.model.localizationdemo.config.i;

public class MainActivity extends AppCompatActivity {
//int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        changeLang(this,"fr");
        if(i==0){
        recreate();
        i++;}

    }

    /**
     * it will reset the language
     * then u have to reload the activity after reset by calling the method recreate();
     * @param context
     * @param lang
     */
    public static void changeLang(Context context, String lang) {
        Locale myLocale = new Locale(lang);
        Log.d("MYLOG", "MainActivity: changeLang: myLocale: "+myLocale);
        Locale.setDefault(myLocale);
        android.content.res.Configuration config = new android.content.res.Configuration();
        config.locale = myLocale;
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
    }
}
