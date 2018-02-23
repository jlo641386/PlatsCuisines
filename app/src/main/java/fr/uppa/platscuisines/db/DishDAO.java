package fr.uppa.platscuisines.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import fr.uppa.platscuisines.models.Dish;

/**
 * Created by mbsanchez on 23/02/2018.
 */

@Dao
public interface DishDAO {
    @Query("SELECT * FROM platscuisines")
    List<Dish> getAll();

    @Query("SELECT * FROM platscuisines WHERE nomPlat LIKE '%' || :name || '%' LIMIT 1")
    Dish findByName(String name);

    @Query("SELECT * FROM platscuisines WHERE idPlat=:id")
    Dish findById(String id);
}
