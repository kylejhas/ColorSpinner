package edu.temple.colorspinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);

        final ConstraintLayout background = findViewById(R.id.background);

        String[] colors = {"Red" , "Green", "Blue", "Yellow", "Purple", "Magenta", "Cyan", "Black", "White", "Gray"};

        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);

        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener select = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                background.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));
                spinner.setBackgroundColor(Color.parseColor("White"));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        };
        spinner.setOnItemSelectedListener(select);
    }
}
