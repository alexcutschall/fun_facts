package com.example.alexcutschall.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layouts to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the TextView with a new fact
                String fact = factBook.getFact();
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}