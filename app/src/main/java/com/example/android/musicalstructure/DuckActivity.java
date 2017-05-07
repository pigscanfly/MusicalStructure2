package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DuckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_duck);

        // Find the View that shows the numbers category
        ImageView homeButton = (ImageView) findViewById(R.id.home_button);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent homeButtonIntent = new Intent(DuckActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeButtonIntent);
            }
        });

        // Play duck sound on image click
        ImageView duckButton = (ImageView) findViewById(R.id.duck_button);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.duck);

        // Set a click listener on that View
        duckButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });
    }
}
