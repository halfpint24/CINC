package com.example.cinc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

    }

    public void onPrevPress(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void onVideo1Press(View view) {

        Intent intent = new Intent(this, VideoPage1Activity.class);
        startActivity(intent);

    }

    public void onVideo2Press(View view) {

        Intent intent = new Intent(this, VideoPage2Activity.class);
        startActivity(intent);

    }

    public void onVideo3Press(View view) {

        Intent intent = new Intent(this, VideoPage3Activity.class);
        startActivity(intent);

    }

    public void onVideo4Press(View view) {

        Intent intent = new Intent(this, VideoPage4Activity.class);
        startActivity(intent);

    }

}