package fr.uppa.platscuisines.db;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import fr.uppa.platscuisines.MyApp;

/**
 * Created by mbsanchez on 22/02/2018.
 */

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
