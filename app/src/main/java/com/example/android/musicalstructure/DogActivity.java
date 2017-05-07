package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dog);


        // Find the View that shows the home image
        ImageView homeButton = (ImageView) findViewById(R.id.home_button);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home image is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the main activity.
                Intent homeButtonIntent = new Intent(DogActivity.this, MainActivity.class);

                // Start the main activity
                startActivity(homeButtonIntent);
            }
        });


        // Play dog sound on image click
        ImageView dogButton = (ImageView) findViewById(R.id.dog_button);

        // Create media player which play dog sound.
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dog);

        //  // Set a click listener on dog image.
        dogButton.setOnClickListener(new View.OnClickListener() {
            //start player with dog sound
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });


    }


}
