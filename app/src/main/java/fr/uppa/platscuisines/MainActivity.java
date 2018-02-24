package fr.uppa.platscuisines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import javax.inject.Inject;

import fr.uppa.platscuisines.db.DishDAO;
import fr.uppa.platscuisines.db.SQLiteDB;
import fr.uppa.platscuisines.models.Dish;
import fr.uppa.platscuisines.models.DishBuilder;

public class MainActivity extends AppCompatActivity {
    @Inject
    DishDAO dishDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApp)getApplication()).getDataComponent().inject(this);
    }

    public void handleOK(View view){
        Intent intent = new Intent(this, DisplayDishActivity.class);
        EditText dishName = findViewById(R.id.dishName);

        //Validate the input
        if(dishName.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Please, enter the Dish Name!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();

            return;
        }

        Dish dish = dishDAO.findByName(dishName.getText().toString());

        if(dish == null){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Unknown Dish, Try again!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();

            return;
        }

        intent.putExtra("dish", dish);
        startActivity(intent);
    }
}
