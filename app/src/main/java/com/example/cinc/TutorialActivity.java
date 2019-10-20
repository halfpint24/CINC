package com.example.cinc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    public void onPrevPress(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void onNextPress(View view) {

        Intent intent = new Intent(this, TutorialPage1Activity.class);
        startActivity(intent);

    }

    public void onPage2Press(View view) {

        Intent intent = new Intent(this, TutorialPage2Activity.class);
        startActivity(intent);

    }

}