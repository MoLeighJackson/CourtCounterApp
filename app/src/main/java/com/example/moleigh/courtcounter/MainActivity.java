package com.example.moleigh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add points for Team A.
     */
    public void addThreePointsForTeamA(View v) {
        displayForTeamA(3);
    }

    /**
     * Add points for Team A.
     */
    public void addTwoPointsForTeamA(View v) {
        displayForTeamA(3);
    }

    /**
     * Add points for Team A.
     */
    public void addOnePointForTeamA(View v) {
        displayForTeamA(3);
    }
}
