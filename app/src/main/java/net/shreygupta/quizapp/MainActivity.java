package net.shreygupta.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ScrollView scroll;

    private int correctAnswers;

    private RadioGroup radioGroupQues1;
    private RadioButton radioButtonAns1;

    private CheckBox question2_1;
    private CheckBox question2_2;
    private CheckBox question2_3;
    private CheckBox question2_4;

    private CheckBox question3_1;
    private CheckBox question3_2;
    private CheckBox question3_3;
    private CheckBox question3_4;

    private RadioGroup radioGroupQues4;
    private RadioButton radioButtonAns4;

    private RadioGroup radioGroupQues5;
    private RadioButton radioButtonAns5;

    private RadioGroup radioGroupQues6;
    private RadioButton radioButtonAns6;

    private EditText question7;

    private CheckBox question8_1;
    private CheckBox question8_2;
    private CheckBox question8_3;
    private CheckBox question8_4;

    private RadioGroup radioGroupQues9;
    private RadioButton radioButtonAns9;

    private RadioGroup radioGroupQues10;
    private RadioButton radioButtonAns10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {

        correctAnswers = 0;

        scroll = (ScrollView) findViewById(R.id.scroll);

        radioGroupQues1 = (RadioGroup) findViewById(R.id.Ques1);
        radioButtonAns1 = (RadioButton) findViewById(R.id.Ans1);

        question2_1 = (CheckBox) findViewById(R.id.Ques2Opt1);
        question2_2 = (CheckBox) findViewById(R.id.Ques2Opt2);
        question2_3 = (CheckBox) findViewById(R.id.Ques2Opt3);
        question2_4 = (CheckBox) findViewById(R.id.Ques2Opt4);

        question3_1 = (CheckBox) findViewById(R.id.Ques3Opt1);
        question3_2 = (CheckBox) findViewById(R.id.Ques3Opt2);
        question3_3 = (CheckBox) findViewById(R.id.Ques3Opt3);
        question3_4 = (CheckBox) findViewById(R.id.Ques3Opt4);

        radioGroupQues4 = (RadioGroup) findViewById(R.id.Ques4);
        radioButtonAns4 = (RadioButton) findViewById(R.id.Ans4);

        radioGroupQues5 = (RadioGroup) findViewById(R.id.Ques5);
        radioButtonAns5 = (RadioButton) findViewById(R.id.Ans5);

        radioGroupQues6 = (RadioGroup) findViewById(R.id.Ques6);
        radioButtonAns6 = (RadioButton) findViewById(R.id.Ans6);

        question7 = (EditText) findViewById(R.id.Ques7);

        question8_1 = (CheckBox) findViewById(R.id.Ques8Opt1);
        question8_2 = (CheckBox) findViewById(R.id.Ques8Opt2);
        question8_3 = (CheckBox) findViewById(R.id.Ques8Opt3);
        question8_4 = (CheckBox) findViewById(R.id.Ques8Opt4);

        radioGroupQues9 = (RadioGroup) findViewById(R.id.Ques9);
        radioButtonAns9 = (RadioButton) findViewById(R.id.Ans9);

        radioGroupQues10 = (RadioGroup) findViewById(R.id.Ques10);
        radioButtonAns10 = (RadioButton) findViewById(R.id.Ans10);
    }

    public void submitResponse(View view) {

        String wrongAnswers = "Check :";
        String answer7 = getResources().getString(R.string.answerSeven);

        if (radioButtonAns1.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q1\n";
        }

        if (question2_1.isChecked() && !(question2_2.isChecked()) && question2_3.isChecked() && !(question2_4.isChecked())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q8\n";
        }

        if (!(question3_1.isChecked()) && question3_2.isChecked() && question3_3.isChecked() && question3_4.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q8\n";
        }

        if (radioButtonAns4.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q4\n";
        }
        if (radioButtonAns5.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q5\n";
        }

        if (radioButtonAns6.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q6\n";
        }

        if (answer7.equalsIgnoreCase(question7.getText().toString())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q7\n";
        }

        if (question8_1.isChecked() && !(question8_2.isChecked()) && question8_3.isChecked() && question8_4.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q8\n";
        }

        if (radioButtonAns9.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q9\n";
        }

        if (radioButtonAns10.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q10\n";
        }

        if (correctAnswers == 10) {
            Toast.makeText(this, "Congrats, All Answers Correct", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Correct Answers: " + correctAnswers + " /10\n" + wrongAnswers, Toast.LENGTH_LONG).show();
        }

        resetQuiz(findViewById(R.id.all));
    }

    public void resetQuiz(View view) {

        correctAnswers = 0;

        radioGroupQues1.clearCheck();

        if (question2_1.isChecked()) {
            question2_1.toggle();
        }

        if (question2_2.isChecked()) {
            question2_2.toggle();
        }

        if (question2_3.isChecked()) {
            question2_3.toggle();
        }

        if (question2_4.isChecked()) {
            question2_4.toggle();
        }

        if (question3_1.isChecked()) {
            question3_1.toggle();
        }

        if (question3_2.isChecked()) {
            question3_2.toggle();
        }

        if (question3_3.isChecked()) {
            question3_3.toggle();
        }

        if (question3_4.isChecked()) {
            question3_4.toggle();
        }

        radioGroupQues4.clearCheck();

        radioGroupQues5.clearCheck();

        radioGroupQues6.clearCheck();

        question7.getText().clear();

        if (question8_1.isChecked()) {
            question8_1.toggle();
        }

        if (question8_2.isChecked()) {
            question8_2.toggle();
        }

        if (question8_3.isChecked()) {
            question8_3.toggle();
        }

        if (question8_4.isChecked()) {
            question8_4.toggle();
        }

        radioGroupQues9.clearCheck();

        radioGroupQues10.clearCheck();

        scroll.fullScroll(ScrollView.FOCUS_UP);
    }
}