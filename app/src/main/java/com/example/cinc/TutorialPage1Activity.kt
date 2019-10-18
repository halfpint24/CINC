package com.example.cinc

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class TutorialPage1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_page1)

        val strings = resources.getStringArray(R.array.contentpage1)
        val textView = findViewById<TextView>(R.id.contentpage1)
        var str = ""

        for (i in strings.indices) {
            str += strings[i] + "\n\n"
        }

        textView.text = str

    }

    fun onPrevPress(view: View) {

        val intent = Intent(this, TutorialActivity::class.java)
        startActivity(intent)

    }

    fun onNextPress(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

}
