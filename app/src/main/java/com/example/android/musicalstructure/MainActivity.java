package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Duck activity
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        ImageView ducks = (ImageView) findViewById(R.id.duck_activity);

        // Set a click listener on that View
        ducks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ducksIntent = new Intent(MainActivity.this, DuckActivity.class);

                // Start the new activity
                startActivity(ducksIntent);
            }
        });

        //Cow activity


        // Find the View that shows the numbers category
        ImageView cows = (ImageView) findViewById(R.id.cow_activity);

        // Set a click listener on that View
        cows.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cowsIntent = new Intent(MainActivity.this, CowActivity.class);

                // Start the new activity
                startActivity(cowsIntent);
            }
        });

        //pig activity


        // Find the View that shows the numbers category
        ImageView pigs = (ImageView) findViewById(R.id.pig_activity);

        // Set a click listener on that View
        pigs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent pigsIntent = new Intent(MainActivity.this, PigActivity.class);

                // Start the new activity
                startActivity(pigsIntent);
            }
        });

        //dog activity


        // Find the View that shows the numbers category
        ImageView dogs = (ImageView) findViewById(R.id.dog_activity);

        // Set a click listener on that View
        dogs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent dogsIntent = new Intent(MainActivity.this, DogActivity.class);

                // Start the new activity
                startActivity(dogsIntent);
            }
        });

    }
}
