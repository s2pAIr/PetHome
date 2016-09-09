package com.kmutts.pethome.pethome;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by ADMIN PC on 9/9/2559.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
