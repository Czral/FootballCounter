package com.example.android.footballcounter;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    /**
     * TextViews for the displays.
     */
    private TextView scoreTeam_A;
    private TextView scoreTeam_B;
    private TextView foulTeam_A;
    private TextView foulTeam_B;
    private TextView passTeam_A;
    private TextView passTeam_B;

    /**
     *
     */
    private static final String STATE_INTENT_GOAL_A = "saveIntentGoalA";
    private static final String STATE_INTENT_GOAL_B = "saveIntentGoalB";
    private static final String STATE_INTENT_PASS_A = "saveIntentPassA";
    private static final String STATE_INTENT_PASS_B = "saveIntentPassB";
    private static final String STATE_INTENT_FOUL_A = "saveIntentFoulA";
    private static final String STATE_INTENT_FOUL_B = "saveIntentFoulB";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Initialize the TextViews.
         */
        scoreTeam_A = (TextView) findViewById(R.id.team_a_score);
        scoreTeam_B = (TextView) findViewById(R.id.team_b_score);
        foulTeam_A = (TextView) findViewById(R.id.team_a_foul);
        foulTeam_B = (TextView) findViewById(R.id.team_b_foul);
        passTeam_A = (TextView) findViewById(R.id.team_a_pass);
        passTeam_B = (TextView) findViewById(R.id.team_b_pass);


        //Saving state after rotation of the variables.
        if (savedInstanceState == null) {

            Intent saveIntent = getIntent();
            goalTeamA = saveIntent.getIntExtra(STATE_INTENT_GOAL_A, goalTeamA);
            foulTeamA = saveIntent.getIntExtra(STATE_INTENT_FOUL_A, foulTeamA);
            passTeamA = saveIntent.getIntExtra(STATE_INTENT_PASS_A, passTeamA);

            goalTeamB = saveIntent.getIntExtra(STATE_INTENT_GOAL_B, goalTeamB);
            foulTeamB = saveIntent.getIntExtra(STATE_INTENT_FOUL_B, foulTeamB);
            passTeamB = saveIntent.getIntExtra(STATE_INTENT_PASS_B, passTeamB);


        } else {


            goalTeamA = savedInstanceState.getInt(STATE_INTENT_GOAL_A);
            foulTeamA = savedInstanceState.getInt(STATE_INTENT_FOUL_A);
            passTeamA = savedInstanceState.getInt(STATE_INTENT_PASS_A);

            goalTeamB = savedInstanceState.getInt(STATE_INTENT_GOAL_B);
            foulTeamB = savedInstanceState.getInt(STATE_INTENT_FOUL_B);
            passTeamB = savedInstanceState.getInt(STATE_INTENT_PASS_B);


            //Displaying data in the TextViews after rotation.

            scoreTeam_A.setText("" + goalTeamA);
            scoreTeam_B.setText("" + goalTeamB);

            foulTeam_A.setText("" + foulTeamA);
            foulTeam_B.setText("" + foulTeamB);

            passTeam_A.setText("" + passTeamA);
            passTeam_B.setText("" + passTeamB);


        }


    }

    /**
     * Saving state after rotaion.
     *
     * @param savedInstanceState saves the state of variables in rotation.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("saveIntentGoalA", goalTeamA);
        savedInstanceState.putInt("saveIntentFoulA", foulTeamA);
        savedInstanceState.putInt("saveIntentPassA", passTeamA);

        savedInstanceState.putInt("saveIntentGoalB", goalTeamB);
        savedInstanceState.putInt("saveIntentFoulB", foulTeamB);
        savedInstanceState.putInt("saveIntentPassB", passTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int goalTeamA) {
        scoreTeam_A.setText(String.valueOf(goalTeamA));
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
    public void displayForTeamB(int goalTeamB) {
        scoreTeam_B.setText(String.valueOf(goalTeamB));
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
    public void display2ForTeamA(int foulTeamA) {
        foulTeam_A.setText(String.valueOf(foulTeamB));
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
    public void display2ForTeamB(int foulTeamB) {
        foulTeam_B.setText(String.valueOf(foulTeamB));
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
    public void display3ForTeamA(int passTeamA) {
        passTeam_A.setText(String.valueOf(passTeamA));
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
    public void display3ForTeamB(int passTeamB) {
        passTeam_B.setText(String.valueOf(passTeamB));
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
