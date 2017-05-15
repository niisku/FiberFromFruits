package com.example.android.fiberfromfruits;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int results_woman = 25;
    int results_man = 38;
    int fiber_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        fiber_count = fiber_count + 8;
        results_woman = results_woman - 8;
        results_man = results_man - 8;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }

    /**
     * Reduces fiber worth of 5 grams (Carrot).
     */
    public void reduceFive(View view) {
        fiber_count = fiber_count + 5;
        results_woman = results_woman - 5;
        results_man = results_man - 5;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }

    /**
     * Reduces fiber worth of 4 grams (Apple, blueberries, strawberries).
     */

    public void reduceFour(View view) {
        fiber_count = fiber_count + 4;
        results_woman = results_woman - 4;
        results_man = results_man - 4;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }

    /**
     * Reduces fiber worth of 3 grams (Banana, grapefruit, orange).
     */
    public void reduceThree(View view) {
        fiber_count = fiber_count + 3;
        results_woman = results_woman - 3;
        results_man = results_man - 3;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }

    /**
     * Reduces fiber worth of 1 gram (Raisins, orange).
     */
    public void reduceOne(View view) {
        fiber_count = fiber_count + 1;
        results_woman = results_woman - 1;
        results_man = results_man - 1;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }

    /**
     * Resets all values.
     */
    public void resetAll(View view) {
        results_woman = 25;
        results_man = 38;
        fiber_count = 0;
        displayFiber(fiber_count);
        displayForWomen(results_woman);
        displayForMen(results_man);
    }
}
