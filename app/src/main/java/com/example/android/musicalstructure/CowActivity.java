package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cow);


        // Find the View that shows the home image
        ImageView homeButton = (ImageView) findViewById(R.id.home_button2);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home image is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the main activity.
                Intent homeButtonIntent = new Intent(CowActivity.this, MainActivity.class);

                // Start the main activity
                startActivity(homeButtonIntent);
            }
        });

        // Play cow sound on image click
        ImageView cowButton = (ImageView) findViewById(R.id.cow_button);

        // Create media player which play cow sound.
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cow);

        // Set a click listener on cow image.
        cowButton.setOnClickListener(new View.OnClickListener() {
            //start player with cow sound
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });
    }
}
