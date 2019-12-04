package com.example.kevy9099.trivialgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Random;

public class EasyQuestions extends AppCompatActivity {

  private Button btnAnswer1;
  private Button btnAnswer2;
  private Button btnAnswer3;
  private Button btnAnswer4;
  private Button countdownButton;
//  private Button resetButton;

  private TextView question;
  private TextView tvTimer;

  private Random random;

  private final String strStart = "Start";

  private final EQuestions questionsArray = new EQuestions();

  private String answers;

  private final int questionsLength = questionsArray.questionsArray.length;

  private final long startTimeInMillis = 10000;
  private CountDownTimer countDownTimer;
  private boolean timerRunning;
  private long timeLeftInMillis = startTimeInMillis;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_easy_questions);

    tvTimer = findViewById(R.id.tv_timer);
    countdownButton = findViewById(R.id.countdown_button);
//    resetButton = findViewById(R.id.reset_button);

    countdownButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (timerRunning) {
          System.out.println("Timer is Running!");
//          pauseTimer();
        } else {
          startTimer();
          btnAnswer1.setEnabled(true);
          btnAnswer2.setEnabled(true);
          btnAnswer3.setEnabled(true);
          btnAnswer4.setEnabled(true);
        }
      }
    });

//    resetButton.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        resetTimer();
//      }
//    });
    updateTimer();

    random = new Random();

    btnAnswer1 = findViewById(R.id.btn_answer1);
    btnAnswer2 = findViewById(R.id.btn_answer2);
    btnAnswer3 = findViewById(R.id.btn_answer3);
    btnAnswer4 = findViewById(R.id.btn_answer4);

    btnAnswer1.setEnabled(false);
    btnAnswer2.setEnabled(false);
    btnAnswer3.setEnabled(false);
    btnAnswer4.setEnabled(false);

    question = findViewById(R.id.question);

    updateQuestion(random.nextInt(questionsLength));

    btnAnswer1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (btnAnswer1.getText() == answers) {
          updateQuestion(random.nextInt(questionsLength));
          answerIsCorrect();
        } else {
          answerIsWrong();
        }
      }
    });

    btnAnswer2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (btnAnswer2.getText() == answers) {
          updateQuestion(random.nextInt(questionsLength));
          answerIsCorrect();
        } else {
          answerIsWrong();
        }
      }
    });

    btnAnswer3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (btnAnswer3.getText() == answers) {
          updateQuestion(random.nextInt(questionsLength));
          answerIsCorrect();
        } else {
          answerIsWrong();
        }
      }
    });

    btnAnswer4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (btnAnswer4.getText() == answers) {
          updateQuestion(random.nextInt(questionsLength));
          answerIsCorrect();
        } else {
          answerIsWrong();
        }
      }
    });
  }

  private void startTimer() {
    countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
      @Override
      public void onTick(long millisUntilFinished) {
        timeLeftInMillis = millisUntilFinished;
        updateTimer();
      }

      @Override
      public void onFinish() {
        btnAnswer1.setEnabled(false);
        btnAnswer2.setEnabled(false);
        btnAnswer3.setEnabled(false);
        btnAnswer4.setEnabled(false);

        timerRunning = false;
        countdownButton.setText(strStart);
        countdownButton.setVisibility(View.INVISIBLE);
//        resetButton.setVisibility(View.VISIBLE);

        outOfTime();
      }
    }.start();
    timerRunning = true;
//    resetButton.setVisibility(View.INVISIBLE);
    //    String strPause = "Pause";
//    countdownButton.setText(strPause);
  }

//  private void pauseTimer() {
//    countDownTimer.cancel();
//    timerRunning = false;
//
//    countdownButton.setText(strStart);
//    resetButton.setVisibility(View.VISIBLE);
//  }

//  private void resetTimer() {
//    timeLeftInMillis = startTimeInMillis;
//    updateTimer();
//    resetButton.setVisibility(View.INVISIBLE);
//    countdownButton.setVisibility(View.VISIBLE);
//  }

  private void updateTimer() {
    int minutes = (int) (timeLeftInMillis / 1000) / 60;
    int seconds = (int) (timeLeftInMillis / 1000) % 60;

    String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

    tvTimer.setText(timeLeftFormatted);
  }

  private void updateQuestion(int num) {
    question.setText(questionsArray.getQuestion(num));
    btnAnswer1.setText(questionsArray.getChoice1(num));
    btnAnswer2.setText(questionsArray.getChoice2(num));
    btnAnswer3.setText(questionsArray.getChoice3(num));
    btnAnswer4.setText(questionsArray.getChoice4(num));

    answers = questionsArray.getCorrectAnswer(num);
  }

  private void outOfTime() {
    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EasyQuestions.this);
    alertDialogBuilder.setMessage("")
        .setMessage("Time is Up!")
        .setCancelable(false)
        .setPositiveButton("Next Player",
            new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
              }
            });

    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();

  }

  private void answerIsCorrect() {
    countDownTimer.cancel();
    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EasyQuestions.this);
    alertDialogBuilder.setMessage("")
        .setMessage("Correct, Move Forward!")
        .setCancelable(true)
        .setPositiveButton("Next Player",
            new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
              }
            });
    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
  }

  private void answerIsWrong() {
    countDownTimer.cancel();
    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EasyQuestions.this);
    alertDialogBuilder.setMessage("")
        .setMessage("Wrong, Move Back!")
        .setCancelable(false)
        .setPositiveButton("Next Player",
            new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
              }
            });
    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
  }
}

