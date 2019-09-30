package edu.temple.colorspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] colors = {"Red" , "Green", "Blue", "Yellow", "Purple", "Magenta", "Cyan", "Black", "White", "Gray"};

        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);
    }
}
