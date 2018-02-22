package fr.uppa.platscuisines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import fr.uppa.platscuisines.models.Dish;
import fr.uppa.platscuisines.models.DishBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleOK(View view){
        Intent intent = new Intent(this, DisplayDishActivity.class);
        EditText dishName = findViewById(R.id.dishName);
        Switch packof2 = findViewById(R.id.packof2);
        Switch packof4 = findViewById(R.id.packof4);
        Switch packof6 = findViewById(R.id.packof6);
        Switch packof8 = findViewById(R.id.packof8);
        Switch packof12 = findViewById(R.id.packof12);

        Dish dish = new DishBuilder().setNomPlat(dishName.getText().toString()).
                setConditionnePour2(packof2.isChecked()?1:0).
                setConditionnePour4(packof4.isChecked()?1:0).
                setConditionnePour6(packof6.isChecked()?1:0).
                setConditionnePour8(packof8.isChecked()?1:0).
                setConditionnePour12(packof12.isChecked()?1:0).createDish();

        intent.putExtra("dish", dish);
        startActivity(intent);
    }
}
