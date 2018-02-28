package fr.uppa.platscuisines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import fr.uppa.platscuisines.db.DishDAO;
import fr.uppa.platscuisines.models.Dish;

public class DishViewActivity extends AppCompatActivity {
    @Inject
    DishDAO dishDAO;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_view);
    }
}
