package com.example.kevy9099.trivialgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.button1);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        openEasyQuestions();
      }
    });

    button = findViewById(R.id.button2);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        openHardQuestions();
      }
    });

    button = findViewById(R.id.button3);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        openInformation();
      }
    });
  }

  private void openEasyQuestions() {
    Intent intent1 = new Intent(this, EasyQuestions.class);
    startActivity(intent1);
  }

  private void openHardQuestions() {
    Intent intent2 = new Intent(this, HardQuestions.class);
    startActivity(intent2);
  }

  private void openInformation() {
    Intent intent3 = new Intent(this, Information.class);
    startActivity(intent3);
  }
}
