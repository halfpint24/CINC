package com.example.cinc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTutorialPress(View view) {

        Intent intent = new Intent(this, TutorialActivity.class);
        startActivity(intent);

    }

    public void onVideoPress(View view) {

        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);

    }

    public void onGamePress(View view) {

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);

    }

    public void onForumPress(View view) {

        Intent intent = new Intent(this, ForumActivity.class);
        startActivity(intent);

    }

    public void onAboutPress(View view) {

        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);

    }

}
