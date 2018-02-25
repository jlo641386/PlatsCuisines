package fr.uppa.platscuisines;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import fr.uppa.platscuisines.models.Dish;
import fr.uppa.platscuisines.models.DishBuilder;

/**
 * Created by mbsanchez on 25/02/2018.
 */

public class DishViewModel extends BaseObservable {
    private Dish dish;

    public DishViewModel() {
        this.dish = new DishBuilder().setNomPlat("Test Dish").setConditionnePour6(1).createDish();
    }

    public Dish getDish(){
        return dish;
    }
}
