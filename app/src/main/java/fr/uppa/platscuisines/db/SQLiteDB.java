package fr.uppa.platscuisines.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import fr.uppa.platscuisines.MyApp;
import fr.uppa.platscuisines.models.Dish;

/**
 * Created by mbsanchez on 22/02/2018.
 */

@Database(entities = Dish.class, version = 1)
public abstract class SQLiteDB extends RoomDatabase {
    private static SQLiteDB instance = null;

    public static synchronized SQLiteDB getInstance() {
        if (instance == null) {
            instance = Room.databaseBuilder(MyApp.getAppContext(),
                    SQLiteDB.class,
                    "bdplatscuisines.db")
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }
}
