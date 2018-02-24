package fr.uppa.platscuisines;

import android.app.Application;
import android.content.Context;

/**
 * Created by mbsanchez on 23/02/2018.
 */

public class MyApp extends Application {
    private static Context appContext;
    private DataComponent dataComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
        dataComponent = DaggerDataComponent.builder().appModule(new AppModule(this)).build();
    }

    public static Context getAppContext() {
        return appContext;
    }

    public DataComponent getDataComponent() {
        return this.dataComponent;
    }
}
