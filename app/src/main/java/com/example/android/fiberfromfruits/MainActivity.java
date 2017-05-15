package com.example.android.fiberfromfruits;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int resultsWoman = 25;
    int resultsMan = 38;
    int fiberCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateScore(int score){
        fiberCount = fiberCount + score;
        resultsWoman = resultsWoman - score;
        resultsMan = resultsMan - score;
        displayFiber(fiberCount);
        displayForWomen(resultsWoman);
        displayForMen(resultsMan);
    }

    /**
     * Displays the fiber amount to take for women.
     */
    public void displayForWomen(int woman_score) {
        TextView scoreView = (TextView) findViewById(R.id.score_woman);
        scoreView.setText(String.valueOf(woman_score));
    }

    /**
     * Displays the fiber amount to take for men.
     */
    public void displayForMen(int men_score) {
        TextView scoreView = (TextView) findViewById(R.id.score_man);
        scoreView.setText(String.valueOf(men_score));
    }

    /**
     * Displays the total taken fiber amount.
     */
    public void displayFiber(int fiber_amount) {
        TextView scoreView = (TextView) findViewById(R.id.fiber_count);
        scoreView.setText(String.valueOf(fiber_amount));
    }

    /**
     * Reduces fiber worth of 8 grams (Raspberries).
     */
    public void reduceEight(View view) {
        updateScore(8);
    }

    /**
     * Reduces fiber worth of 5 grams (Carrot).
     */
    public void reduceFive(View view) {
        updateScore(5);
    }

    /**
     * Reduces fiber worth of 4 grams (Apple, blueberries, strawberries).
     */

    public void reduceFour(View view) {
        //This is updateScore(4), but I leave here as an additional option, show how it was originally
        fiberCount = fiberCount + 4;
        resultsWoman = resultsWoman - 4;
        resultsMan = resultsMan - 4;
        displayFiber(fiberCount);
        displayForWomen(resultsWoman);
        displayForMen(resultsMan);
    }

    /**
     * Reduces fiber worth of 3 grams (Banana, grapefruit, orange).
     */
    public void reduceThree(View view) {
        updateScore(3);
    }

    /**
     * Reduces fiber worth of 1 gram (Raisins, orange).
     */
    public void reduceOne(View view) {
        updateScore(1);
    }

    /**
     * Resets all values.
     */
    public void resetAll(View view) {
        resultsWoman = 25;
        resultsMan = 38;
        fiberCount = 0;
        displayFiber(fiberCount);
        displayForWomen(resultsWoman);
        displayForMen(resultsMan);
    }
}
