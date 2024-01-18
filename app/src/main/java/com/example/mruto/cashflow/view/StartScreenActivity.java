package com.example.mruto.cashflow.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.mruto.cashflow.R;

/**
 * Created by MRUTO on 3/29/2018.
 */

public class StartScreenActivity extends AppCompatActivity {

    TextView newGame, continueGame, exitGame;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        newGame = (TextView) findViewById(R.id.new_game_text);
        continueGame = (TextView) findViewById(R.id.continue_game_text);
        exitGame = (TextView) findViewById(R.id.exit_game_text);

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(getApplicationContext(), CharacterSelectActivity.class);
                startActivity(newActivity);
                finish();
            }
        });

        continueGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(getApplicationContext(), RatRaceActivity.class);
                startActivity(newActivity);
                finish();
            }
        });

        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(getApplicationContext(), RatRaceActivity.class);
                startActivity(newActivity);
                finish();
            }
        });
    }
}
