package com.example.android.footballcounter;

import android.app.ActionBar;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentContainer;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * goal for Team A.
     */
    int goalTeamA = 0;

    /**
     * foul for Team A.
     */
    int foulTeamA = 0;

    /**
     * pass for Team A.
     */
    int passTeamA = 0;

    /**
     * goal for Team B.
     */
    int goalTeamB = 0;

    /**
     * foul for Team B.
     */
    int foulTeamB = 0;

    /**
     * pass for Team B.
     */
    int passTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for GOAL of Team A is clicked.
     */

    public void goalTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayForTeamA(goalTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for GOAL of Team B is clicked.
     */

    public void goalTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayForTeamB(goalTeamB);
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void display2ForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for FOUL of Team A is clicked.
     */

    public void foulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        display2ForTeamA(foulTeamA);
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void display2ForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for FOUL of Team B is clicked.
     */

    public void foulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        display2ForTeamB(foulTeamB);
    }

    /**
     * Displays the given pass for Team A.
     */
    public void display3ForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_pass);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for PASS of Team A is clicked.
     */

    public void passTeamA(View v) {
        passTeamA = passTeamA + 1;
        display3ForTeamA(passTeamA);
    }

    /**
     * Displays the given pass for Team B.
     */
    public void display3ForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_pass);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shows score for PASS of Team B is clicked.
     */

    public void passTeamB(View v) {
        passTeamB = passTeamB + 1;
        display3ForTeamB(passTeamB);
    }

    public void resetScore(View v) {

        if (goalTeamA > goalTeamB) {
            Toast.makeText(this, R.string.juventus_wins, Toast.LENGTH_SHORT).show();
        }

        if (goalTeamA == goalTeamB) {
            Toast.makeText(this, R.string.draw, Toast.LENGTH_SHORT).show();
        }

        if (goalTeamA < goalTeamB) {
            Toast.makeText(this, R.string.barcelona_wins, Toast.LENGTH_SHORT).show();
        }

               
        goalTeamA = 0;
        goalTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        passTeamA = 0;
        passTeamB = 0;
        displayForTeamA(goalTeamA);
        displayForTeamB(goalTeamB);
        display2ForTeamA(foulTeamA);
        display2ForTeamB(foulTeamB);
        display3ForTeamA(passTeamA);
        display3ForTeamB(passTeamB);
    }

}
