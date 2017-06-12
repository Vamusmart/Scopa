package com.example.android.scopa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;

    int scorePlayer2 = 0;

    public void resetScores (View view){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Add 1 points to Player 1
     */
    public void addOnePointsForPlayer1  (View view){
        displayForPlayer1(1);
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1 (scorePlayer1);
    }

    /**
     * Add 1 points to Player 2
     */
    public void addOnePointsForPlayer2  (View view){
        displayForPlayer2(1);
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2 (scorePlayer2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayer1(0);
    }
    /**
     * Displays the given score for Player 1
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Player 2
     */
    public void displayForPlayer2 (int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }
}
