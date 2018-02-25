package fr.uppa.platscuisines;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import fr.uppa.platscuisines.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public DishViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new DishViewModel();
        binding.setViewModel(viewModel);
    }
}
