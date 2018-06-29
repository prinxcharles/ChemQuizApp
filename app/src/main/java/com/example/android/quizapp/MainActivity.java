package com.example.android.quizapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * These (radioGroup1, radioGroup2, ...) variable defines the radio groups for each of the questions.
     * Note: It was declared a global variable because it would be accessed by the submitAnswers and reset methods
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defines a variable for the button for displaying the correct answer. It is set as false so the user can view Answers before submitting
        Button show_answer = (Button) findViewById(R.id.show_answer);
        show_answer.setClickable(false);
    }

    /**
     * This method is called when the submit button is clicked.
     * HINT
     * * The Answers to the Questions are outlined below
     * Question 1 = A
     * Question 2 = C
     * Question 3 = B
     * Question 4 = C
     * Question 5 = A
     * Question 6 = D
     * Question 7 = D
     * Question 8 = C
     * Question 9 = B
     * Question 10 = A
     **/

    public void submitAnswers(View view) {
        // Find's out the user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable name = nameField.getText();

        //Figures out if the user got question 1 correctly
        RadioButton question1CorrectAnswer = (RadioButton) findViewById(R.id.radio_A1);
        boolean q1correct = question1CorrectAnswer.isChecked();

        //Figures out if the user got question 2 correctly
        RadioButton question2CorrectAnswer = (RadioButton) findViewById(R.id.radio_C2);
        boolean q2correct = question2CorrectAnswer.isChecked();

        //Figures out if the user got question 3 correctly
        RadioButton question3CorrectAnswer = (RadioButton) findViewById(R.id.radio_B3);
        boolean q3correct = question3CorrectAnswer.isChecked();

        //Figures out if the user got question 4 correctly
        RadioButton question4CorrectAnswer = (RadioButton) findViewById(R.id.radio_C4);
        boolean q4correct = question4CorrectAnswer.isChecked();

        //Figures out if the user got question 5 correctly
        RadioButton question5CorrectAnswer = (RadioButton) findViewById(R.id.radio_A5);
        boolean q5correct = question5CorrectAnswer.isChecked();

        //Figures out if the user got question 6 correctly
        RadioButton question6CorrectAnswer = (RadioButton) findViewById(R.id.radio_D6);
        boolean q6correct = question6CorrectAnswer.isChecked();

        //Figures out if the user got question 7 correctly
        RadioButton question7CorrectAnswer = (RadioButton) findViewById(R.id.radio_D7);
        boolean q7correct = question7CorrectAnswer.isChecked();

        //Figures out if the user got question 8 correctly
        RadioButton question8CorrectAnswer = (RadioButton) findViewById(R.id.radio_C8);
        boolean q8correct = question8CorrectAnswer.isChecked();

        //Figures out if the user got question 9 correctly
        RadioButton question9CorrectAnswer = (RadioButton) findViewById(R.id.radio_B9);
        boolean q9correct = question9CorrectAnswer.isChecked();

        //Figures out if the user got question 10 correctly
        RadioButton question10CorrectAnswer = (RadioButton) findViewById(R.id.radio_A10);
        boolean q10correct = question10CorrectAnswer.isChecked();

        /** Passes the booleans for the correct answers as input parameters into the collateScore method
         * Which computes the number of questions answered correctly and returns a total score, stored in variable score
         *
         */
        int score = collateScore(q1correct, q2correct, q3correct, q4correct, q5correct,
                q6correct, q7correct, q8correct, q9correct, q10correct);

        /* Passes the Name from the User Input and the collated score to the resultSummary method
          Which returns different strings for diplay based on User's performance
         */
        String result = (String) resultSummary(name, score);
        // Displays the User's score summary
        Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show();

        //Makes the radio buttons for The questions unclickable after submitting (but clickable on reset)

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);
        radioGroup1.setClickable(false);

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio_group_2);
        radioGroup2.setClickable(false);

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group_3);
        radioGroup3.setClickable(false);

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radio_group_4);
        radioGroup4.setClickable(false);

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radio_group_5);
        radioGroup5.setClickable(false);

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radio_group_6);
        radioGroup6.setClickable(false);

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radio_group_7);
        radioGroup7.setClickable(false);

        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radio_group_8);
        radioGroup8.setClickable(false);

        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radio_group_9);
        radioGroup9.setClickable(false);

        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radio_group_10);
        radioGroup10.setClickable(false);

        // defines a variable for the button for displaying the correct answer.
        Button show_answer = (Button) findViewById(R.id.show_answer);
        show_answer.setClickable(true);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setClickable(false);

    }

    /**
     * Calculates the total score for all the correct answers.
     *
     * @param ans1 specifies if the answer for  Question 1 was checked
     * @param ans6 specifies if the answer for  Question 6 was checked
     *             * Same logic goes for ans2, ans3, ans4, ans5, ans7, ans8, ans 9 & ans10
     * @return = final score
     */
    private int collateScore(boolean ans1, boolean ans2, boolean ans3, boolean ans4, boolean ans5, boolean ans6,
                             boolean ans7, boolean ans8, boolean ans9, boolean ans10) {
        int scoreCount = 0;
        // Adds 1 point to total score if Question 1 is answered correctly
        if (ans1 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 2 is answered correctly
        if (ans2 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 3 is answered correctly
        if (ans3 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 4 is answered correctly
        if (ans4 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 5 is answered correctly
        if (ans5 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 6 is answered correctly
        if (ans6 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 7 is answered correctly
        if (ans7 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 8 is answered correctly
        if (ans8 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 9 is answered correctly
        if (ans9 == true) {
            scoreCount = scoreCount + 1;
        }
        // Adds 1 point to total score if Question 10 is answered correctly
        if (ans10 == true) {
            scoreCount = scoreCount + 1;
        }
        return scoreCount;
    }


    @SuppressLint("StringFormatMatches")
    private String resultSummary(Editable name, int score) {
        String resultMessage;
        // Message to be displayed if the User gets all 10 correctly
        if (score == 10) {
            resultMessage = getString(R.string.perfect_score, name);
        }
        // Message to be displayed if the User gets 9 out of 10 correctly
        else if (score == 9) {
            resultMessage = getString(R.string.almost_perfect, name, score);
        }
        // Message to be displayed if the User gets between 5 and 8 correctly
        else if (score > 4) {
            resultMessage = getString(R.string.average, name, score);
        }
        // Message to be displayed if the User gets less than 4 correctly
        else {
            resultMessage = getString(R.string.poor, name, score);
        }
        return resultMessage;

    }

    public void show_answer(View view) {
        // Displays a toast containing the answer to all the questions
        Toast.makeText(this, getString(R.string.display_answer), Toast.LENGTH_LONG).show();
    }

    public void reset(View view) {

        /**sets clickability and clears the answer choices on reset
         * Hint: radiogroup1 stands for Question 1, radiogroup4 for Question 4 etc.
         */
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);
        radioGroup1.clearCheck();
        radioGroup1.setClickable(true);

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio_group_2);
        radioGroup2.clearCheck();
        radioGroup2.setClickable(true);

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group_3);
        radioGroup3.clearCheck();
        radioGroup3.setClickable(true);

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radio_group_4);
        radioGroup4.clearCheck();
        radioGroup4.setClickable(true);

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radio_group_5);
        radioGroup5.clearCheck();
        radioGroup5.setClickable(true);

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radio_group_6);
        radioGroup6.clearCheck();
        radioGroup6.setClickable(true);

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radio_group_7);
        radioGroup7.clearCheck();
        radioGroup7.setClickable(true);

        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radio_group_8);
        radioGroup8.clearCheck();
        radioGroup8.setClickable(true);

        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radio_group_9);
        radioGroup9.clearCheck();
        radioGroup9.setClickable(true);

        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radio_group_10);
        radioGroup10.clearCheck();
        radioGroup10.setClickable(true);

        // defines a variable for the button for displaying the correct answer.
        Button show_answer = (Button) findViewById(R.id.show_answer);
        show_answer.setClickable(false);

        //activates the submit button on reset
        Button submit = (Button) findViewById(R.id.submit);
        submit.setClickable(true);
    }
}
