package fr.uppa.platscuisines;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import fr.uppa.platscuisines.db.DishDAO;
import fr.uppa.platscuisines.db.SQLiteDB;

/**
 * Created by mbsanchez on 24/02/2018.
 */

@Module
public class AppModule {
    private Context context;

    public AppModule(Application app) {
        this.context = app;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    public DishDAO provideDishDAO(){
        return SQLiteDB.getInstance().getDishDao();
    }
}
