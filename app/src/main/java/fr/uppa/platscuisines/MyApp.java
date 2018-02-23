package fr.uppa.platscuisines;

import android.app.Application;
import android.content.Context;

/**
 * Created by mbsanchez on 23/02/2018.
 */

public class MyApp extends Application {
    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return appContext;
    }
}
