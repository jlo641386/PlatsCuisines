package fr.uppa.platscuisines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import fr.uppa.platscuisines.models.Dish;

public class DisplayDishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dish);

        Dish dish = (Dish) getIntent().getSerializableExtra("dish");
        TextView dishNameView = findViewById(R.id.dishNameText);
        ListView packList = findViewById(R.id.listPacks);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1);

        if(dish.getConditionnePour2()==1)
            adapter.add(getString(R.string.packof2));
        if(dish.getConditionnePour4()==1)
            adapter.add(getString(R.string.packof4));
        if(dish.getConditionnePour6()==1)
            adapter.add(getString(R.string.packof6));
        if(dish.getConditionnePour8()==1)
            adapter.add(getString(R.string.packof8));
        if(dish.getConditionnePour12()==1)
            adapter.add(getString(R.string.packof12));

        packList.setAdapter(adapter);
        dishNameView.setText(dish.getNomPlat());
    }
}
