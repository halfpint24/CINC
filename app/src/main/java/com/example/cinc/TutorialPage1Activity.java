package com.example.cinc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TutorialPage1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_page1);

        String[] strings = getResources().getStringArray(R.array.contentpage1);
        TextView textView = findViewById(R.id.contentpage1);
        String str = "";

        for(int i = 0; i < strings.length; i++) {
            str += strings[i] + "\n\n";
        }

        textView.setText(str);

    }

    public void onPrevPress(View view) {

        Intent intent = new Intent(this, TutorialActivity.class);
        startActivity(intent);

    }

    public void onNextPress(View view) {

        //Intent intent = new Intent(this, TutorialPage2Activity.class);
        //startActivity(intent);

    }

}
