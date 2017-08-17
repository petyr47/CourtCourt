package com.example.peter.courtcourt;

import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int pointsA =0;
    int pointsB =0;
    int yellowA=0;
    int yellowB=0;
    int redA=0;
    int redB=0;
    int time0=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(pointsA);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void team_a_3(View v) {
        pointsA++;
        displayForTeamA(pointsA);

    }
    public void team_a_2(View v) {
        pointsA=pointsA+2;
        displayForTeamA(pointsA);

    }
    public void team_a_1(View v) {
        pointsA=pointsA+1;
        displayForTeamA(pointsA);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamByellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAyellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void team_b_yellow(View v) {
        yellowB++;
        displayForTeamByellow(yellowB);

    }
    public void team_b_red(View v) {
        redB++;
        displayForTeamBred(redB);

    }
    public void team_b_goal(View v) {
        pointsB=pointsB+1;
        displayForTeamB(pointsB);

    }
    public void team_a_red(View v) {
        redA++;
        displayForTeamAred(redA);

    }
    public void team_a_yellow(View v) {
        yellowA++;
        displayForTeamAyellow(yellowA);

    }


    public void startChronometer(View view){
        ((Chronometer) findViewById(R.id.chronometer)).start();
        Chronometer.setBase(SystemClock.elapsedRealtime());
        Chronometer.start();
    }

    public void reset(View v) {
        pointsB=0;
        pointsA=0;
        yellowA=0;
        yellowB=0;
        redA=0;
        redB=0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
        displayForTeamByellow(yellowB);
        displayForTeamBred(redB);
        displayForTeamAyellow(yellowA);
        displayForTeamAred(redA);





    }
}
